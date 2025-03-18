import java.util.Scanner;

public class mousepursuit
{
    public static class Action
    {
        public int  s;
        public long c;
        public long g;

        public Action(int s, long c, long g)
        {
            this.s = s;
            this.c = c;
            this.g = g;
        }
    }

    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        int n = console.nextInt();

        Action[] actions = new Action[n];
        for (int i = 0; i < n; i++)
        {
            String op = console.next();
            int s = console.nextInt();
            int c = console.nextInt();
            int g = console.nextInt();
            if (op.charAt(0) == 'C')
            {
                // CAUGHT
                actions[i] = new Action(s, c, g);
            }
            else
            {
                // MISS
                actions[i] = new Action(s, -c, -g);
            }
        }

        int k = console.nextInt();

        long cheese = 0, glory = 0;
        for (Action action : actions)
        {
            if (action.s < k)
            {
                cheese += action.c;
                glory  += action.g;
            }
        }

        System.out.println(cheese + " " + glory);
    }
}
