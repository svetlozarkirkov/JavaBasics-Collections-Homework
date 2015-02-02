import java.util.Scanner;


public class Problem7_CountSubstringOccurences {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();
		String wordToSearch = input.nextLine();
		String[] inputWords = sentence.split("[^\\w]+");
		int occurencesCount = 0;
		for (int i = 0; i < inputWords.length; i++){
			String temp = inputWords[i].toLowerCase();
			if (temp.length()<wordToSearch.length()){
				continue;
			}
			for (int j = 0; j < temp.length()-wordToSearch.length()+1; j++){
				String sub = temp.substring(j, wordToSearch.length()+j);
				if (sub.equals(wordToSearch)){
					occurencesCount++;
				}
			}
		}
		System.out.println(occurencesCount);
		input.close();
	}
}
