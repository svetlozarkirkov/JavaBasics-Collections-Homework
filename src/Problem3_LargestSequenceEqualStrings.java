import java.util.Scanner;


public class Problem3_LargestSequenceEqualStrings {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String[] inputLine = input.nextLine().split(" ");
		if (inputLine.length==1){
			System.out.printf("%s ",inputLine[0]);
			System.exit(0);
		}
		int longest = largestSeq(inputLine,inputLine.length);
		String longestStr = "";
		int size = 0;
		for (int i = 0; i < inputLine.length; i++){
			int count = 1;
			for (int j = i+1; j < inputLine.length; j++){
				if (inputLine[i].equals(inputLine[j])){
					count++;
				}
			}
			if (count == longest){
				longestStr=inputLine[i];
				size = count;
				for (int x = 0; x < size; x++){
					System.out.printf("%s ",longestStr);
				}
				return;	
			}
		}
		input.close();
	}
	
	public static int largestSeq(String[] array, int size){
		int longest = 0;
		int count = 1;
		int i;
		for(i = 1; i < size; i++){
			if(array[i].equals(array[i-1])) {
				count++;
			}
			else {
				count = 1;
			}
			if (count > longest){
				longest = count;
			}
		}
		return longest;
	}
}
