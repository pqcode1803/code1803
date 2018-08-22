package tedu.say1702;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Test2 {
	public static void main(String[] args) throws Exception {
		f1();
		f2();
	}

	private static void f1() throws Exception {
		//��ȡf6�ļ���GBK���룬ת��Unicode
		//f6---FIS---ISR
		InputStreamReader in = 
		 new InputStreamReader(
		 new FileInputStream("d:/abc/f6"));
		
		//��GBK���룬ת����Unicode����
		int c;
		while((c = in.read()) != -1) {
			System.out.println((char)c);
		}
		
		in.close();
		
	}

	private static void f2() throws Exception {
		//��ȡf7�ļ���UTF-8���룬ת��Unicode
		//f7---FIS---ISR
		InputStreamReader in = 
		 new InputStreamReader(
		 new FileInputStream("d:/abc/f7"),"UTF-8");
		
		//��UTF-8���룬ת����Unicode����
		int c;
		while((c = in.read()) != -1) {
			System.out.println((char)c);
		}
		
		in.close();
	}
}




