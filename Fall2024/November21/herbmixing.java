import java.util.Scanner;

public class herbmixing
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        int green = console.nextInt();
        int red   = console.nextInt();

        int result = 0;
        
        while (red > 0 && green > 0)
        {
            result += 10;
            red--;
            green--;
        }

        while (green >= 3)
        {
            result += 10;
            green -= 3;
        }

        while (green >= 2)
        {
            result += 3;
            green -= 2;
        }

        while (green > 0)
        {
            result++;
            green--;
        }

        System.out.println(result);
    }
}
