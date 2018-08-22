package tedu.day1104;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test5 {
	public static void main(String[] args) {
		System.out.println(" ‰»Î£∫");
		String s = new Scanner(System.in).nextLine();
		
		String regex = "\\d{3,}";
		/* find()
		 * group()
		 * start()
		 * end() */
		Matcher m = 
		 Pattern.compile(regex).matcher(s);		
		while(m.find()) {
			String sub = m.group();
			int a = m.start();
			int b = m.end();
			System.out.println(
			a+"-"+b+":  "+sub);
		}
	}
}






