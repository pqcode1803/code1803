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
		
		/*     �ļ���  ת����  ��ӡ��
		 * f8---FOS---OSW----PW
		 */
		PrintWriter out = 
		 new PrintWriter(
		 new OutputStreamWriter(
		 new FileOutputStream("d:/abc/f8")));
		
		//���Unicode���������е�20902�������ַ�
		//\u4e00 �� \u9fa5
		
		int count = 0;
		for(char c = '\u4e00'; c<='\u9fa5'; c++) {
			out.print(c);
			count++;
			if(count == 30) {
				out.println();//30���ӻ���
				count=0;//��������
			}
		}
		
		out.close();
		
	}
}







