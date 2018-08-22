package tedu.day1401;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test1 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		//向list集合加入一组数据
		Collections.addAll(
				list, 
				"8",
				"48",
				"96",
				"127",
				"55",
				"4125",
				"asdgsdfgsdfgasdfasdf",
				"6",
				"254",
				"3",
				"-2147000000",
				"1000000000",
				"2742",
				"9",
				"534");
		
		System.out.println(list);
		Collections.sort(list);//排序
		System.out.println(list);
		
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				//o1，o2先转成int类型再比较
				int a = Integer.parseInt(o1);
				int b = Integer.parseInt(o2);
				//return a-b;
				if(a>b) return 1;
				else if(a<b) return -1;
				else return 0;
			}
		});
		System.out.println(list);
	}
}



