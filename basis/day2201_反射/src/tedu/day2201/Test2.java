package tedu.day2201;

import java.lang.reflect.Constructor;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) throws Exception {
		System.out.println("输入类名：");
		String s = new Scanner(System.in).nextLine();
		
		Class<?> c = Class.forName(s);
		
		Object o1 = null;
		Object o2 = null;
		
		try {
			o1 = c.newInstance();
			System.out.println(o1);
		} catch (Exception e) {
			System.out.println("没有无参构造");
		}
		System.out.println("------------------------------");
		
		try {
			//int参数
			Constructor<?> t = 
			 c.getConstructor(int.class);
			
			o2 = t.newInstance(6);
			System.out.println(o2);
		} catch (Exception e) {
			System.out.println("没有int参数的构造方法");
		}
		
	}
}	



