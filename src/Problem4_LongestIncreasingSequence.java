import java.util.Scanner;


public class Problem4_LongestIncreasingSequence {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] inputLine = input.nextLine().split(" ");
		int[] numbers = new int[inputLine.length];
		for(int i = 0; i < inputLine.length; i++)
		{
		   numbers[i] = Integer.parseInt(inputLine[i]);
		}
		
		
		
		input.close();
	}

}
