package day1207;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) throws ParseException {
		System.out.print("生日(yyyy-MM-dd)：");
		String s = new Scanner(System.in).nextLine();
		SimpleDateFormat f =
		 new SimpleDateFormat("yyyy-MM-dd");
		Date d = f.parse(s);
		
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		c.setTime(d);
		
		c.set(Calendar.YEAR, year);
		if(System.currentTimeMillis()>c.getTimeInMillis()) {
			c.add(Calendar.YEAR, 1);
		}
		
		long t = c.getTimeInMillis() - System.currentTimeMillis();
		t = t/1000/60/60/24;
		
		System.out.println("距离下一个生日还有"+t+"天");
		
	}
}



