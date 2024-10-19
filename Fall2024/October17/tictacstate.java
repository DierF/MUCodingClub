import java.util.Scanner;

public class tictacstate
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        int test_case = console.nextInt();

        for (int t = 0; t < test_case; t++)
        {
            String reversed = Integer.toBinaryString(Integer.parseInt(console.next(), 8));
            // Reverse the String
            String binary = new StringBuilder(reversed).reverse().toString();
            while (binary.length() < 19)
            {
                binary += '0';
            }
            
            int result = check(binary);

            if (result == 0)
            {
                System.out.println("O wins");
            }
            else if (result == 1)
            {
                System.out.println("X wins");
            }
            else if (inProgress(binary))
            {
                System.out.println("In progress");
            }
            else
            {
                System.out.println("Cat's");
            }
        }
    }

    public static boolean inProgress(String binary)
    {
        return binary.substring(0, 9).contains("0");
    }

    // -1 for tie, 0 for O win, 1 for X win
    public static int check(String binary)
    {
        // First row
        if (exist(binary, 0, 1, 2))
        {
            int result = win(binary, 0, 1, 2);
            if (result != -1)
            {
                return result;
            }
        }
        // Second row
        if (exist(binary, 3, 4, 5))
        {
            int result = win(binary, 3, 4, 5);
            if (result != -1)
            {
                return result;
            }
        }
        // Third row
        if (exist(binary, 6, 7, 8))
        {
            int result = win(binary, 6, 7, 8);
            if (result != -1)
            {
                return result;
            }
        }
        // First column
        if (exist(binary, 0, 3, 6))
        {
            int result = win(binary, 0, 3, 6);
            if (result != -1)
            {
                return result;
            }
        }
        // Second column
        if (exist(binary, 1, 4, 7))
        {
            int result = win(binary, 1, 4, 7);
            if (result != -1)
            {
                return result;
            }
        }
        // Third column
        if (exist(binary, 2, 5, 8))
        {
            int result = win(binary, 2, 5, 8);
            if (result != -1)
            {
                return result;
            }
        }
        // Main diagonal
        if (exist(binary, 0, 4, 8))
        {
            int result = win(binary, 0, 4, 8);
            if (result != -1)
            {
                return result;
            }
        }
        // Anti Diagonal
        if (exist(binary, 2, 4, 6))
        {
            int result = win(binary, 2, 4, 6);
            if (result != -1)
            {
                return result;
            }
        }
        return -1;
    }

    public static boolean exist(String binary, int left, int mid, int right)
    {
        return binary.charAt(left) == '1' && binary.charAt(mid) == '1' && binary.charAt(right) == '1';
    }

    // -1 for tie, 0 for O win, 1 for X win
    public static int win(String binary, int left, int mid, int right)
    {
        if (binary.charAt(left + 9) == '0' && binary.charAt(mid + 9) == '0' && binary.charAt(right + 9) == '0')
        {
            return 0;
        }
        if (binary.charAt(left + 9) == '1' && binary.charAt(mid + 9) == '1' && binary.charAt(right + 9) == '1')
        {
            return 1;
        }
        return -1;
    }
}