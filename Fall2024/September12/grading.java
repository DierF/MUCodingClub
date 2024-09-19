import java.util.Scanner;

public class grading {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int		a = console.nextInt(),
				b = console.nextInt(),
				c = console.nextInt(),
				d = console.nextInt(),
				e = console.nextInt();
		
		int score = console.nextInt();
		String grade = "F";
		if (score >= a) grade = "A";
		else if(score >= b) grade = "B";
		else if(score >= c) grade = "C";
		else if(score >= d) grade = "D";
		else if(score >= e) grade = "E";
		
		System.out.println(grade);
	}

}
