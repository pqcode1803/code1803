package tedu.day0307;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
public class Test1 {
	public static void main(String[] args) {
		// 1+[0,1000)
		int r = 1+new Random().nextInt(1000);
		System.out.println(r);
		
		//死循环，直到猜对为止
		while(true) {
			System.out.print("猜：");
			int c;
			try {
				c = new Scanner(System.in).nextInt();
			} catch (InputMismatchException e) {
				System.out.println("输入错误，请重新输入");
				continue;
			}
			if(c>r) {
				System.out.println("大");
			} else if(c<r) {
				System.out.println("小");
			} else {
				System.out.println("对");
				break;
			}
		}
		
	}
}





