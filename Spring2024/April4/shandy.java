import java.util.Scanner;

public class shandy {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print(2*Math.min(console.nextInt(), console.nextInt()));
        console.close();
    }
}