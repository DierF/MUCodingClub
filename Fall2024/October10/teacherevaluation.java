import java.util.Scanner;

public class teacherevaluation {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int numStudents = console.nextInt();
        int desiredAverage = console.nextInt();
        int scoreSum = 0;
        for(int i = 0; i < numStudents; ++i) {
            scoreSum += console.nextInt();
        }
        if(desiredAverage == 100) {
            System.out.print("Impossible");
        }
        else {
            double numerator = 100*numStudents - scoreSum;
            double denominator = 100 - desiredAverage;
            int result = (int)Math.ceil(numerator/denominator) - numStudents;
            System.out.print(result);
        }
    }
}