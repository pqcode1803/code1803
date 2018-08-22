package tedu.day1501;

import java.io.File;

public class Test1 {
	public static void main(String[] args) {
		String path;
		
		path = "D:\\lesson\\1803\\note\\03-MySql.zip";//"存在的文件目录";
		//path = "D:/lesson/1803/note/";//"存在的目录路径";
		//path = "k:\\ff\\ee\\ss\\hh";//"不存在的路径";
		
		File f = new File(path);
System.out.println(f.length());//字节量，目录无效
System.out.println(f.getName());//文件名
System.out.println(f.getParent());//父目录
System.out.println(f.lastModified());//最后修改时间
System.out.println(f.isFile());//是否文件
System.out.println(f.isDirectory());  //是否目录
		
	}
}





