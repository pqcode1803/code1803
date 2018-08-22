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
		//f6�ļ�������GBK����
		//f6---FOS---OSW
		OutputStreamWriter out = 
		 new OutputStreamWriter(
		 new FileOutputStream("d:/abc/f6"));
		//Unicode����ת��GBK���
		out.write("abc���Ć��F");
		out.close();
	}

	private static void f2() throws Exception {
		//f7�ļ�����UTF-8����
		OutputStreamWriter out = 
		 new OutputStreamWriter(
		 new FileOutputStream("d:/abc/f7"), "UTF-8");
		//Unicode����ת��UTF-8���
		out.write("abc���Ć��F");
		out.close();
		
	}
}	
