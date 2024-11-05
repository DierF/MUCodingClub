import java.util.Scanner;

public class isithalloween
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        String date = console.nextLine();
        if (date.equals("OCT 31") || date.equals("DEC 25"))
        {
            System.out.println("yup");
        }
        else
        {
            System.out.println("nope");
        }
    }
}
