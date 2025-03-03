import java.util.Scanner;

public class siffrid {
    // Excercize: How can this method be rewritten to be better than O(n)?
    public static long powerOfTen(long exponent) {
        long result = 1;
        for(long i = 0; i < exponent; ++i) {
            result *= 10;
        }
        return result;
    }

    // Given the constraints of this problem, lowAnswer is <= 10e9 so "int" would be acceptable.
    public static long lowAnswer(long digitSum, long answerLength) {
        long low = powerOfTen(answerLength - 1);
        digitSum -= 1;
        long digitIndex = 0;
        while (digitSum >= 9) {
            low += 9 * powerOfTen(digitIndex);
            digitSum -= 9;
            digitIndex += 1;
        }
        low += digitSum * powerOfTen(digitIndex);
        return low;
    }
    
    // highAnswer might exceed 9 * 10e9, "long" likely necessary.
    public static long highAnswer(long digitSum, long answerLength) {
        long high = 0;
        long digitIndex = answerLength - 1;
        while (digitSum >= 9) {
            high += 9 * powerOfTen(digitIndex);
            digitSum -= 9;
            digitIndex -= 1;
        }
        high += digitSum * powerOfTen(digitIndex);
        return high;
    }

    public static int sumOfDigits(int n)
    {
        int sum = 0;
        while(n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String number = console.next();
        int n = Integer.parseInt(number);
        int digitSum = sumOfDigits(n);
        int answerLength = number.length();
        System.out.print(lowAnswer(digitSum, answerLength));
        System.out.print(" ");
        System.out.print(highAnswer(digitSum, answerLength));
    }
}
