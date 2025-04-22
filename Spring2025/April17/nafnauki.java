import java.util.Scanner;

public class nafnauki
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        String filename = console.next();

        System.out.println(filename.substring(filename.lastIndexOf('.')));
    }
}