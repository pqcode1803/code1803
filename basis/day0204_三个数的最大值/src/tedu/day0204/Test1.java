package tedu.day0204;
import java.util.Scanner;
public class Test1 {
	public static void main(String[] args) {
		System.out.println("输入三个整数：");
		int a = new Scanner(System.in).nextInt();
		int b = new Scanner(System.in).nextInt();
		int c = new Scanner(System.in).nextInt();
		
		//a,b最大值，保存到max
		//max,c最大值，保存到max
		//int max= a>b ? a : b;
		//max= max>c ? max : c;
		
		int max = a>b ? (a>c?a:c) : (b>c?b:c);
		
		System.out.println(max);
	}
}



