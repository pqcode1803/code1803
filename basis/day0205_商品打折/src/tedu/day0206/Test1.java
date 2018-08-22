package tedu.day0206;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("输入工资：");
		double s =
		new Scanner(System.in).nextDouble();
		
		if(s<=3500) {
			System.out.println("没有达到起征点");
			return;//结束方法，后面代码不执行
		}
		
		//刨掉3500
		s -= 3500; //s = s-3500;
		
		//根据s的范围，来确定税率和速算扣除数
		double r = 0;//税率变量
		int k = 0;//速算扣除数变量
		
		if(s<=1500) {
			r=0.03; k=0;
		} else if(s<=4500) {
			r=0.1;  k=105;
		} else if(s<=9000) {
			r=0.2;  k=555;
		} else if(s<=45000) {
			r=0.25; k=1005;
		} else if(s<=55000) {
			r=0.3;  k=2755;
		} else if(s<=80000) {
			r=0.35; k=5505;
		} else {
			r=0.45; k=13505;
		}
		
		double tax = s*r - k;
		System.out.println("个人所得税："+tax);
		
	}
}






