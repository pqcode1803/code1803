package tedu.day1204;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) throws ParseException {
		System.out.println("输入“年-月”：");
		String s = new Scanner(System.in).nextLine();
		
		//2018-4 -->Date 2018-4-1 0点
		SimpleDateFormat f = 
		 new SimpleDateFormat("yyyy-MM");
		Date d = f.parse(s);
		
		//新建Calendar对象
		//在让Calendar表示和d相同的时间
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		
		//1号是周几
		int day = c.get(Calendar.DAY_OF_WEEK);
		//当月的天数
		int max = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		//计数变量
		int count=0;
		
		System.out.println(
		 "日\t一\t二\t三\t四\t五\t六");
		for(int i=0;i<day-1;i++) {
			System.out.print(" \t");
			count++;
		}
		for(int i=1;i<=max;i++) {
			System.out.print(i+"\t");
			count++;
			if(count==7) {
				System.out.println();
				count=0;
			}
		}
	}
}	





