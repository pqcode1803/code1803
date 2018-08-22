package tedu.day1501;

import java.io.File;
import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
		System.out.println("输入删除的路径：");
		String path = new Scanner(System.in).nextLine();
		System.out.print("真的要删除么，不可恢复：");
		String y = new Scanner(System.in).nextLine();
		if(! "y".equals(y)) {
			return;
		}
		
		File f = new File(path);
		boolean bol = delete(f);
		if(bol) {
			System.out.println("删除成功");
		} else {
			System.out.println("删除失败");
		}
		
	}

	private static boolean delete(File f) {
		//是文件直接删
		if(f.isFile()) {
			return f.delete();
		} 
		
		//是目录
		File[] files = f.listFiles();
		if(files == null) {
			//不能获得目录列表，尝试直接删除这个目录
			return f.delete();
		}
		
		//遍历删除f目录内部的文件
		for (File f2 : files) {
			//删f2,如果删不掉,直接返回false
			if(f2.isFile()) {//f2是文件
				if(! f2.delete()) {
					return false;
				}
			} else {//f2是目录
				if(! delete(f2)) {//递归
					return false;
				}
			}
		}
		//f目录已经被清空，最后尝试删除 f 目录
		return f.delete();
	}
}



