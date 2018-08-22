package tedu.day0504;

import java.util.Scanner;

public class Test1 {
	static int c;
	public static void main(String[] args) {
		System.out.print("输入整数，求阶乘：");
		int n = new Scanner(System.in).nextInt();
		try {
			long r = f(n);
			System.out.println(r);
		} catch (Throwable e) {
			System.out.println(c);
		}
	}

	private static long f(int n) {
		//if(n==0) return 1;// 最简问题
		c++;
		return n*f(n-1);//递归调用
	}
}



