package tedu.day1501;

import java.io.File;
import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		System.out.println("����Ŀ¼��");
		String path = new Scanner(System.in).nextLine();
		
		//�������Ŀ¼����ʾ������
		File dir = new File(path);
		if(! dir.isDirectory()) {
			System.out.println("����Ĳ���Ŀ¼");
			return;
		}
		//����dirLength()������Ŀ¼dir���ܴ�С
		long size = dirLength(dir);
		System.out.println(size);
	}

	private static long dirLength(File dir) {
		//��Ŀ¼�б�
		//���Ŀ¼�����ڣ�����Ȩ����
		//��õ� null ֵ
		File[] files = dir.listFiles();
		if(files == null) return 0;
		
		//�ۼӱ���
		long sum = 0;
		//�����ۼ�
		for (File f : files) {
			if(f.isFile()) {//f���ļ�
				sum += f.length();
			} else {//f��Ŀ¼
				sum += dirLength(f);//�ݹ�
			}
		}
		return sum;
	}
}







