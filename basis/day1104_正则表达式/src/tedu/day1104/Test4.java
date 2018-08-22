package tedu.day1104;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		System.out.println(
		 "输入关键词列表,用逗号、分号或空格分隔：");
		String s = new Scanner(System.in).nextLine();
		
		//aa,bb;cc dd,,ee,,;;  ;, ;,ff
		String regex = "[,; ]+";
		
		String[] a = s.split(regex);
		for (int i = 0; i < a.length; i++) {
			String str = a[i];
			System.out.println(str);
		}
	}
}



