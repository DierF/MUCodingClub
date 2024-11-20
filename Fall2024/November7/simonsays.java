import java.util.Scanner;

public class simonsays
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        int n = console.nextInt();
        console.nextLine();

        for (int i = 0; i < n; i++)
        {
            String sentence = console.nextLine();
            
            if (sentence.startsWith("Simon says"))
            {
                System.out.println(sentence.substring(10));
            }
        }
    }
}
