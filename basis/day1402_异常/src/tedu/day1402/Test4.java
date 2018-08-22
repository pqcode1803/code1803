package tedu.day1402;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

public class Test4 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		Collections.addAll(
				list,
				"2018-5-2",
				"2018-5-8",
				"2018-5-12",
				"2018-5-3",
				"2018-5-30",
				//"asdfdshffdghwertwerds",
				"2018-5-5",
				"2018-5-16",
				"2018-5-6",
				"2018-5-22",
				"2018-5-9",
				"2018-5-10",
				"2018-5-11");
		
		for (String s : list) {
			System.out.println(s);
		}
		System.out.println("------------------------------");
		Collections.sort(list);
		for (String s : list) {
			System.out.println(s);
		}
		
		
		System.out.println("------------------------------");
		
		//main->sort->compare
		
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				//�ַ���������Date�����ٱȽϴ�С
				SimpleDateFormat f = 
				new SimpleDateFormat("yyyy-MM-dd");
				try {
					Date d1 = f.parse(o1);
					Date d2 = f.parse(o2);
					return d1.compareTo(d2);
				} catch (ParseException e) {
					//�޷��޸��쳣����������0��������
					//��Ҫ�׳�ȥ������ǰ�����λ�ô���
					//��װ�����׳������ͣ�����
					throw new RuntimeException(e);
				}
			}
		});
		for (String s : list) {
			System.out.println(s);
		}
		
	}
}






