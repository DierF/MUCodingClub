import java.util.Scanner;

public class utf8 {
	
	public static final int INVALID_TYPE = 0;

	public static int readSymbol(Scanner reader)
	{
		int type = reader.next().indexOf('0');
		if(type == 1) {return INVALID_TYPE;}
		if(type == 0) {type = 1;}
		if(type < 1 || type > 4) {return INVALID_TYPE;}
		for(int needed = type - 1; needed > 0; --needed)
		{
			if(!reader.hasNext() || reader.next().indexOf('0') != 1)
			{
				return INVALID_TYPE;
			}
		}
		return type;
	}
	
	public static void main(String[] args) {
		int[] symbolTypeCounts = new int[5];
		Scanner console = new Scanner(System.in);
		int linesExpected = console.nextInt();// This variable is not used in this solution.
		while(console.hasNext())
		{
			int type = readSymbol(console);
			if (type == INVALID_TYPE)
			{
				System.out.println("invalid");
				return;// Stops the program.
			}
			++symbolTypeCounts[type];
		}
		
		for(int i = 1; i <= 4; ++i)
		{
			System.out.println(symbolTypeCounts[i]);
		}
	}

}
