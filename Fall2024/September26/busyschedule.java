import java.util.Arrays;
import java.util.Scanner;

public class busyschedule
{
    public static class Appointment implements Comparable<Appointment>
    {
        private int     hour;
        private int     minute;
        private boolean isAM;

        public Appointment(int hour, int minute, boolean isAM)
        {
            this.hour = hour;
            this.minute = minute;
            this.isAM = isAM;
        }

        @Override
        public int compareTo(Appointment other)
        {
            // Return an integer as the result of comparing time.
            // < 0 for is before other
            // > 0 for is after other
            // = 0 for the same time

            if (isAM)
            {
                // this is AM, other is PM
                if (!other.isAM)
                {
                    return -1;
                }
            }
            else
            {
                // this is PM, other is AM
                if (other.isAM)
                {
                    return 1;
                }
            }
            if (hour % 12 < other.hour % 12)
            {
                return -1;
            }
            if (hour % 12 > other.hour % 12)
            {
                return 1;
            }
            return minute - other.minute;
        }

        @Override
        public String toString()
        {
            String time = Integer.toString(hour) + ":";

            if (minute < 10)
            {
                time += "0";
            }
            time += Integer.toString(minute) + " ";

            if (isAM)
            {
                time += "a.m.";
            }
            else
            {
                time += "p.m.";
            }

            return time;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // for each test case
        while (n != 0)
        {
            // read each appointment
            Appointment[] data = new Appointment[n];
            for (int i = 0; i < n; i++)
            {
                String time = sc.next();
                String[] hour_minute = time.split(":");

                String am_pm = sc.next();
                boolean isAM = am_pm.charAt(0) == 'a';
                
                data[i] = new Appointment(Integer.parseInt(hour_minute[0]),
                                          Integer.parseInt(hour_minute[1]),
                                          isAM);
            }

            // This compares elements using Appointment.compareTo(Appointment) method
            Arrays.sort(data);

            for (Appointment each : data)
            {
                System.out.println(each);
            }

            System.out.println();

            n = sc.nextInt();
        }
    }
}
