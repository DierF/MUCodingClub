import java.util.Scanner;

public class bus {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int tests = console.nextInt();
        for (int i = 0; i < tests; ++i)
        {
            int stops = console.nextInt();
            System.out.println((1 << stops) - 1);
        }
    }
}