import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class jibjob
{
    public static class Crane
    {
        public int x;
        public int y;
        public int h;
        public int index;

        public int lengthSquare;

        public Crane(int x, int y, int h, int index)
        {
            this.x = x;
            this.y = y;
            this.h = h;
            this.index = index;
        }
    }

    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        int n = console.nextInt();

        Crane[] cranes = new Crane[n];
        for (int i = 0; i < n; i++)
        {
            cranes[i] = new Crane(console.nextInt(), console.nextInt(), console.nextInt(), i);
        }

        // Sort based on height
        Comparator<Crane> heightComparator = new Comparator<Crane>()
        {
            public int compare(Crane a, Crane b)
            {
                return a.h - b.h;
            }
        };
        Arrays.sort(cranes, heightComparator);

        for (int i = 0; i < n; i++)
        {
            int x1 = cranes[i].x;
            int y1 = cranes[i].y;
            int h1 = cranes[i].h;

            // Keep track of length square to avoid floating-point numbers
            int maximumLengthSquare = h1 * h1; // Length can't exceed height
            for (int j = i + 1; j < n; j++)
            {
                int x2 = cranes[j].x;
                int y2 = cranes[j].y;

                // Euclidean Distance
                int distanceSquare = (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);

                // Update maximum length
                maximumLengthSquare = Math.min(maximumLengthSquare, distanceSquare);
            }

            // Store the length square
            cranes[i].lengthSquare = maximumLengthSquare;
        }

        // Sort based on index to resume original order
        Comparator<Crane> indexComparator = new Comparator<Crane>()
        {
            public int compare(Crane a, Crane b)
            {
                return a.index - b.index;
            }
        };
        Arrays.sort(cranes, indexComparator);

        for (Crane crane : cranes)
        {
            System.out.println((int)Math.sqrt(crane.lengthSquare));
        }
    }
}
