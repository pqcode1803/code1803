package tedu.day1302;

import java.util.HashMap;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		System.out.println("���룺");
		String s = new Scanner(System.in).nextLine();
		
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			//��ȡ�ַ�c�ļ���ֵ
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






