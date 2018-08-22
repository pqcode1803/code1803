package tedu.day0206;

import java.math.BigDecimal;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("���빤�ʣ�");
		double sal = 
		 new Scanner(System.in).nextDouble();
		//����f()����������sal�����������������
		//�ٵõ������صļ����������浽����tax
		double tax = f(sal);
		System.out.println(
		 "��������˰��"+tax);
	}
	
	static double f(double sal) {
		/*
		 * 1.����3500������˰������0
		 * 2.�����ٵ�3500
		 * 3.����˰�ʱ���r=0������۳�����k=0
		 * 4.���ݷ�Χ��Ϊr��k��ֵ
		 * 5.�����������˰��������
		 */
		if(sal<=3500) {
			return 0;
		}
		
		//sal -= 3500;
		sal = BigDecimal
				.valueOf(sal)
				.subtract(BigDecimal.valueOf(3500))
				.doubleValue();
		
		double r = 0;
		int k = 0;
		
		if(sal<=1500) {
			r = 0.03;
			k = 0;
		} else if(sal<=4500) {
			r = 0.1;
			k = 105;
		} else if(sal<=9000) {
			r = 0.2;
			k = 555;
		} else if(sal<=35000) {
			r = 0.25;
			k = 1005;
		} else if(sal<=55000) {
			r = 0.3;
			k = 2755;
		} else if(sal<=80000) {
			r = 0.35;
			k = 5505;
		} else {
			r = 0.45;
			k = 13505;
		}
		
		//return sal*r-k;
		BigDecimal bd1 = BigDecimal.valueOf(sal);
		BigDecimal bd2 = BigDecimal.valueOf(r);
		BigDecimal bd3 = BigDecimal.valueOf(k);
		return bd1.multiply(bd2)
				  .subtract(bd3)
				  .doubleValue();
	}
}







