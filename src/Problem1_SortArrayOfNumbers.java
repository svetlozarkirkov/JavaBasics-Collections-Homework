import java.util.Arrays;
import java.util.Scanner;


public class Problem1_SortArrayOfNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] numArray = new int[n];
		for (int i = 0; i < n; i++){
			numArray[i]=input.nextInt();
		}
		Arrays.sort(numArray);
		for (int i = 0; i < numArray.length; i++){
			System.out.print(numArray[i]+ " ");
		}
		input.close();
	}
}
