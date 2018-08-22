package tedu.say1702;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class Test1 {
	public static void main(String[] args) throws Exception {
		f1();
		f2();
	}

	private static void f1() throws Exception {
		//f6文件，保存GBK编码
		//f6---FOS---OSW
		OutputStreamWriter out = 
		 new OutputStreamWriter(
		 new FileOutputStream("d:/abc/f6"));
		//Unicode编码转成GBK输出
		out.write("abc中文喆镕");
		out.close();
	}

	private static void f2() throws Exception {
		//f7文件保存UTF-8编码
		OutputStreamWriter out = 
		 new OutputStreamWriter(
		 new FileOutputStream("d:/abc/f7"), "UTF-8");
		//Unicode编码转成UTF-8输出
		out.write("abc中文喆镕");
		out.close();
		
	}
}	
