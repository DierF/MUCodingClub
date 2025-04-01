import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class hindex
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        int n = console.nextInt();

        ArrayList<Integer> citations = new ArrayList<>();
        for (int i = 0; i < n; i++)
        {
            citations.add(console.nextInt());
        }

        citations.sort(Comparator.reverseOrder());

        int hIndex = 0;
        for (int i = 0; i < n; ++i)
        {
            // there are i + 1 papers with at least citation.get(i) citations
            if (citations.get(i) >= i + 1)
            {
                hIndex = i + 1;
            }
        }

        System.out.println(hIndex);
    }
}
