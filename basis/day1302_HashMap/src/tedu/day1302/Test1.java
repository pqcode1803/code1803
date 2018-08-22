package tedu.day1302;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Test1 {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(9527, "�Ʋ���");
		map.put(9528, "������");
		map.put(9529, "ʯ���");
		map.put(9530, "ף֦ɽ");
		map.put(9531, "����");
		map.put(9532, "����");
		map.put(9533, "Сǿ");
		map.put(9531, "�绨");
		map.put(9534, null);
		map.put(null, "---");
		System.out.println(map.size());
		System.out.println(map);
		System.out.println(map.get(9527));
		System.out.println(map.get(9999));
		System.out.println(map.containsValue(9528));
		System.out.println(map.containsValue("�绨"));
		System.out.println(map.remove(9533));
		System.out.println(map);
		
		
		System.out.println("----------------------------------");
		
		//��map��ȡ�����еļ���������Set����
		Set<Integer> keys = map.keySet();
		
		for(Iterator<Integer> it = keys.iterator(); it.hasNext(); ) {
			Integer k = it.next();//��һ����
			String v = map.get(k);//����Ӧ��ֵ
			System.out.println(k+"="+v);
		}
		
		System.out.println("--------------------------------");
		
		for(Integer k : keys) {
			String v = map.get(k);//����Ӧ��ֵ
			System.out.println(k+"="+v);
		}
		
		
	}
}






