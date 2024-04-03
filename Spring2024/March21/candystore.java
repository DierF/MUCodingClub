import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class candystore
{

    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        int q = console.nextInt();
        console.nextLine();
        Map<String, String> form = new HashMap<String, String>();
        for (int namesRead = 0; namesRead < n; ++namesRead)
        {
            String name = console.nextLine();
            String[] splitNames = name.split(" ");
            String initials = "" + splitNames[0].charAt(0) + splitNames[1].charAt(0);
            if (form.get(initials) == null)
            {
                form.put(initials, name);
            }
            else
            {
                form.put(initials, "ambiguous");
            }
        }
        for (int queriesAnswered = 0; queriesAnswered < q; ++queriesAnswered)
        {
            String query = console.nextLine();
            if (form.get(query) != null)
            {
                System.out.println(form.get(query));
            }
            else
            {
                System.out.println("nobody");
            }
        }
    }

}