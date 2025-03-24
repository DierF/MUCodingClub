import java.util.ArrayList;
import java.util.Scanner;

public class garagedoorcode
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        int k = console.nextInt();
        int n = console.nextInt();

        // find all possible sequences
        ArrayList<String> sequences = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        find_all_sequences(sequences, k, sb, 0);

        ArrayList<String> observations = new ArrayList<>();
        for (int i = 0; i < n; i++)
        {
            observations.add(console.next());
        }

        // find all possible sequences that are in each observation.
        ArrayList<String> result = new ArrayList<>();
        for (String sequence : sequences)
        {
            boolean ok = true;
            for (String observation : observations)
            {
                if (!isSubSequence(observation, sequence))
                {
                    ok = false;
                    break;
                }
            }
            if (ok)
            {
                result.add(sequence);
            }
        }

        System.out.println(result.size());
        for (String answer : result)
        {
            System.out.println(answer);
        }
    }

    public static void find_all_sequences(ArrayList<String> sequences, int k, StringBuilder sb, int index)
    {
        if (index == k)
        {
            // All digits found.
            sequences.add(sb.toString());
            return;
        }

        String digits = "0123456789";
        for (char digit : digits.toCharArray())
        {
            sb.append(digit);
            find_all_sequences(sequences, k, sb, index + 1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    public static boolean isSubSequence(String observation, String sequence)
    {
        int i = 0; // index in observation
        int j = 0; // index in sequence
        while (i < observation.length() && j < sequence.length())
        {
            if (observation.charAt(i) == sequence.charAt(j))
            {
                j++;
            }

            i++;
        }

        // Check if every digit in sequence is found in observation.
        return j == sequence.length();
    }
}
