package tedu.day0302;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		System.out.print("�����С��");
		int n = new Scanner(System.in).nextInt();
		
		//1��n��
		for(int i=1;i<=n;i++) {
			//1��n���Ǻ�
			for(int j=1;j<=n;j++) {
				System.out.print("*");
			}
			System.out.println();//��һ������
		}
	}
}







