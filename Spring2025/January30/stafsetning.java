import java.util.Scanner;
public class stafsetning {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();// The number of problems
        int m = console.nextInt();// The number of minutes to fix each typo
        int k = console.nextInt();// The number of minutes Unnar can work per day.
        if(m > k) {
            System.out.print(":(");
        } else {
            long totalTypos = 0;// Total number of typos can exceed Integer.MAX_VALUE
            for(int i = 0; i < n; ++i) {
                totalTypos += console.nextInt();
            }
            int typosPerDay = k / m;
            long days = totalTypos / typosPerDay;
            if(totalTypos % typosPerDay > 0) {
                ++days;
            }
            System.out.print(days);
        }
        console.close();
    }
}
