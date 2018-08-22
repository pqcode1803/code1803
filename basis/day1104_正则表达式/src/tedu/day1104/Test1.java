package tedu.day1104;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("输入身份证号：");
		String s = new Scanner(System.in).nextLine();
		
		/*
		 * 123456789012345
		 * 123456789012345678
		 * 12345678901234567x
		 * 12345678901234567X
		 * 
		 * |
		 * \d{15}|
		 * \d{15}|\d{17}
		 * \d{15}|\d{17}[\dxX]
		 * 
		 * \\d{15}|\\d{17}[\\dxX]
		 */
		String regex = "\\d{15}|\\d{17}[\\dxX]";
		
		if(s.matches(regex)) {
			System.out.println("格式正确");
		} else {
			System.out.println("格式错误");
		}
	}
}


