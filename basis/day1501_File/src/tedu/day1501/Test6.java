package tedu.day1501;

import java.io.File;
import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
		System.out.println("����ɾ����·����");
		String path = new Scanner(System.in).nextLine();
		System.out.print("���Ҫɾ��ô�����ɻָ���");
		String y = new Scanner(System.in).nextLine();
		if(! "y".equals(y)) {
			return;
		}
		
		File f = new File(path);
		boolean bol = delete(f);
		if(bol) {
			System.out.println("ɾ���ɹ�");
		} else {
			System.out.println("ɾ��ʧ��");
		}
		
	}

	private static boolean delete(File f) {
		//���ļ�ֱ��ɾ
		if(f.isFile()) {
			return f.delete();
		} 
		
		//��Ŀ¼
		File[] files = f.listFiles();
		if(files == null) {
			//���ܻ��Ŀ¼�б�����ֱ��ɾ�����Ŀ¼
			return f.delete();
		}
		
		//����ɾ��fĿ¼�ڲ����ļ�
		for (File f2 : files) {
			//ɾf2,���ɾ����,ֱ�ӷ���false
			if(f2.isFile()) {//f2���ļ�
				if(! f2.delete()) {
					return false;
				}
			} else {//f2��Ŀ¼
				if(! delete(f2)) {//�ݹ�
					return false;
				}
			}
		}
		//fĿ¼�Ѿ�����գ������ɾ�� f Ŀ¼
		return f.delete();
	}
}



