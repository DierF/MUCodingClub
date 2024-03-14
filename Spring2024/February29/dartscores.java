import java.util.Scanner;

public class dartscores {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int tests = console.nextInt();
        for (int test = 0; test < tests; ++test) {
            int throwTotal = console.nextInt();
            int score = 0;
            for (int throwNum = 0; throwNum < throwTotal; ++throwNum) {
                double x = console.nextDouble();
                double y = console.nextDouble();
                if (x == y && x == 0)
                {
                    score += 10;
                    continue;
                }
                double distance = Math.sqrt(x * x + y * y);
                score += Math.max(0, 11 - Math.ceil(distance/20));
            }
            System.out.println(score);
        }
        console.close();
    }
}