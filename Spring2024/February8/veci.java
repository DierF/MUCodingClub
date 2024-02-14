import java.util.Arrays;
import java.util.Scanner;
public class veci {

	public static int lowestLargerPermutation(int x, int[] digits, int answerInProgress)
	{
		int bestAnswer = 0;
	    for (int i = 0; i < 10; ++i)
	    {
	        if (digits[i] > 0)
	        {
	            int[] digitsCopy = Arrays.copyOf(digits, digits.length);
	            --digitsCopy[i];
	            int answer = lowestLargerPermutation (x, digitsCopy, answerInProgress * 10 + i);
	            if (bestAnswer == 0 || (answer < bestAnswer && answer != 0))
	            {
	                bestAnswer = answer;
	            }
	        }
	    }
	    if (answerInProgress > x)
	    {
	        return answerInProgress;
	    }
	    return bestAnswer;
	}
	
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int x = console.nextInt();
		console.close();
		int[] digits = new int[10];
		for (int xCopy = x; xCopy > 0; xCopy /= 10) {
			digits[xCopy % 10]++;
		}
		System.out.println(lowestLargerPermutation(x, digits, 0));
	}

}
