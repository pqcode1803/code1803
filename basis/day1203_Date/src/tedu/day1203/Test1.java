package tedu.day1203;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {
	public static void main(String[] args) {
		Date a = new Date();
		Date b = new Date(900000000000L);
		//��ӡ�����ڲ�
		//�ȵ��ö����toString()
		//�õ��ַ����ٴ�ӡ
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(a.getTime());       
		a.setTime(0);
		System.out.println(a);
		
		//
		SimpleDateFormat f = 
				new SimpleDateFormat(
				"yyyy-MM-dd HH:mm:ss");
		
		String s1 = f.format(a);
		String s2 = f.format(b);
		System.out.println(s1);
		System.out.println(s2);
		
	}
}




