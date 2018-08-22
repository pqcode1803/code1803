package tedu.day0302;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		System.out.print("输入大小：");
		int n = new Scanner(System.in).nextInt();
		
		//1到n行
		for(int i=1;i<=n;i++) {
			//1到n个星号
			for(int j=1;j<=n;j++) {
				System.out.print("*");
			}
			System.out.println();//补一个换行
		}
	}
}







