import java.util.Scanner;

public class treirad {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int count = 0;
        int n = console.nextInt();
        for(int x = 1; (x)*(x+1)*(x+2) < n; ++x) {
            ++count;
        }
        System.out.print(count);
    }
}