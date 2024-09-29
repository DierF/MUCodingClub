import java.util.Scanner;

public class undeadoralive
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        boolean smiley = input.contains(":)");
        boolean frowny = input.contains(":(");

        if (smiley && frowny)
        {
            System.out.println("double agent");
        }
        else if (smiley)
        {
            System.out.println("alive");
        }
        else if (frowny)
        {
            System.out.println("undead");
        }
        else
        {
            System.out.println("machine");
        }
    }
}
