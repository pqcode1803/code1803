package tedu.day0307;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
public class Test1 {
	public static void main(String[] args) {
		// 1+[0,1000)
		int r = 1+new Random().nextInt(1000);
		System.out.println(r);
		
		//��ѭ����ֱ���¶�Ϊֹ
		while(true) {
			System.out.print("�£�");
			int c;
			try {
				c = new Scanner(System.in).nextInt();
			} catch (InputMismatchException e) {
				System.out.println("�����������������");
				continue;
			}
			if(c>r) {
				System.out.println("��");
			} else if(c<r) {
				System.out.println("С");
			} else {
				System.out.println("��");
				break;
			}
		}
		
	}
}





