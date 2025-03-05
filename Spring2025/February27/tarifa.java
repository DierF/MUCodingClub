import java.util.Scanner;

public class tarifa
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
    
        int x = console.nextInt();
        int n = console.nextInt();
        int total = x * (n + 1);
        for (int i = 0; i < n; i++)
        {
            total -= console.nextInt();
        }
        System.out.println(total);
    }
}