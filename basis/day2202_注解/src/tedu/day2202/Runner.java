package tedu.day2202;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Runner {
	/*
	 * ...�����㣬�ɱ䳤������
	 * ����������ļ��﷨
	 * ���ʾ�������,
	 * ����ʱ��run(A.class, B.class, C.class)
	 * �����������ٸ����У�0��Ҳ��
	 * ���ʾ����½����飬������в�������������
	 */
	public static void run(Class... a) {
		for (Class c : a) {
			try {
				runTest(c);
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("�޷�ִ���ࣺ"+c);
			}
		}
	}

	private static void runTest(Class c) throws Exception {
		//ִ���������� @Test ע��ķ���
		//�½�ʵ��
		Object obj = c.newInstance();
		//������з���
		Method[] a = c.getMethods();
		for (Method m : a) {
			try {
				runTest(c, obj, m);
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println(
				 c.getSimpleName()+"."+m.getName()+" ִ��ʧ��");
			}
		}
	}
	
	private static void runTest(
		 Class c, Object obj, Method m) throws Exception{
		
		//�ӷ���m�ϻ��@Testע����Ϣ
		Test test = 
		 m.getAnnotation(Test.class);
		if(test == null) {
			return; //û��@Testע�⣬ֱ�Ӻ���
		}
		
		//ȡ��ע����������
		int id = test.id();
		String value = test.value();
		
		System.out.println("id="+id+", value="+value);
		System.out.println("------------------------------------------");
		//ִ���������
		m.invoke(obj);
		System.out.println("\n\n");
	}
}






