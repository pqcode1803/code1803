package tedu.day1102;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		System.out.print("输入email：");
		String e = new Scanner(System.in).nextLine();
		String name = getName(e);
		System.out.println(name);
	}

	private static String getName(String e) {
		/*
		 	1. 找到@符号的位置下标 index
			2. 下标index是-1，返回"格式不对"
			3. 截取[0, index)并返回
		 **/
		int index = e.indexOf("@");
		if(index==-1) {
			return "格式不正确";
		}
		
		return e.substring(0,index);		
	}
}







