package tedu.day1302;

import java.util.HashMap;

public class Test3 {
	public static void main(String[] args) {
		Student s1 = new Student(
		 9527,"�Ʋ���","��",19);
		Student s2 = new Student(
		 9527,"�Ʋ���","��",19);
		
		//��ͬ�Ĺ�ϣֵ�����ܱ�֤�������ͬ�±�
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		//��ʹ��ϣֵ��ͬ������ equals()��Ȳ��ܸ���
		System.out.println(s1.equals(s2));
		
		HashMap<Student, Integer> map = new HashMap<>();
		map.put(s1, 97);
		map.put(s2, 92);
		System.out.println(map);
	}
}	






