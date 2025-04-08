import java.util.Arrays;
import java.util.Scanner;

public class greetings2
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        String s = console.nextLine();
        
        int count = (s.length() - 2) * 2;

        StringBuilder sb = new StringBuilder();
        sb.append('h');
        for (int i = 0; i < count; i++)
        {
            sb.append('e');
        }
        sb.append('y');

        System.out.println(sb.toString());
    }
}
