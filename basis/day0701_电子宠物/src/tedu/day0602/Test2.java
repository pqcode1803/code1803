package tedu.day0602;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		System.out.println("选择宠物类型：");
		System.out.println("1. 狗");
		System.out.println("2. 猫");
		System.out.print("选择：");
		int t = new Scanner(System.in).nextInt();
		
		System.out.print("给宠物起个名字：");
		String name = new Scanner(System.in).nextLine();
		
		//Dog dog = null;
		//Cat cat = null;
		Pet pet = null;
		
		switch(t) {
		case 1: pet = new Dog(name,50,50); break;
		case 2: pet = new Cat(name,50,50); break;
		default:
			System.out.println("没有你选择的宠物类型");
			return;
		}
		
		
		System.out.println("1. 喂食");
		System.out.println("2. 玩耍");
		System.out.println("3. 惩罚");
		System.out.println("4. 退出");
		
		outer: 
		while(true) {
			System.out.print("指令 -->");
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







