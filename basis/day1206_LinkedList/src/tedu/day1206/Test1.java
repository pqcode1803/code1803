package tedu.day1206;

import java.util.Iterator;
import java.util.LinkedList;

public class Test1 {
	public static void main(String[] args) {
		/*
		 * <> ����
		 * ���Ƽ�����ȡ��ŵ���������
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
		System.out.println(list.get(3));//ȡ�±�3λ�õ�ֵ
		System.out.println(list.set(5, "555"));//�滻�±�5λ�õ�ֵ
		System.out.println(list);
		System.out.println(list.remove(2));//ɾ���±�2λ������
		System.out.println(list);
		System.out.println(list.remove("aaa"));//ɾ����һ��"aaa"
		System.out.println(list);
		/*
		 * list.get(i)
		 * �����κ�λ�ã����Ǵӵ�һ���ڵ㣬
		 * һ��һ����������õ�ָ��λ��
		 * 
		 * ˫�������±����Ч�ʵ�
		 */
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		//����������
		//˫���������������Ч�ʸ�
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {//������һ��
			String s = it.next();
			System.out.println(s);
		}
	}
}






