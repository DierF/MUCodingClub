import java.util.Scanner;
import java.util.TreeSet;

public class gestalisti
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        int n = console.nextInt();

        TreeSet<String> names = new TreeSet<>();

        for (int i = 0; i < n; i++)
        {
            String op = console.next();
            String name = console.next();

            if (op.equals("+"))
            {
                names.add(name);
            }
            else if (op.equals("-"))
            {
                names.remove(name);
            }
            else
            {
                if (names.contains(name))
                {
                    System.out.println("Jebb");
                }
                else
                {
                    System.out.println("Neibb");
                }
            }
        }
    }
}