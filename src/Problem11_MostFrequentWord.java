import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class Problem11_MostFrequentWord {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] words = input.nextLine().split("[^\\w]+");
		Map<String,Integer> counts = new TreeMap<>();
		int count = 1;
		
		for(int i = 0; i < words.length; i++){
			if (!counts.containsKey(words[i].toLowerCase())){
				counts.put(words[i].toLowerCase(), count);
			}
			else{
				counts.computeIfPresent(words[i].toLowerCase(), (k, v) -> v + 1);
			}
		}
		int maxValue = (Collections.max(counts.values()));
		for(String key:counts.keySet())
		{
		    if (counts.get(key).intValue()==maxValue){
		    	System.out.printf("%s -> %d times\n",key,maxValue);
		    }
		}
		input.close();
	}
}
