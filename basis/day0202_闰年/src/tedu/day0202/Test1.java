package tedu.day0202;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("输入年号：");
		//得到输入的值，保存到变量y
		int y = 
		 new Scanner(System.in).nextInt();
		
		//y能否被4,100,400整除
		boolean a = y%4==0;
		boolean b = y%100==0;
		boolean c = y%400==0;
		
		//字符串变量，先赋值"平年"
		//之后如果判断是闰年，
		//再修改这个变量，改成"闰年"
		String r = "平年";
		
		//如果a是true（能被4整除）
		/*if(a) {
			//能被4整除的情况下，
			//进一步判断b是false（不能被100整除）
			if(b == false) {
				r = "闰年";
			}
		}
		
		//如果c是true（能被400整除）
		if(c) {
			r = "闰年";
		}*/
		
		//a是真并且“非b”是真（即b是假）
		//或者，c是真
		if((a && !b) || c) {
			r = "闰年";
		}
		
		System.out.println(y+"年是"+r);
	}
}





