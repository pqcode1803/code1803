package tedu.day0303;

import java.math.BigInteger;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("��������n����n�Ľ׳�:");
		int n =
		new Scanner(System.in).nextInt();
		
		//����f()����
		//�� n ��ֵ���ݵ�f()���м���
		//�ٵõ����ķ���ֵ�����浽���� r
		String r = f(n);//21�Ľ׳˾ͻᳬ��long��Χ
		System.out.println(n+"!  =  "+r);
	}
	
	//�����n�Ľ׳�
	static String f(int n) {
		//�������ı���r
		//long r = n;
		//ѭ��i,��n-1�ݼ���1
		//for(int i=n-1; i>=1; i--) {
		//	r *= i;
		//}
		//�ѽ�����ص�����ĵ���λ��
		//return r;
		BigInteger r = BigInteger.valueOf(n);
		for(int i=n-1; i>=1; i--) {
			r=r.multiply(BigInteger.valueOf(i)); 
		}
		return r.toString();
	}
	
	
	
}




