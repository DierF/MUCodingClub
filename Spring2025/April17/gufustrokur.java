import java.util.Scanner;

public class gufustrokur
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        int a = console.nextInt();
        int b = console.nextInt();

        int difference = Math.abs(a - b);

        System.out.println(Math.min(difference, 360 - difference));
    }    
}
