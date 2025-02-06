import java.util.Scanner;

public class riddleofthesphinx
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        System.out.println("1 0 0"); // Ask for a
        int a = console.nextInt(); // Read a
        System.out.println("0 1 0"); // Ask for b
        int b = console.nextInt(); // Read b
        System.out.println("0 0 1"); // Ask for c
        int c = console.nextInt(); // Read c
        System.out.println("1 1 1"); // Ask for a+b+c
        int abc = console.nextInt(); // Read a+b+c
        System.out.println("1 2 3"); // Ask for a+2b+3c
        int a2b3c = console.nextInt(); // Read a+2b+3c
        if (a + b + c == abc)
        {
            // a, b, c, a+b+c are T
            // a+2b+3c is T or F
        }
        else
        {
            // F in a, b, c, a+b+c
            // a+2b+3c is T
            if (b + 2 * c + abc == a2b3c)
            {
                // b, c, a+b+c, a+2b+3c are T
                // a is F
                a = abc - b - c;
            }
            else
            {
                // F in b, c, a+b+c
                // a, a+2b+3c are T
                if (a + 2 * b + 3 * c == a2b3c)
                {
                    // a, b, c, a+2b+3c are T
                    // a+b+c is F
                }
                else
                {
                    // F in b, c
                    // a, a+b+c, a+2b+3c are T
                    c = a2b3c + a - 2 * abc;
                    b = abc - a - c;
                }
            }
        }
        System.out.println(a + " " + b + " " + c);
    }
}
