package tedu.day0602;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		System.out.println("ѡ��������ͣ�");
		System.out.println("1. ��");
		System.out.println("2. è");
		System.out.print("ѡ��");
		int t = new Scanner(System.in).nextInt();
		
		System.out.print("������������֣�");
		String name = new Scanner(System.in).nextLine();
		
		//Dog dog = null;
		//Cat cat = null;
		Pet pet = null;
		
		switch(t) {
		case 1: pet = new Dog(name,50,50); break;
		case 2: pet = new Cat(name,50,50); break;
		default:
			System.out.println("û����ѡ��ĳ�������");
			return;
		}
		
		
		System.out.println("1. ιʳ");
		System.out.println("2. ��ˣ");
		System.out.println("3. �ͷ�");
		System.out.println("4. �˳�");
		
		outer: 
		while(true) {
			System.out.print("ָ�� -->");
			int c = new Scanner(System.in).nextInt();    
			switch(c) {
			case 1:
				pet.feed(); 
				break;
			case 2:
				pet.play(); 
				break;
			case 3:
				pet.punish(); 
				break;
			case 4:
				break outer;
			}
		}
		
	}
}







