package tedu.day0602;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.println(
		 "���Ѿ���������ֻ���������������ְ�");
		System.out.print("����1��");
		String name1 = new Scanner(System.in).nextLine();
		System.out.print("����2��");
		String name2 = new Scanner(System.in).nextLine();
		//�½�����Dog���󣬱��浽����d1,d2
		Dog d1 = new Dog(name1,50,50);
		Dog d2 = new Dog(name2,50,50);
		//d1.name = name1;
		//d1.full = 50;
		//d1.happy = 50;
		//d2.name = name2;
		//d2.full = 50;
		//d2.happy = 50;
		
		System.out.println("1. ιʳ");
		System.out.println("2. ��ˣ");
		System.out.println("3. �ͷ�");
		System.out.println("4. �˳�");
		outer:
		while(true) {
			System.out.print("ָ��-->");
			int c = new Scanner(System.in).nextInt();
			switch(c) {
			case 1: d1.feed(); d2.feed(); break;
			case 2: d1.play(); d2.play(); break;
			case 3: d1.punish(); d2.punish(); break;
			case 4: break outer;
			}
		}
		
		
	}
}






