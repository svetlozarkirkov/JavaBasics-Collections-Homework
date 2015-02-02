import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class Problem12_CardsFrequencies {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] inputFaces = input.nextLine().split("[^\\w]+");
		Map<String,Integer> counts = new TreeMap<>();
		for (int i = 0; i < inputFaces.length; i++){
			if (!counts.containsKey(inputFaces[i])){
				counts.put(inputFaces[i], 1);
			}
			else{
				counts.computeIfPresent(inputFaces[i], (k, v) -> v + 1);
			}
		}
		for(String key:counts.keySet())
		{
		    System.out.printf("%s -> %.2f%%\n",key,(double)counts.get(key)/inputFaces.length*100);
		}
		input.close();
	}

}
