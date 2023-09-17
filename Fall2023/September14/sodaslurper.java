import java.util.Scanner;

public class sodaslurper
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int e = sc.nextInt();
        int f = sc.nextInt();
        int c = sc.nextInt();

        int has   = e + f;
        int price = c;
        int total = 0;

        while (has >= price)
        {
            int drink = has / price;

            total += drink;

            has %= price;
            has += drink;
        }

        System.out.println(total);

        sc.close();
    }    
}
