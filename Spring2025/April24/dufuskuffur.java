import java.util.Scanner;

public class dufuskuffur
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        int n = console.nextInt();
        int m = console.nextInt();

        if (n == m)
        {
            System.out.println("Dufur passa fullkomlega");
        }
        else if (n < m)
        {
            System.out.println("Dufur passa");
        }
        else
        {
            System.out.println("Dufur passa ekki");
        }
    }
}