import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class enduro
{
    public static class Participant implements Comparable<Participant>
    {
        public String name;
        public int last_time;
        public int lap_count;

        Participant(String name)
        {
            this.name = name;
            last_time = 0;
            lap_count = 0;
        }

        @Override
        public int compareTo(Participant other)
        {
            if (lap_count != other.lap_count)
            {
                // higher lap count rank higher
                return other.lap_count - lap_count;
            }
            // earlier finish time rank higher
            return last_time - other.last_time;
        }
    }

    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        int start = time_to_seconds(console.nextLine());

        TreeMap<String, Participant> participants = new TreeMap<>();

        int n = Integer.parseInt(console.nextLine());
        for (int i = 0; i < n; i++)
        {
            String record = console.nextLine();

            // handle seconds, assuming start time is 0
            int seconds = time_to_seconds(record.substring(0, 11)) - start;
            if (seconds < 0)
            {
                // handle past day cases
                seconds += 24 * 60 * 60;
            }

            String name = record.substring(12);
            Participant participant = participants.getOrDefault(name, new Participant(name));
            if (participant.last_time < 3 * 60 * 60)
            {
                // only count up to the first record after race finish
                participant.last_time = seconds;
                participant.lap_count++;
            }
            participants.put(name, participant);
        }

        ArrayList<Participant> result = new ArrayList<>(participants.values());
        result.sort(null);
    
        for (Participant participant : result)
        {
            if (participant.last_time < 3 * 60 * 60)
            {
                // skip DNF cases
                continue;
            }

            System.out.println(participant.lap_count + " " + participant.name);
        }
    }

    public static int time_to_seconds(String time)
    {
        // assume time is in "hh:mm:ss AM/PM" format
        String[] splited = time.split(" ");

        // extract hh:mm:ss
        String[] hms = splited[0].split(":");

        int result = 0;

        // handle hh:mm:ss
        result += Integer.parseInt(hms[0]) % 12 * (60 * 60);
        result += Integer.parseInt(hms[1]) * 60;
        result += Integer.parseInt(hms[2]);

        // handle AM/PM
        if (splited[1].startsWith("P"))
        {
            result += 12 * 60 * 60;
        }

        return result;
    }
}