import java.util.Scanner;

public class babybites
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sc.nextLine();
        String[] rec = sc.nextLine().split(" ");

        for (int i = 1; i <= n; ++i)
        {
            if (rec[i - 1].equals("mumble"))
            {
                continue;
            }
            if (Integer.parseInt(rec[i - 1]) != i)
            {
                System.out.println("something is fishy");

                sc.close();
                return;
            }
        }
        System.out.println("makes sense");
        
        sc.close();
    }
    
}