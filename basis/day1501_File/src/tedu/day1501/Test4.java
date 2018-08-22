package tedu.day1501;

import java.io.File;
import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		System.out.println("输入目录：");
		String path = new Scanner(System.in).nextLine();
		
		//如果不是目录，提示并结束
		File dir = new File(path);
		if(! dir.isDirectory()) {
			System.out.println("输入的不是目录");
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






