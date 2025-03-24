import java.util.ArrayList;
import java.util.Scanner;

public class eszett
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        String s = console.next().toLowerCase();

        ArrayList<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        
        find(result, s, sb, 0);
        
        for (String answer : result)
        {
            System.out.println(answer);
        }
    }

    public static void find(ArrayList<String> result, String s, StringBuilder sb, int index)
    {
        if (index == s.length())
        {
            // All characters added, one possible answer found.
            result.add(sb.toString());
            return;
        }

        // Check if there is ambiguity.
        if (s.charAt(index) == 's' && index + 1 < s.length() && s.charAt(index + 1) == 's')
        {
            sb.append('B');
            find(result, s, sb, index + 2);
            sb.deleteCharAt(sb.length() - 1);
        }

        sb.append(s.charAt(index));
        find(result, s, sb, index + 1);
        sb.deleteCharAt(sb.length() - 1);
    }
}
