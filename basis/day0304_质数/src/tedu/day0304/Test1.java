package tedu.day0304;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("����������");
		int n = new Scanner(System.in).nextInt();
		
		if(f(n)) {
			System.out.println("������");
		} else {
			System.out.println("��������");
		}
	}
	
	static boolean f(int n) {
		if(n<2) {
			return false;
		}
		
		if(n==2) {
			return true;
		}
		
		//2��n����+1������û���ܰ�n������ֵ
		double max = Math.sqrt(n)+1;
		for(int i=2;i<max;i++) {
			//n�ܱ�i����
			if(n%i==0) {
				return false;//n��������
			}
		}
		//�ж������е�ֵ�������ܰ�n����
		return true;//n������		
	}
}










