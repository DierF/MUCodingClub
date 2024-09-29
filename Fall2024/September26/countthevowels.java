import java.util.Scanner;

public class countthevowels
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        int vowel = 0;
        
        for (int i = 0; i < input.length(); i++)
        {
            char letter = input.charAt(i);

            if (letter == 'a' ||
                letter == 'e' ||
                letter == 'i' ||
                letter == 'o' ||
                letter == 'u' ||
                letter == 'A' ||
                letter == 'E' ||
                letter == 'I' ||
                letter == 'O' ||
                letter == 'U')
            {
                vowel++;
            }
        }

        System.out.println(vowel);
    }
}
