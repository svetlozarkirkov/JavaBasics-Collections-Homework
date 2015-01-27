import java.util.Scanner;


public class Problem3_LargestSequenceEqualStrings {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] inputLine = input.nextLine().split(" ");	// the input line into string array, removing spaces
		if (inputLine.length==1){	// if the input array consists of only one element there's no need for anything else but printing it
			System.out.printf("%s ",inputLine[0]);	// printing the only element
			System.exit(0); //exit the program
		}
		int longest = largestSeq(inputLine,inputLine.length);	// using the method to find out how big is the largest sequence
		String longestStr = "";		// storage for the leftmost string that will be found
		int size = 0;	// storage for the size of the sequence of the above string
		for (int i = 0; i < inputLine.length; i++){		// iterating through the input array
			int count = 1;				// start counting from 1
			for (int j = i+1; j < inputLine.length; j++){	// second loop which starts with the element after "i"
				if (inputLine[i].equals(inputLine[j])){		// if it's equal to "i" we increase the count
					count++;
				}
			}
			if (count == longest){	// after each sequence we check if it's the first occurence of a sequence of this size
				longestStr=inputLine[i];	// if it is - we fill the storages we made before the main loop
				size = count;
				break;	// and we break from the main loop
			}
		}
		for (int i = 0; i < size; i++){		// we print the found string with space after it
			System.out.printf("%s ",longestStr);
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
