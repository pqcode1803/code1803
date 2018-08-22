package tedu.day1601;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class Test2 {
	public static void main(String[] args) throws Exception {
		//FIS
		FileInputStream in = 
		 new FileInputStream("d:/abc/f4"); 
		//单字节读取标准格式
		int b;
		while((b = in.read())!=-1) {
			System.out.println(b);
		}
		in.close();
		in = new FileInputStream("d:/abc/f4"); 
		//批量节读取标准格式
		byte[] buff = new byte[5];
		int n;
		while((n = in.read(buff)) != -1) {
			System.out.println(n+" - "+Arrays.toString(buff));
		}
		in.close();
		
	}
}
