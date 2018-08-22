package day1503;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("����Ŀ¼��");
		String path = new Scanner(System.in).nextLine();
		
		//�������Ŀ¼����ʾ������
		File dir = new File(path);
		if(! dir.isDirectory()) {
			System.out.println("����Ĳ���Ŀ¼");
			return;
		}
		
		//key���������
		System.out.print("Key��");
		int key = new Scanner(System.in).nextInt();
		
		
		try {
			encriptAll(dir, key);
			System.out.println("���");
		} catch (Exception e) {
			System.out.println("ʧ��");
		}
	}

	private static void encriptAll(
			File dir, int key) throws Exception {
		File[] files = dir.listFiles();
		if(files == null) {
			return;
		}
		for (File f : files) {
			if(f.isFile()) {
				if(isPic(f)) {
					encript(f, key);
				}
			} else {
				encriptAll(f, key);
			}
		}
	}
	
	
	private static boolean isPic(File f) {
		//jpg png gif
		return f.getName()
				.toLowerCase()
				.matches(".+\\.(jpg|png|gif)");
	}

	private static void encript(
			File file,
			int key) throws Exception {
		
		RandomAccessFile raf = 
		 new RandomAccessFile(file, "rw");
		
		byte[] buff = new byte[8192];
		int n;//ÿһ��������
		while((n = raf.read(buff)) != -1) {
			//��������ǰn���ֽڼ��ܡ�����
			for (int i = 0; i < n; i++) {
				buff[i] ^= key;
			}
			//�±���ǰ�ƶ�nλ
			raf.seek(raf.getFilePointer()-n);   
			//����ǰn����һ��д���ļ�
			raf.write(buff, 0, n);
		}
		
		raf.close();
	}
	
	
}






