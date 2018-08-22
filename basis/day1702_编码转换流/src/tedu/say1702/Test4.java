package tedu.say1702;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class Test4 {
	public static void main(String[] args) throws Exception {
		/*      文件流   转换流    字符缓冲
		 * f8----FIS----ISR----BR
		 */
		BufferedReader in = 
	     new BufferedReader(
	     new InputStreamReader(
	     new FileInputStream("d:/abc/f8")));
		
		String line;
		while((line = in.readLine()) != null) {
			System.out.println(line);
		}
		in.close();
	}
}



