import java.util.Scanner;

public class drmmessages
{

    public static int rotate(int x, int k)
    {
        return (x + k) % 26;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();
        int size = s.length() / 2;

        int[] a1 = new int[size];
        int[] a2 = new int[size];

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < size; ++i)
        {
            a1[i] = s.charAt(i) - 'A';
            sum1 += a1[i];

            a2[i] = s.charAt(i + size) - 'A';
            sum2 += a2[i];
        }

        for (int i = 0; i < size; ++i)
        {
            a1[i] = rotate(a1[i], sum1);
            a2[i] = rotate(a2[i], sum2);
        }

        for (int i = 0; i < size; ++i)
        {
            System.out.print((char)(rotate(a1[i], a2[i]) + 'A'));
        }

        scanner.close();
    }
}
