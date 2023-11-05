import java.util.Scanner;

public class kitten
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();

        int[] data = new int[101];
        while (true)
        {
            int root = sc.nextInt();
            if (root == -1)
            {
                break;
            }
            String line = sc.nextLine();
            for (String s : line.split(" "))
            {
                if (s.isEmpty())
                {
                    continue;
                }
                data[Integer.parseInt(s)] = root;
            }
        }

        while (k != 0)
        {
            System.out.print(k + " ");
            k = data[k];
        }

        sc.close();
    }    
}
