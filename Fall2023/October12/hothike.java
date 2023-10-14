import java.util.Scanner;

public class hothike
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        int[] data = new int[n];
        for (int i = 0; i < n; ++i)
        {
            data[i] = sc.nextInt();
        }

        int day = -1;
        int res = Integer.MAX_VALUE;

        for (int i = 2; i < n; ++i)
        {
            int temp = Math.max(data[i - 2], data[i]);
            if (temp < res)
            {
                res = temp;
                day = i - 2 + 1;
            }
        }

        System.out.println(day + " " + res);
        
        sc.close();
    }    
}
