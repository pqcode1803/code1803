package tedu.day1102;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		System.out.print("����email��");
		String e = new Scanner(System.in).nextLine();
		String name = getName(e);
		System.out.println(name);
	}

	private static String getName(String e) {
		/*
		 	1. �ҵ�@���ŵ�λ���±� index
			2. �±�index��-1������"��ʽ����"
			3. ��ȡ[0, index)������
		 **/
		int index = e.indexOf("@");
		if(index==-1) {
			return "��ʽ����ȷ";
		}
		
		return e.substring(0,index);		
	}
}







