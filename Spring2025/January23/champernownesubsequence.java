import java.util.Scanner;

public class champernownesubsequence
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        int n = console.nextInt();
        String s = console.next();

        int index = 0; // index of the first digit in s that has not been matched
        int k = 1;
        while (index < n)
        {
            for (char digit : String.valueOf(k).toCharArray())
            {
                // iterate through each digit in kth word
                if (s.charAt(index) == digit)
                {
                    // this digit can match the first digit in s that has not been matched
                    index++;
                }

                if (index >= n)
                {
                    // all digits in s are matched
                    System.out.println(k);
                    return;
                }
            }

            k++; // check the next k
        }
    }
}
