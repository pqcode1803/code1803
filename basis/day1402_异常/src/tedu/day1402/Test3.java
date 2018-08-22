package tedu.day1402;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		f();
	}

	private static void f() {
		System.out.println("输入两个浮点数：");
		double a = new Scanner(System.in).nextDouble();
		double b = new Scanner(System.in).nextDouble();
		
		try {
			double r = divide(a,  b);		
			System.out.println(r);
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println(
			"不能除零使我们的错，请鞭笞我们吧");
		}
	}

	private static double divide(double a, double b) {
		//除数是0，错误情况，抛出异常
		if(b==0) {
			ArithmeticException e = 
			 new ArithmeticException("/ by zero");
			
			throw e;
		}
		return a/b;
	}
}






