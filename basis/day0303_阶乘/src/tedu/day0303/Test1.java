package tedu.day0303;

import java.math.BigInteger;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("输入整数n，求n的阶乘:");
		int n =
		new Scanner(System.in).nextInt();
		
		//调用f()方法
		//把 n 的值传递到f()进行计算
		//再得到它的返回值，保存到变量 r
		String r = f(n);//21的阶乘就会超出long范围
		System.out.println(n+"!  =  "+r);
	}
	
	//求参数n的阶乘
	static String f(int n) {
		//保存结果的变量r
		//long r = n;
		//循环i,从n-1递减到1
		//for(int i=n-1; i>=1; i--) {
		//	r *= i;
		//}
		//把结果返回到上面的调用位置
		//return r;
		BigInteger r = BigInteger.valueOf(n);
		for(int i=n-1; i>=1; i--) {
			r=r.multiply(BigInteger.valueOf(i)); 
		}
		return r.toString();
	}
	
	
	
}




