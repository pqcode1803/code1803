package tedu.day1102;

import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
		System.out.print("���룺");
		String s = new Scanner(System.in).nextLine();
		
		if(huiWen(s)) {
			System.out.println("�ǻ���");
		} else {
			System.out.println("���ǻ���");
		}
	}

	private static boolean huiWen(String s) {
		/*
		 * 1.�����±�i=0,j=s.length()-1
		 * 2.��i<j
		 *     3.iλ�õ��ַ���jλ�õ��ַ������
		 *       ����false
		 *     4.i++,j--
		 * 5.ѭ�������󣬷���true
		 */
		int i=0;
		int j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		
		return true;
		
	}
}






