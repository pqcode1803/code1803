package tedu.day1501;

import java.io.File;

public class Test1 {
	public static void main(String[] args) {
		String path;
		
		path = "D:\\lesson\\1803\\note\\03-MySql.zip";//"���ڵ��ļ�Ŀ¼";
		//path = "D:/lesson/1803/note/";//"���ڵ�Ŀ¼·��";
		//path = "k:\\ff\\ee\\ss\\hh";//"�����ڵ�·��";
		
		File f = new File(path);
System.out.println(f.length());//�ֽ�����Ŀ¼��Ч
System.out.println(f.getName());//�ļ���
System.out.println(f.getParent());//��Ŀ¼
System.out.println(f.lastModified());//����޸�ʱ��
System.out.println(f.isFile());//�Ƿ��ļ�
System.out.println(f.isDirectory());  //�Ƿ�Ŀ¼
		
	}
}





