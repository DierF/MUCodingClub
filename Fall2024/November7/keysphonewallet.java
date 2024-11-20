import java.util.Scanner;

public class keysphonewallet
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        int n = console.nextInt();

        // Whether or not I have the item
        boolean keys = false;
        boolean phone = false;
        boolean wallet = false;

        for (int i = 0; i < n; i++)
        {
            String item = console.next();
            if (item.equals("keys"))
            {
                keys = true;
            }
            else if (item.equals("phone"))
            {
                phone = true;
            }
            else if (item.equals("wallet"))
            {
                wallet = true;
            }
        }

        if (!keys)
        {
            System.out.println("keys");
        }
        if (!phone)
        {
            System.out.println("phone");
        }
        if (!wallet)
        {
            System.out.println("wallet");
        }
        if (keys && phone && wallet)
        {
            System.out.println("Ready");
        }
    }
}