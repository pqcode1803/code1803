package tedu.say1702;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Test2 {
	public static void main(String[] args) throws Exception {
		f1();
		f2();
	}

	private static void f1() throws Exception {
		//读取f6文件中GBK编码，转成Unicode
		//f6---FIS---ISR
		InputStreamReader in = 
		 new InputStreamReader(
		 new FileInputStream("d:/abc/f6"));
		
		//读GBK编码，转换成Unicode编码
		int c;
		while((c = in.read()) != -1) {
			System.out.println((char)c);
		}
		
		in.close();
		
	}

	private static void f2() throws Exception {
		//读取f7文件中UTF-8编码，转成Unicode
		//f7---FIS---ISR
		InputStreamReader in = 
		 new InputStreamReader(
		 new FileInputStream("d:/abc/f7"),"UTF-8");
		
		//读UTF-8编码，转换成Unicode编码
		int c;
		while((c = in.read()) != -1) {
			System.out.println((char)c);
		}
		
		in.close();
	}
}




