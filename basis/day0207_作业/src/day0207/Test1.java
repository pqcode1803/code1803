package day0207;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("身高：");
		double h = new Scanner(System.in).nextDouble();
		System.out.print("体重：");
		double w = new Scanner(System.in).nextDouble();
		
		double bmi = w / (h*h);
		if(bmi<18) {
			System.out.println("偏瘦");
		} else if(bmi<25) {
			System.out.println("标准");
		} else if(bmi<30) {
			System.out.println("偏胖");
		} else if(bmi<35) {
			System.out.println("中度肥胖");
		} else if(bmi<40) {
			System.out.println("肥胖");
		} else if(bmi<45) {
			System.out.println("重度肥胖");
		} else {
			System.out.println("超出测量范围");
		}
	}
}





