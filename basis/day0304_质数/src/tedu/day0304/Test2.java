package tedu.day0304;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		System.out.print(
		 "输入整数n，求n内质数的数量：");
		int n = new Scanner(System.in).nextInt();
		
		//调用f()方法
		//把n的值传递到f()方法中进行计算
		//再得到它的返回值
		int count = f(n);
		System.out.println(
		 n+"内有"+count+"个质数");
	}
	
	static int f(int n) {
		//计数变量,有一个已知的质数
		int c = 1;
		//从3到n寻找质数
		outer:
		for(int i=3;i<=n;i++) {
			double max = Math.sqrt(i)+1;
			for(int j=2;j<max;j++) {
				//i能被j整除
				if(i%j==0) {//i不是质数，跳到下一个i值
					continue outer;
				}
			}
			//前面没有找到能把i整除的值
			c++;//i是质数,计数变量增加
		}
		return c;
	}
	
}






