import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class Problem2_SequencesOfEqualStrings {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] inputLine = input.nextLine().split(" ");
		Set<String> uniqKeys = new TreeSet<String>();
		uniqKeys.addAll(Arrays.asList(inputLine));
		for (String str: uniqKeys){
			for (int j = 0; j < inputLine.length; j++){
				if (inputLine[j].equals(str)){
					System.out.print(str+" ");
				}
			}
			System.out.println();
		}
		input.close();
	}
}
