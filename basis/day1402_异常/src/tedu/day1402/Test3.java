package tedu.day1402;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		f();
	}

	private static void f() {
		System.out.println("����������������");
		double a = new Scanner(System.in).nextDouble();
		double b = new Scanner(System.in).nextDouble();
		
		try {
			double r = divide(a,  b);		
			System.out.println(r);
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println(
			"���ܳ���ʹ���ǵĴ���������ǰ�");
		}
	}

	private static double divide(double a, double b) {
		//������0������������׳��쳣
		if(b==0) {
			ArithmeticException e = 
			 new ArithmeticException("/ by zero");
			
			throw e;
		}
		return a/b;
	}
}






