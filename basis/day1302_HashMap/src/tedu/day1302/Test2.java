package tedu.day1302;

import java.util.HashMap;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		System.out.println("输入：");
		String s = new Scanner(System.in).nextLine();
		
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			//提取字符c的计数值
			Integer count=map.get(c);
			if(count == null) {
				map.put(c, 1);
			} else {
				map.put(c, count+1);
			}
			
		}
		
		System.out.println(map);
	}
}






