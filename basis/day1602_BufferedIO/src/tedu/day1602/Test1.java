package tedu.day1602;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Test1 {
	public static void main(String[] args) throws Exception {
		/*
		 * fos, 插在文件 f5
		 * bos, 插在fos
		 */
		FileOutputStream fos = 
		 new FileOutputStream("d:/abc/f5");     
		BufferedOutputStream bos = 
		 new BufferedOutputStream(fos);
		
		bos.write(97);
		bos.write(98);
		bos.write(99);
		
		bos.flush();//刷出缓存数据
		/*
		 * 高级的close()
		 *     1. flush()
		 *     2. 相接的流.close()
		 */
		bos.close();
		
	}
}







