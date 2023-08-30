import java.util.Scanner;

public class mixedfractions
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int numerator   = scanner.nextInt();
        int denominator = scanner.nextInt();

        while (numerator != 0 && denominator != 0)
        {
            int wholeNumber = numerator / denominator;
            numerator %= denominator;
            
            System.out.println(wholeNumber + " " + numerator + " / " + denominator);

            numerator   = scanner.nextInt();
            denominator = scanner.nextInt();
        }

        scanner.close();
    }
}