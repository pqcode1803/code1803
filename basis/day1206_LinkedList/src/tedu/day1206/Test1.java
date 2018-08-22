package tedu.day1206;

import java.util.Iterator;
import java.util.LinkedList;

public class Test1 {
	public static void main(String[] args) {
		/*
		 * <> 泛型
		 * 限制集合中取存放的数据类型
		 */
		LinkedList<String> list = new LinkedList<>();
		list.add("aaa");
		list.add("ggg");
		list.add("www");
		list.add("jjj");
		list.add("ooo");
		list.add("qqq");
		list.add("aaa");
		list.add("aaa");
		list.add(null);
		
		System.out.println(list.size());
		System.out.println(list);
		System.out.println(list.get(3));//取下标3位置的值
		System.out.println(list.set(5, "555"));//替换下标5位置的值
		System.out.println(list);
		System.out.println(list.remove(2));//删除下标2位置数据
		System.out.println(list);
		System.out.println(list.remove("aaa"));//删除第一个"aaa"
		System.out.println(list);
		/*
		 * list.get(i)
		 * 访问任何位置，都是从第一个节点，
		 * 一步一步地向后引用到指定位置
		 * 
		 * 双向链表下标遍历效率低
		 */
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		//迭代器遍历
		//双向链表迭代器遍历效率高
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {//还有下一个
			String s = it.next();
			System.out.println(s);
		}
	}
}






