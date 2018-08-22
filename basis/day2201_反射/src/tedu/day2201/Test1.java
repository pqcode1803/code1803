package tedu.day2201;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) throws Exception {
		/*
		 * "java.lang.String"
		 * "java.util.Date"
		 * "java.io.File"
		 * "java.swing.JFrame"
		 */
		System.out.println("输入类名：");
		String s = new Scanner(System.in).nextLine();
		Class<?> c = Class.forName(s);
		System.out.println("--包名类名-----------------------");
		f1(c);
		System.out.println("--成员变量-----------------------");
		f2(c);
		System.out.println("--构造方法-----------------------");
		f3(c);
		System.out.println("--方法-----------------------");
		f4(c);
		
	}

	private static void f4(Class<?> c) {
		/*
		 * Method 对象封装一个方法的定义信息
		 * 
		 * public static int a(参数) throws 异常
		 */
		Method[] a = c.getDeclaredMethods();
		
		for (Method t : a) {
			//修饰符
			String m = 
			Modifier.toString(t.getModifiers());
			//返回类型
			String r = 
			 t.getReturnType().getSimpleName();
			//方法名
			String n = t.getName();
			//参数类型列表
			Class<?>[] p = t.getParameterTypes();
			//异常类型列表
			Class<?>[] e = t.getExceptionTypes();
			
			System.out.println(
			 m+" "+n+"("+Arrays.toString(p)+
			 ") throws "+Arrays.toString(e));
			
		}
	}

	
	
	
	private static void f3(Class<?> c) {
		/*
		 * Constructor封装一个构造方法的定义信息
		 * 
		 * public A(参数) throws 异常
		 */
		Constructor<?>[] a = 
		c.getDeclaredConstructors();
		
		for (Constructor<?> t : a) {
			//修饰符
			String m = 
			Modifier.toString(t.getModifiers());
			//构造方法名，类名
			String n = c.getSimpleName();
			//参数类型列表
			Class<?>[] p = t.getParameterTypes();
			//异常类型列表
			Class<?>[] e = t.getExceptionTypes();
			
			System.out.println(
			 m+" "+n+"("+Arrays.toString(p)+
			 ") throws "+Arrays.toString(e));
			
		}
		
	}

	
	
	
	
	
	private static void f2(Class<?> c) {
		/*
		 * Field对象，封装一个变量的定义信息
		 * 
		 * private static final int x;
		 */
		Field[] a = c.getDeclaredFields();
		for (Field f : a) {
			//修饰符
			String s =
			 Modifier.toString(f.getModifiers());
			//变量类型
			String t =
			 f.getType().getSimpleName();
			//变量名
			String n = f.getName();
			
			System.out.println(s+" "+t+" "+n);			
		}
	}

	private static void f1(Class<?> c) {
		System.out.println(c.getPackage().getName());
		System.out.println(c.getName());
		System.out.println(c.getSimpleName());
	}
}






