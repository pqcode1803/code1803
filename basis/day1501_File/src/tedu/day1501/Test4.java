package tedu.day1501;

import java.io.File;
import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		System.out.println("����Ŀ¼��");
		String path = new Scanner(System.in).nextLine();
		
		//�������Ŀ¼����ʾ������
		File dir = new File(path);
		if(! dir.isDirectory()) {
			System.out.println("����Ĳ���Ŀ¼");
			return;
		}
		
		String[] names = dir.list();
		for (String s : names) {
			System.out.println(s);
		}
		
		File[] files = dir.listFiles();
		for (File f : files) {
			System.out.println(
			 f.getName()+" - "+f.length());
		}
	}
}






