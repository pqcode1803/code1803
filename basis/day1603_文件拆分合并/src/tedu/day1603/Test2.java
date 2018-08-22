package tedu.day1603;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		System.out.println("�ļ����Ŀ¼��");
		String s1 = new Scanner(System.in).nextLine();
		File dir = new File(s1);
		if(!dir.isDirectory()) {
			System.out.println("����Ŀ¼");
			return;
		}
		System.out.println("�ϲ��ļ���");
		String s2 = new Scanner(System.in).nextLine();
		File file = new File(s2);
		if(file.isDirectory()) {
			System.out.println("��������ļ���������Ŀ¼");
			return;
		}
		
		try {
			heBing(dir, file);
			System.out.println("���");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("ʧ��");
		}
		
	}

	private static void heBing(
			File dir, File file) throws Exception{
		
		File[] files = list(dir);
		FileOutputStream out = 
				new FileOutputStream(file);
		FileInputStream in;
		byte[] buff = new byte[8192];
		int n;//ÿһ��������
		for (File f : files) {
			in = new FileInputStream(f);
			while((n = in.read(buff)) != -1) {
				out.write(buff,0,n);
			}
			in.close();
		}
		out.close();
		
		
	}

	private static File[] list(File dir) {
		File[] list = dir.listFiles();
		Arrays.sort(list, new Comparator<File>() {
			@Override
			public int compare(File o1, File o2) {
				//erte.45.ert.6
				String n1 = o1.getName();
				String n2 = o2.getName();
				n1 = n1.substring(n1.lastIndexOf(".")+1);
				n2 = n2.substring(n2.lastIndexOf(".")+1);
				int a = Integer.parseInt(n1);
				int b = Integer.parseInt(n2);
				return a-b;
			}
		});
		
		return list;
	}
}






