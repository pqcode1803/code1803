package tedu.day1601;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		System.out.println("ԭ�ļ���");
		String s1 = new Scanner(System.in).nextLine();
		File from = new File(s1);
		if(! from.isFile()) {
			System.out.println("�ļ�����ȷ");
			return;
		}
		System.out.println("Ŀ���ļ���");
		String s2 = new Scanner(System.in).nextLine();
		File to = new File(s2);
		if(to.isDirectory()) {
			System.out.println("��ָ���ļ���������Ŀ¼");
			return;
		}
		
		try {
			copy(from, to);
			System.out.println("���");
		} catch (Exception e) {
			e.printStackTrace();//��ӡ�����쳣
			System.out.println("ʧ��");
		}
		
	}

	private static void copy(
			File from, File to) throws Exception{
		
		/*
		 * �½�FIS�������ļ�from
		 * �½�FOS�������ļ�to
		 * ������ȡ��׼��ʽ
		 * ������ÿһ�����ݣ��������
		 * 
		 * �ر��������������
		 */
		FileInputStream in = new FileInputStream(from);
		FileOutputStream out = new FileOutputStream(to);
		byte[] buff = new byte[8*1024];
		int n;
		while((n = in.read(buff)) != -1) {
			out.write(buff,0,n);
		}
		
		in.close();
		out.close();		
	}
}





