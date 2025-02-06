import java.util.Scanner;
public class autori {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String input = console.next();
        console.close();
        boolean printNextChar = true;
        for(int i = 0; i < input.length(); ++i) {
            if(printNextChar) {
                System.out.print(input.charAt(i));
                printNextChar = false;
            }
            else if(input.charAt(i) == '-') {
                printNextChar = true;
            }
        }
    }
}
