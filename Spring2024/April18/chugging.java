import java.util.Scanner;

public class chugging {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        int a = n*console.nextInt() + n*(n-1)*console.nextInt()/2;
        int b = n*console.nextInt() + n*(n-1)*console.nextInt()/2;
        if (a < b) System.out.print("Alice");
        else if (a > b) System.out.print("Bob");
        else System.out.print("=");
        console.close();
    }
}