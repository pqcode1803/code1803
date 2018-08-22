package tedu.day1104;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		System.out.println(" ‰»Î£∫");
		String s = new Scanner(System.in).nextLine();
		
		String regex = "aaa|bbb|ccc|ddd|ccc";
		
		s = s.replaceAll(regex, "***");
		System.out.println(s);
	}
}





