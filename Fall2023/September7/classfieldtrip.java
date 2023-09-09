import java.util.Scanner;
import java.util.Arrays;

public class classfieldtrip
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        String b = scanner.nextLine();

        char[] res = (a + b).toCharArray();

        Arrays.sort(res);

        System.out.println(String.valueOf(res));

        scanner.close();
    }
}