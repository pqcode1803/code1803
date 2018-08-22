package tedu.say1702;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PipedWriter;
import java.io.PrintWriter;

public class Test3 {
	public static void main(String[] args) throws Exception {
		//PrintWriter
		//print() println()
		
		/*     文件流  转换流  打印流
		 * f8---FOS---OSW----PW
		 */
		PrintWriter out = 
		 new PrintWriter(
		 new OutputStreamWriter(
		 new FileOutputStream("d:/abc/f8")));
		
		//输出Unicode编码中所有的20902个中文字符
		//\u4e00 到 \u9fa5
		
		int count = 0;
		for(char c = '\u4e00'; c<='\u9fa5'; c++) {
			out.print(c);
			count++;
			if(count == 30) {
				out.println();//30个加换行
				count=0;//计数重置
			}
		}
		
		out.close();
		
	}
}







