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
		System.out.println("����������");
		String s = new Scanner(System.in).nextLine();
		Class<?> c = Class.forName(s);
		System.out.println("--��������-----------------------");
		f1(c);
		System.out.println("--��Ա����-----------------------");
		f2(c);
		System.out.println("--���췽��-----------------------");
		f3(c);
		System.out.println("--����-----------------------");
		f4(c);
		
	}

	private static void f4(Class<?> c) {
		/*
		 * Method �����װһ�������Ķ�����Ϣ
		 * 
		 * public static int a(����) throws �쳣
		 */
		Method[] a = c.getDeclaredMethods();
		
		for (Method t : a) {
			//���η�
			String m = 
			Modifier.toString(t.getModifiers());
			//��������
			String r = 
			 t.getReturnType().getSimpleName();
			//������
			String n = t.getName();
			//���������б�
			Class<?>[] p = t.getParameterTypes();
			//�쳣�����б�
			Class<?>[] e = t.getExceptionTypes();
			
			System.out.println(
			 m+" "+n+"("+Arrays.toString(p)+
			 ") throws "+Arrays.toString(e));
			
		}
	}

	
	
	
	private static void f3(Class<?> c) {
		/*
		 * Constructor��װһ�����췽���Ķ�����Ϣ
		 * 
		 * public A(����) throws �쳣
		 */
		Constructor<?>[] a = 
		c.getDeclaredConstructors();
		
		for (Constructor<?> t : a) {
			//���η�
			String m = 
			Modifier.toString(t.getModifiers());
			//���췽����������
			String n = c.getSimpleName();
			//���������б�
			Class<?>[] p = t.getParameterTypes();
			//�쳣�����б�
			Class<?>[] e = t.getExceptionTypes();
			
			System.out.println(
			 m+" "+n+"("+Arrays.toString(p)+
			 ") throws "+Arrays.toString(e));
			
		}
		
	}

	
	
	
	
	
	private static void f2(Class<?> c) {
		/*
		 * Field���󣬷�װһ�������Ķ�����Ϣ
		 * 
		 * private static final int x;
		 */
		Field[] a = c.getDeclaredFields();
		for (Field f : a) {
			//���η�
			String s =
			 Modifier.toString(f.getModifiers());
			//��������
			String t =
			 f.getType().getSimpleName();
			//������
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






