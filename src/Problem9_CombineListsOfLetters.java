import java.util.ArrayList;
import java.util.Scanner;


public class Problem9_CombineListsOfLetters {

	@SuppressWarnings("serial")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String firstLine = input.nextLine();
		String secondLine = input.nextLine();
		ArrayList<Character> first = new ArrayList<>();
		ArrayList<Character> second = new ArrayList<>();
		for (int i = 0; i < firstLine.length(); i++) {
			if (!Character.isWhitespace(firstLine.charAt(i))){
				first.add(firstLine.charAt(i));
			}
		}
		for (int i = 0; i < secondLine.length(); i++) {
			if (!first.contains(secondLine.charAt(i)) && !Character.isWhitespace(secondLine.charAt(i))){
			second.add(secondLine.charAt(i));
			}
		}
		ArrayList<Character> united = new ArrayList<Character>() { { addAll(first); addAll(second); } };
		for (Character ch : united){
			System.out.print(ch+" ");
		}
		input.close();
	}

}
