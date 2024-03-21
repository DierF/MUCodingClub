import java.util.Arrays;
import java.util.Scanner;

public class saxophone
{
    public static void main(String[] args)
    {
        int[] c = {2, 3, 4, 7, 8, 9, 10};
        int[] d = {2, 3, 4, 7, 8, 9};
        int[] e = {2, 3, 4, 7, 8};
        int[] f = {2, 3, 4, 7};
        int[] g = {2, 3, 4};
        int[] a = {2, 3};
        int[] b = {2};
        int[] C = {3};
        int[] D = {1, 2, 3, 4, 7, 8, 9};
        int[] E = {1, 2, 3, 4, 7, 8};
        int[] F = {1, 2, 3, 4, 7};
        int[] G = {1, 2, 3, 4};
        int[] A = {1, 2, 3};
        int[] B = {1, 2};

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();
        for (int _t = 0; _t < t; ++_t)
        {
            String s = sc.nextLine();
            int[] res = new int[10];
            boolean[] rec = new boolean[10];
            int[] finger = new int[0];
            for (int i = 0; i < s.length(); ++i)
            {
                switch (s.charAt(i)) {
                    case 'c':
                        finger = c;
                        break;
                    case 'd':
                        finger = d;
                        break;
                    case 'e':
                        finger = e;
                        break;
                    case 'f':
                        finger = f;
                        break;
                    case 'g':
                        finger = g;
                        break;
                    case 'a':
                        finger = a;
                        break;
                    case 'b':
                        finger = b;
                        break;
                    case 'C':
                        finger = C;
                        break;
                    case 'D':
                        finger = D;
                        break;
                    case 'E':
                        finger = E;
                        break;
                    case 'F':
                        finger = F;
                        break;
                    case 'G':
                        finger = G;
                        break;
                    case 'A':
                        finger = A;
                        break;
                    case 'B':
                        finger = B;
                        break;
                }
                for (int j = 0; j < 10; ++j)
                {
                    if (Arrays.binarySearch(finger, j + 1) >= 0)
                    {
                        if (!rec[j])
                        {
                            rec[j] = true;
                            ++res[j];
                        }
                    }
                    else
                    {
                        if (rec[j])
                        {
                            rec[j] = false;
                        }
                    }
                }
            }
            for (int i = 0; i < 10; ++i)
            {
                System.out.print(res[i] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
