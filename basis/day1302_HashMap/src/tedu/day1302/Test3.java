package tedu.day1302;

import java.util.HashMap;

public class Test3 {
	public static void main(String[] args) {
		Student s1 = new Student(
		 9527,"唐伯虎","男",19);
		Student s2 = new Student(
		 9527,"唐伯虎","男",19);
		
		//相同的哈希值，才能保证计算出相同下标
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		//即使哈希值相同，必须 equals()相等才能覆盖
		System.out.println(s1.equals(s2));
		
		HashMap<Student, Integer> map = new HashMap<>();
		map.put(s1, 97);
		map.put(s2, 92);
		System.out.println(map);
	}
}	






