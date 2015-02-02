import java.util.Scanner;


public class Problem6_CountSpecifiedWord {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String inputLine = input.nextLine();
		String[] inputWords = inputLine.split("[^\\w]+");
		String word = input.nextLine();
		int count = 0;
		for (int i = 0; i < inputWords.length; i++){
			if(inputWords[i].toLowerCase().equals(word)){
				count++;
			}
		}
		System.out.println(count);
		input.close();
	}

}
