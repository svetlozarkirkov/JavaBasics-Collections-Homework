import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Problem8_ExtractEMails {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String inputText = input.nextLine();
		Pattern regexMail = Pattern.compile("");
		Matcher matcher = regexMail.matcher("[_A-Za-z0-9-]+)(\\.[_A-Za-z0-9-]+)@([A-Za-z0-9]+)(\\.[A-Za-z0-9]+");
		String[] split = inputText.split("(?=[,.])|\\s+");
		for (String text: split){
			if (matcher.find()){
				System.out.print(matcher.group() + "\n");
			}
		}
		
		
		input.close();
	}
}
