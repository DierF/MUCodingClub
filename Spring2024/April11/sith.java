import java.util.Scanner;
public class sith {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        console.nextLine();
        int a = console.nextInt();
        int b = console.nextInt();
        int c = console.nextInt();
        if (c < 0) {
            System.out.println("JEDI");
        }
        else if (c != a - b) {
            System.out.println("SITH");
        }
        else {
            System.out.println("VEIT EKKI");
        }
        console.close();
    }
}