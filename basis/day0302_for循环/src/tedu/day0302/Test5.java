package tedu.day0302;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		System.out.print("�����С��");
		int n = new Scanner(System.in).nextInt();
		/*
			i
			1        *
			2       ***
			3      *****
			4     *******
			5    *********

			�ո�������n-i
			�Ǻŵ������� 2*i-1
		 */
		//1��n��
		for(int i=1;i<=n;i++) {
			//1��n-1���ո�
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}			
			//1��2*i-1���Ǻ�
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}				
			//������
			System.out.println();
		}

	}
}






