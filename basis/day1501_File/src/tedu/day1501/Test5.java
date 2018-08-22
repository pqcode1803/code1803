package tedu.day1501;

import java.io.File;
import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		System.out.println("输入目录：");
		String path = new Scanner(System.in).nextLine();
		
		//如果不是目录，提示并结束
		File dir = new File(path);
		if(! dir.isDirectory()) {
			System.out.println("输入的不是目录");
			return;
		}
		//调用dirLength()方法求目录dir的总大小
		long size = dirLength(dir);
		System.out.println(size);
	}

	private static long dirLength(File dir) {
		//对目录列表
		//如果目录不存在，或无权进入
		//会得到 null 值
		File[] files = dir.listFiles();
		if(files == null) return 0;
		
		//累加变量
		long sum = 0;
		//遍历累加
		for (File f : files) {
			if(f.isFile()) {//f是文件
				sum += f.length();
			} else {//f是目录
				sum += dirLength(f);//递归
			}
		}
		return sum;
	}
}







