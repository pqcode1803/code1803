package tedu.day2201;

import java.lang.reflect.Field;

public class Test3 {
	public static void main(String[] args) throws Exception {
		/*
		 * Integer����value����
		 */
		Class<Integer> c = Integer.class;
		Integer a = Integer.valueOf(5);
		
		/*
		 * �������˽�г��� value
		 */
		Field f = c.getDeclaredField("value");
		//ʹ˽�г�ԱҲ�ܷ���
		f.setAccessible(true);
		//����aʵ���У����������ֵ
		Object v = f.get(a);
		System.out.println(v);
		
		//�޸�aʵ���У����������ֵ��finalҲ�ܸ�
		f.set(a, 555);
		v = f.get(a);
		System.out.println(v);
		
		
		////////////////////////////////
		Integer b = Integer.valueOf(5);
		System.out.println(b);
		
	}
}	



