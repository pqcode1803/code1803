package tedu.day0304;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		System.out.print(
		 "��������n����n��������������");
		int n = new Scanner(System.in).nextInt();
		
		//����f()����
		//��n��ֵ���ݵ�f()�����н��м���
		//�ٵõ����ķ���ֵ
		int count = f(n);
		System.out.println(
		 n+"����"+count+"������");
	}
	
	static int f(int n) {
		//��������,��һ����֪������
		int c = 1;
		//��3��nѰ������
		outer:
		for(int i=3;i<=n;i++) {
			double max = Math.sqrt(i)+1;
			for(int j=2;j<max;j++) {
				//i�ܱ�j����
				if(i%j==0) {//i����������������һ��iֵ
					continue outer;
				}
			}
			//ǰ��û���ҵ��ܰ�i������ֵ
			c++;//i������,������������
		}
		return c;
	}
	
}






