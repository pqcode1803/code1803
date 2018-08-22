package day0308;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("输入两个整数：");
		int a = new Scanner(System.in).nextInt();
		int b = new Scanner(System.in).nextInt();
		
		int x = zdgys(a,b);
		long y = zxgbs(a,b);
		System.out.println(x);
		System.out.println(y);
	}
	
	static int zdgys(int a, int b) {
		int min=a<b?a:b;
		int r=1;
		for(int i=min;i>=1;i--) {
			if(a%i==0 && b%i==0) {
				r=i;
				break;
			}
		}
		return r;
	}
	
	
	
	
	
	static long zxgbs(int a, int b) {
		int max=a>b?a:b;
		int r=max;
		while(true) {
			if(r%a==0 && r%b==0) {
				break;
			}
			r+=max;
		}
		return r;
	}
	
}







