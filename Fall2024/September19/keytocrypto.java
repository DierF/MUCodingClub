import java.util.Scanner;

public class keytocrypto
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String ciphertext = sc.nextLine();
        String key = sc.nextLine();

        String message = "";
        // iterate through each index of the ciphertext
        for (int i = 0; i < ciphertext.length(); i++)
        {
            char cipher_letter = ciphertext.charAt(i);
            char key_letter = key.charAt(i);

            // get the # of shifts
            int shift = key_letter - 'A';
            
            // get the difference between 'A' and the original letter
            // ensure it's within the range [0, 25] by adding 26 then modulo 26
            int diff = ((cipher_letter - 'A') - shift + 26) % 26;

            char letter = (char)('A' + diff);

            message += letter;
            key += letter;
        }

        System.out.println(message);
    }    
}
