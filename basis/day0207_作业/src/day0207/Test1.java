package day0207;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("��ߣ�");
		double h = new Scanner(System.in).nextDouble();
		System.out.print("���أ�");
		double w = new Scanner(System.in).nextDouble();
		
		double bmi = w / (h*h);
		if(bmi<18) {
			System.out.println("ƫ��");
		} else if(bmi<25) {
			System.out.println("��׼");
		} else if(bmi<30) {
			System.out.println("ƫ��");
		} else if(bmi<35) {
			System.out.println("�жȷ���");
		} else if(bmi<40) {
			System.out.println("����");
		} else if(bmi<45) {
			System.out.println("�ضȷ���");
		} else {
			System.out.println("����������Χ");
		}
	}
}





