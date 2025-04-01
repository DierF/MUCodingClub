import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeMap;

public class conformity
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        int n = console.nextInt();
        console.nextLine();

        TreeMap<String, Integer> record = new TreeMap<>();
        for (int i = 0; i < n; i++)
        {
            String[] courses_list = console.nextLine().split(" ");
            // sort courses to keep track of unique course combinations
            Arrays.sort(courses_list);
            String courses = String.join(" ", courses_list);

            int occurrence = record.getOrDefault(courses, 0) + 1;

            record.put(courses, occurrence);
        }

        ArrayList<Integer> counter = new ArrayList<>(record.values());
        counter.sort(Comparator.reverseOrder());

        int count = counter.get(0);
        for (int i = 1; i < counter.size(); i++)
        {
            if (counter.get(i).equals(counter.get(0)))
            {
                count += counter.get(i);
            }
        }
        
        System.out.println(count);
    }
}