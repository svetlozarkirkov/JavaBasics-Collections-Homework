import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Problem10_ExtractAllUniqueWords {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] inputLine = input.nextLine().split("[^\\w]+");
		ArrayList<String> collection = new ArrayList<>();
		for (int i = 0; i < inputLine.length; i++){
			if (!collection.contains(inputLine[i].toLowerCase())){
				collection.add(inputLine[i].toLowerCase());
			}
		}
		Collections.sort(collection);
		for (String str : collection){
			System.out.print(str+" ");
		}
		input.close();
	}
}
