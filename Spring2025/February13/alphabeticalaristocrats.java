import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class alphabeticalaristocrats
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        int n = console.nextInt();

        String[] names = new String[n];
        console.nextLine();
        for (int i = 0; i < n; i++)
        {
            names[i] = console.nextLine();
        }

        Comparator<String> cmp = new Comparator<String>()
        {
            public int compare(String a, String b)
            {
                int index1 = findFirstUppercase(a);
                int index2 = findFirstUppercase(b);
                return a.substring(index1).compareTo(b.substring(index2));
            }
        };

        Arrays.sort(names, cmp);

        for (String name : names)
        {
            System.out.println(name);
        }
    }

    public static int findFirstUppercase(String s)
    {
        int index = 0;
        while (index < s.length())
        {
            char c = s.charAt(index);
            if ('A' <= c && c <= 'Z')
            {
                break;
            }
            index++;
        }
        return index;
    }
}
