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
			System.out.println("���ڸ�ʽ����");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("���ܴ����ļ�");
		}
	}

	private static void f() throws ParseException,IOException{
		/*
		 * "2018-5-2" --> Date���� --> ��ú���ֵ
		 * 
		 * "d:\456345645634464.txt"
		 * �½��ļ�
		 */
		System.out.println("����(yyyy-MM-dd)��");
		String s = new Scanner(System.in).nextLine();
		SimpleDateFormat f = 
		 new SimpleDateFormat("yyyy-MM-dd");
		Date d = f.parse(s);
		String path = "d:\\"+d.getTime()+".txt";
		File file = new File(path);
		file.createNewFile();
	}
}





