package tedu.day1303;

import java.util.Comparator;
import java.util.TreeMap;

public class Test2 {
	public static void main(String[] args) {
		Point p1 = new Point(1, 16);//1��
		Point p2 = new Point(2, 23);//2��
		
		TreeMap<Point, String> map = new TreeMap<>();
		map.put(p1, "1.6��");
		map.put(p2, "2.3��");
		System.out.println(map);
		
		System.out.println("------------------");
		
		map = new TreeMap<>(new Comparator<Point>() {
			/* o1��o2�Ƚϴ�С
			 * o1������
			 * o1С������
			 * ��ͬ��0
			 */
			@Override
			public int compare(Point o1, Point o2) {
				//���۶�Ӵ�С����
				return o2.getY() - o1.getY();
				
			}
		});
		
		map.put(p1, "1.6��");
		map.put(p2, "2.3��");
		System.out.println(map);
		
	}
}



