import java.util.Scanner;

public class dagatal
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        int m = console.nextInt();

        int day;
        switch (m)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                day = 31;
                break;
            case 2:
                day = 28;
                break;
            default:
                day = 30;
                break;
        }
        System.out.println(day);
    }
}