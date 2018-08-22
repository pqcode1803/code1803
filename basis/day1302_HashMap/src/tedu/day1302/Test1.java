package tedu.day1302;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Test1 {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(9527, "唐伯虎");
		map.put(9528, "华夫人");
		map.put(9529, "石榴姐");
		map.put(9530, "祝枝山");
		map.put(9531, "秋香");
		map.put(9532, "旺财");
		map.put(9533, "小强");
		map.put(9531, "如花");
		map.put(9534, null);
		map.put(null, "---");
		System.out.println(map.size());
		System.out.println(map);
		System.out.println(map.get(9527));
		System.out.println(map.get(9999));
		System.out.println(map.containsValue(9528));
		System.out.println(map.containsValue("如花"));
		System.out.println(map.remove(9533));
		System.out.println(map);
		
		
		System.out.println("----------------------------------");
		
		//从map，取出所有的键，创建成Set集合
		Set<Integer> keys = map.keySet();
		
		for(Iterator<Integer> it = keys.iterator(); it.hasNext(); ) {
			Integer k = it.next();//下一个键
			String v = map.get(k);//键对应的值
			System.out.println(k+"="+v);
		}
		
		System.out.println("--------------------------------");
		
		for(Integer k : keys) {
			String v = map.get(k);//键对应的值
			System.out.println(k+"="+v);
		}
		
		
	}
}






