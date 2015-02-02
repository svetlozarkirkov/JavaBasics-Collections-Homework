import java.util.Scanner;


public class Problem5_CountAllWords {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] inputLine = input.nextLine().split("[^\\w]");
		int count = 0;
		for (int i = 0; i < inputLine.length; i++){
			if (inputLine[i].length()!=0){
				count++;
			}
		}
		System.out.println(count);
		input.close();
	}

}
