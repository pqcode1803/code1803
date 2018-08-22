package tedu.day1402;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		try {
			f();
		} catch (ParseException e) {
			e.printStackTrace();
			System.out.println("日期格式错误");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("不能创建文件");
		}
	}

	private static void f() throws ParseException,IOException{
		/*
		 * "2018-5-2" --> Date对象 --> 获得毫秒值
		 * 
		 * "d:\456345645634464.txt"
		 * 新建文件
		 */
		System.out.println("日期(yyyy-MM-dd)：");
		String s = new Scanner(System.in).nextLine();
		SimpleDateFormat f = 
		 new SimpleDateFormat("yyyy-MM-dd");
		Date d = f.parse(s);
		String path = "d:\\"+d.getTime()+".txt";
		File file = new File(path);
		file.createNewFile();
	}
}





