import java.util.Scanner;

public class ants
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int test_case = sc.nextInt();

        for (int t = 0; t < test_case; t++)
        {
            int l = sc.nextInt();
            int n = sc.nextInt();

            int shortest = 0;

            // find the first and last position to compute the longest time
            int first_position = l;
            int last_position = 0;

            for (int i = 0; i < n; i++)
            {
                int position = sc.nextInt();

                // for shortest time, each ant aims for the closest end
                shortest = Math.max(shortest, Math.min(position, l - position));

                first_position = Math.min(first_position, position);
                last_position = Math.max(last_position, position);
            }

            // either all ants aim for right or all ants aim for left
            int longest = Math.max(l - first_position, last_position - 0);

            System.out.println(shortest + " " + longest);
        }
    }
}
