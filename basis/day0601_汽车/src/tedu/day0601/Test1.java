package tedu.day0601;

public class Test1 {
	public static void main(String[] args) {
		//新建Car对象，把它的内存地址保存到变量c1
		//访问c1的三个变量，为三个变量赋值
		Car c1 = new Car();
		c1.brand = "别摸我";
		c1.color = "红色";
		c1.speed = 240;
		
		//让c1对象去执行go()和stop()方法
		c1.go();
		c1.stop();
		
		System.out.println(c1.toString());
		
		Car c2 = new Car("保+洁",30,"绿色");
		c2.go();
		c2.stop();		
		System.out.println(c2.toString());
		
	}
}




