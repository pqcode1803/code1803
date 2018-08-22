package tedu.day1402;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		while(true) {
			try {
				f();
				break;
			} catch (ArrayIndexOutOfBoundsException e) {
				//打印完整异常信息
				e.printStackTrace();
				System.out.println("输入两个整数，不是一个");
			} catch (ArithmeticException e) {
				System.out.println("不能除零");
			} catch (Exception e) {
				System.out.println("出错，请重试");
			} finally {
				System.out.println("---------------------");
			}
		}
	}

	private static void f() {
		System.out.print(
		"输入逗号分隔的两个整数：");
		String s = new Scanner(System.in).nextLine();
		// "34345,565" -->  ["34345", "565"]
		String[] a = s.split(",");
		int n1 = Integer.parseInt(a[0]);
		int n2 = Integer.parseInt(a[1]);
		int r = n1/n2;
		System.out.println(r);	
		//3453,75
		//5656
		//ssdf,eryerty
		//3453,0
	}
}






