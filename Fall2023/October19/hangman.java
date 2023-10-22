import java.util.Scanner;

public class hangman
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        String word = sc.next();
        String guess = sc.next();

        boolean[] rec = new boolean[word.length()];

        int cnt = 0;

        for (int i = 0; i < guess.length(); ++i)
        {
            boolean has = false;
            for (int j = 0; j < word.length(); ++j)
            {
                if (word.charAt(j) == guess.charAt(i))
                {
                    has = true;
                    rec[j] = true;
                }
            }
            if (has)
            {
                boolean done = true;
                for (int j = 0; j < word.length(); ++j)
                {
                    if (!rec[j])
                    {
                        done = false;
                        break;
                    }
                }
                if (done)
                {
                    System.out.println("WIN");
                    return;
                }
            }
            else
            {
                ++cnt;
                if (cnt == 10)
                {
                    System.out.println("LOSE");
                    return;
                }
            }
        }

        sc.close();
    }
}
