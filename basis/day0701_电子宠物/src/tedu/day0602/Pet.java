package tedu.day0602;

import java.util.Random;

public abstract class Pet {
	String name;//名字
	int full;//饱食度
	int happy;//快乐度

	public Pet(String name,
			int full,
			int happy) {
		this.name = name;
		this.full = full;
		this.happy = happy;
	}

	// 喂食
	public void feed() {
		if(full == 100) {
			System.out.println(
					name+"已经吃不下了");
			return;
		}
		System.out.println("给"+name+"喂食");
		int d = new Random().nextInt(10);
		if(full+d > 100) {
			full = 100;
		} else {
			full += d;
		}
		System.out.println(name+"的饱食度："+full);
	}
	// 玩耍
	public void play() {
		if(full == 0) {
			System.out.println(
					name+"已经饿得玩不动了");
			return;
		}
		System.out.println("陪"+name+"玩耍");
		//增加快乐度
		int d1 = new Random().nextInt(10);
		//降低饱食度
		int d2 = new Random().nextInt(10);

		happy += d1;

		if(full-d2 < 0) {
			full = 0;
		} else {
			full -= d2;
		}
		System.out.println(name+"的快乐度："+happy);
		System.out.println(name+"的饱食度："+full);
	}
	// 惩罚
	public void punish() {
		//cry()方法，获取哭叫声
		System.out.println(
			"打"+name+"的PP，"+name+"哭叫："+cry());

		int d = new Random().nextInt(10);
		happy -= d;

		System.out.println(name+"的快乐度："+happy);
	}
	
	//抽象方法：
	//只有方法的定义，没有方法体
	//在具体子类中，必须实现
	public abstract String cry();
	
}




