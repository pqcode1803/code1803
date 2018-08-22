package tedu.day1501;

import java.io.File;
import java.io.IOException;

public class Test3 {
	public static void main(String[] args) throws IOException {
		//在系统的临时目录下，创建临时文件
		//并返回这个文件完整路径的封装对象
		File f = 
		File.createTempFile("abc", ".txt");
		
		System.out.println(f.getAbsolutePath());
	}
}




