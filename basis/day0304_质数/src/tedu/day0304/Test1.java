package tedu.day0304;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("输入整数：");
		int n = new Scanner(System.in).nextInt();
		
		if(f(n)) {
			System.out.println("是质数");
		} else {
			System.out.println("不是质数");
		}
	}
	
	static boolean f(int n) {
		if(n<2) {
			return false;
		}
		
		if(n==2) {
			return true;
		}
		
		//2到n开方+1，找有没有能把n整除的值
		double max = Math.sqrt(n)+1;
		for(int i=2;i<max;i++) {
			//n能被i整除
			if(n%i==0) {
				return false;//n不是质数
			}
		}
		//判断了所有的值，都不能把n整除
		return true;//n是质数		
	}
}










