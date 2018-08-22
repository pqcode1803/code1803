package tedu.day0302;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		System.out.print("输入大小：");
		int n = new Scanner(System.in).nextInt();

		/*
			i
			1 *
			2 **
			3 ***
			4 ****
			5 *****
			  12345 j
		 */
		//1到n行
		for(int i=1;i<=n;i++) {
			//1到i个星号
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();//补一个换行
		}
	}
}
