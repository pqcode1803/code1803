package tedu.day1402;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		while(true) {
			try {
				f();
				break;
			} catch (ArrayIndexOutOfBoundsException e) {
				//��ӡ�����쳣��Ϣ
				e.printStackTrace();
				System.out.println("������������������һ��");
			} catch (ArithmeticException e) {
				System.out.println("���ܳ���");
			} catch (Exception e) {
				System.out.println("����������");
			} finally {
				System.out.println("---------------------");
			}
		}
	}

	private static void f() {
		System.out.print(
		"���붺�ŷָ�������������");
		String s = new Scanner(System.in).nextLine();
		// "34345,565" -->  ["34345", "565"]
		String[] a = s.split(",");
		int n1 = Integer.parseInt(a[0]);
		int n2 = Integer.parseInt(a[1]);
		int r = n1/n2;
		System.out.println(r);	
		//3453,75
		//5656
		//ssdf,eryerty
		//3453,0
	}
}






