package tedu.day1501;

import java.io.File;
import java.io.IOException;

public class Test2 {
	public static void main(String[] args) throws IOException {
		/*
		 * 1.�½�Ŀ¼��
		 *   d:\abc\aa\bb\cc
		 * 2.�½��ļ���
		 *   d:/abc/aa/bb/cc/f1
		 *   d:/abc/f2
		 * 3.ɾ���ļ�f1
		 * 4.ɾ��Ŀ¼cc
		 */
		File d1 = 
		new File("d:\\abc\\aa\\bb\\cc");
		
		d1.mkdirs();
		
		//
		File f1 = new File(d1, "f1");
		f1.createNewFile();
		
		//
		File f2 = new File("d:/abc/f2");
		f2.createNewFile();
		
		//
		f1.delete();
		
		//
		d1.delete();
		
		//�ܲ���ɾ d:/abc/ Ŀ¼��aa��f2
		File d2 = new File("d:/abc");
		boolean bol = d2.delete();
		System.out.println(bol);
	}
}



