package tedu.day1203;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) throws ParseException {
		System.out.print("生日(yyyy-MM-dd)：");
		String s = new Scanner(System.in).nextLine();
		
		//生日字符串解析成Date对象
		SimpleDateFormat f =
		 new SimpleDateFormat("yyyy-MM-dd");
		
		Date d = f.parse(s);
		long t = 
		 System.currentTimeMillis()-d.getTime();
		t = t/1000/60/60/24;
		System.out.println("您已经存活了"+t+"天");
	}
}





