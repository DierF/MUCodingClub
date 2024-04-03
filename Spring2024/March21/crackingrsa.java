import java.util.Scanner;

public class crackingrsa
{

    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        long t = console.nextInt();
        for (long i = 0; i < t; ++i)
        {
            long n = console.nextInt();
            long e = console.nextInt();
            long p = 2, q, k = 1, d;
            
            for (; n % p != 0; ++p);
            q = n / p;

            for (; (k*(p-1)*(q-1)+1) % e != 0; ++k);
            d = (k*(p-1)*(q-1)+1) / e;

            System.out.println(d);
        }
        console.close();
    }

}