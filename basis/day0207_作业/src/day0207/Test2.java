package day0207;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		System.out.print("����(��)��");
		double p = new Scanner(System.in).nextDouble();
		System.out.print("�����ʣ�");
		double r = new Scanner(System.in).nextDouble();
		System.out.print("�꣺");
		int m = new Scanner(System.in).nextInt();
		
		p *= 10000;
		r /= 1200;
		m *= 12;
		
		double x = Math.pow(1+r, m);
		/*
		 * 8145.458513609572
		 * 814545.8513609572
		 * 
		 */
		double s = (p*r*x) / (x-1);
		s *= 100;
		s = Math.round(s);
		s /= 100;
		
		System.out.println("�»��"+s);
	}
}




