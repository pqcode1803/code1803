package tedu.day2201;

import java.lang.reflect.Field;

public class Test3 {
	public static void main(String[] args) throws Exception {
		/*
		 * Integer类中value常量
		 */
		Class<Integer> c = Integer.class;
		Integer a = Integer.valueOf(5);
		
		/*
		 * 反射访问私有常量 value
		 */
		Field f = c.getDeclaredField("value");
		//使私有成员也能访问
		f.setAccessible(true);
		//访问a实例中，这个变量的值
		Object v = f.get(a);
		System.out.println(v);
		
		//修改a实例中，这个变量的值，final也能改
		f.set(a, 555);
		v = f.get(a);
		System.out.println(v);
		
		
		////////////////////////////////
		Integer b = Integer.valueOf(5);
		System.out.println(b);
		
	}
}	



