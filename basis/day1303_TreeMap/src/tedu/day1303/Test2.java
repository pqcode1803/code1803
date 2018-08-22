package tedu.day1303;

import java.util.Comparator;
import java.util.TreeMap;

public class Test2 {
	public static void main(String[] args) {
		Point p1 = new Point(1, 16);//1月
		Point p2 = new Point(2, 23);//2月
		
		TreeMap<Point, String> map = new TreeMap<>();
		map.put(p1, "1.6亿");
		map.put(p2, "2.3亿");
		System.out.println(map);
		
		System.out.println("------------------");
		
		map = new TreeMap<>(new Comparator<Point>() {
			/* o1和o2比较大小
			 * o1大，正数
			 * o1小，负数
			 * 相同，0
			 */
			@Override
			public int compare(Point o1, Point o2) {
				//销售额从大到小排列
				return o2.getY() - o1.getY();
				
			}
		});
		
		map.put(p1, "1.6亿");
		map.put(p2, "2.3亿");
		System.out.println(map);
		
	}
}



