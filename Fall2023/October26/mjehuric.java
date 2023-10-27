import java.util.Arrays;
import java.util.Scanner;

public class mjehuric
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int[] data = new int[5];
        for (int i = 0; i < 5; ++i)
        {
            data[i] = sc.nextInt();
        }

        int[] sorted = new int[]{ 1, 2, 3, 4, 5 };

        while (!Arrays.equals(data, sorted))
        {
            for (int i = 1; i < 5; ++i)
            {
                if (data[i - 1] > data[i])
                {
                    int temp = data[i - 1];
                    data[i - 1] = data[i];
                    data[i] = temp;
                    System.out.println(data[0] + " " + data[1] + " " + data[2] + " " + data[3] + " " + data[4]);
                }
            }
        }

        sc.close();
    }
}
