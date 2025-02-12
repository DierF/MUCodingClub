import java.util.HashMap;
import java.util.Scanner;

public class diversecontest
{
    public static String[][] problems;

    public static HashMap<String, Integer> topic_count;

    public static int find(int maximum, int current, int need)
    {
        if (need == 0)
        {
            // found enough problems
            return 1;
        }
        if (current == problems.length)
        {
            // No more problem available
            return 0;
        }
        // CASE#1: Don't use current problem
        int result = find(maximum, current + 1, need);

        // CASE#2: Use current problem
        // Add topics from this problem
        for (int i = 0; i < problems[current].length; i++)
        {
            int count = topic_count.getOrDefault(problems[current][i], 0);
            if (count + 1 > maximum)
            {
                // Can't use this problem
                // remove topics already added by this problem
                for (int j = 0; j < i; j++)
                {
                    topic_count.put(problems[current][j], topic_count.get(problems[current][j]) - 1);
                }

                return result;
            }
            // this topic is added from this problem
            topic_count.put(problems[current][i], count + 1);
        }

        result += find(maximum, current + 1, need - 1);

        // Remove topics from this problem
        for (String topic : problems[current])
        {
            topic_count.put(topic, topic_count.get(topic) - 1);
        }

        return result;
    }

    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        int n = console.nextInt();
        int k = console.nextInt();

        problems = new String[n][];
        for (int i = 0; i < n; i++)
        {
            int t = console.nextInt();
            String[] topics = new String[t];
            for (int j = 0; j < t; j++)
            {
                topics[j] = console.next();
            }
            problems[i] = topics;
        }

        topic_count = new HashMap<>();
        System.out.println(find(k / 2, 0, k));
    }
}
