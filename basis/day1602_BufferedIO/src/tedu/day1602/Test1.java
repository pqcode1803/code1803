package tedu.day1602;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Test1 {
	public static void main(String[] args) throws Exception {
		/*
		 * fos, �����ļ� f5
		 * bos, ����fos
		 */
		FileOutputStream fos = 
		 new FileOutputStream("d:/abc/f5");     
		BufferedOutputStream bos = 
		 new BufferedOutputStream(fos);
		
		bos.write(97);
		bos.write(98);
		bos.write(99);
		
		bos.flush();//ˢ����������
		/*
		 * �߼���close()
		 *     1. flush()
		 *     2. ��ӵ���.close()
		 */
		bos.close();
		
	}
}







