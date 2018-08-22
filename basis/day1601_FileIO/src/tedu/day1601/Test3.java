package tedu.day1601;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		System.out.println("原文件：");
		String s1 = new Scanner(System.in).nextLine();
		File from = new File(s1);
		if(! from.isFile()) {
			System.out.println("文件不正确");
			return;
		}
		System.out.println("目标文件：");
		String s2 = new Scanner(System.in).nextLine();
		File to = new File(s2);
		if(to.isDirectory()) {
			System.out.println("请指定文件，不能是目录");
			return;
		}
		
		try {
			copy(from, to);
			System.out.println("完成");
		} catch (Exception e) {
			e.printStackTrace();//打印完整异常
			System.out.println("失败");
		}
		
	}

	private static void copy(
			File from, File to) throws Exception{
		
		/*
		 * 新建FIS，插在文件from
		 * 新建FOS，插在文件to
		 * 批量读取标准格式
		 * 读到的每一批数据，批量输出
		 * 
		 * 关闭输入流和输出流
		 */
		FileInputStream in = new FileInputStream(from);
		FileOutputStream out = new FileOutputStream(to);
		byte[] buff = new byte[8*1024];
		int n;
		while((n = in.read(buff)) != -1) {
			out.write(buff,0,n);
		}
		
		in.close();
		out.close();		
	}
}





