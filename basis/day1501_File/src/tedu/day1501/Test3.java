package tedu.day1501;

import java.io.File;
import java.io.IOException;

public class Test3 {
	public static void main(String[] args) throws IOException {
		//��ϵͳ����ʱĿ¼�£�������ʱ�ļ�
		//����������ļ�����·���ķ�װ����
		File f = 
		File.createTempFile("abc", ".txt");
		
		System.out.println(f.getAbsolutePath());
	}
}




