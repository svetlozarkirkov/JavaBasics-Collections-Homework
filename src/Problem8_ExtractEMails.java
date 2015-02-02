import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Problem8_ExtractEMails {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String inputText = input.nextLine();
		Pattern mail = 
				Pattern.compile
					("[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})");
		Matcher m = mail.matcher(inputText);
		while (m.find()) {
		    System.out.println(m.group(0));
		}
		input.close();
	}
}
