package tedu.day1102;

import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
		System.out.print("输入：");
		String s = new Scanner(System.in).nextLine();
		
		if(huiWen(s)) {
			System.out.println("是回文");
		} else {
			System.out.println("不是回文");
		}
	}

	private static boolean huiWen(String s) {
		/*
		 * 1.定义下标i=0,j=s.length()-1
		 * 2.当i<j
		 *     3.i位置的字符和j位置的字符不相等
		 *       返回false
		 *     4.i++,j--
		 * 5.循环结束后，返回true
		 */
		int i=0;
		int j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		
		return true;
		
	}
}






