package tedu.day0601;
/*
 * 封装：
 * 汽车相关的属性数据、方法代码，
 * 封装成一个“类”组件
 */
public class Car {
	String brand;//品牌
	int speed;//速度
	String color;//颜色
	
	public Car() {
		System.out.println("Car()");
	}
	public Car(String brand,
			   int speed,
			   String color) {
		System.out.println("Car(1,2,3)");
		//局部变量与成员变量同名时，
		//必须用 this.xxxx 访问成员变量	
		this.brand = brand;
		this.speed = speed;
		this.color = color;
	}

	public void go() {
		System.out.println(
		 color+"的"+brand+"前进");
	}
	public void stop() {
		System.out.println(
		 color+"的"+brand+"停止");
	}
	public String toString() {
		return "品牌："+brand
				+"颜色："+color
				+"速度："+speed;
	}
}





