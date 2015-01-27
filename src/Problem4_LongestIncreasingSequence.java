import java.util.ArrayList;
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
		ArrayList<ArrayList<Integer>> sequences = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < numbers.length; i++){
			
		}
		int count = 1, max = 1;

		for (int i = 1; i < numbers.length; i++) {
		    if (numbers[i] >= numbers[i - 1]) {
		        count++;
		    } else {
		        if (count > max) {
		            max = count;
		        }
		        count = 1;
		    }
		}

		System.out.println(max);
	}

}
