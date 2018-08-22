package tedu.day2202;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Runner {
	/*
	 * ...三个点，可变长参数，
	 * 是数组参数的简化语法
	 * 本质就是数组,
	 * 调用时，run(A.class, B.class, C.class)
	 * 参数数量多少个都行，0个也行
	 * 本质就是新建数组，存放所有参数，传到方法
	 */
	public static void run(Class... a) {
		for (Class c : a) {
			try {
				runTest(c);
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("无法执行类："+c);
			}
		}
	}

	private static void runTest(Class c) throws Exception {
		//执行类中所有 @Test 注解的方法
		//新建实例
		Object obj = c.newInstance();
		//获得所有方法
		Method[] a = c.getMethods();
		for (Method m : a) {
			try {
				runTest(c, obj, m);
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println(
				 c.getSimpleName()+"."+m.getName()+" 执行失败");
			}
		}
	}
	
	private static void runTest(
		 Class c, Object obj, Method m) throws Exception{
		
		//从方法m上获得@Test注解信息
		Test test = 
		 m.getAnnotation(Test.class);
		if(test == null) {
			return; //没有@Test注解，直接忽略
		}
		
		//取出注解属性数据
		int id = test.id();
		String value = test.value();
		
		System.out.println("id="+id+", value="+value);
		System.out.println("------------------------------------------");
		//执行这个方法
		m.invoke(obj);
		System.out.println("\n\n");
	}
}






