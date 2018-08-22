package tedu.day0302;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		System.out.print("输入大小：");
		int n = new Scanner(System.in).nextInt();
		/*
			i
			1        *
			2       ***
			3      *****
			4     *******
			5    *********

			空格数量：n-i
			星号的数量： 2*i-1
		 */
		//1到n行
		for(int i=1;i<=n;i++) {
			//1到n-1个空格
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}			
			//1到2*i-1个星号
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}				
			//补换行
			System.out.println();
		}

	}
}






