package tedu.day1901;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client1 {
	public static void main(String[] args) throws Exception { 
		//���������������
		Socket s = new Socket("127.0.0.1", 8000);
		/*
		 * ��Զ�̷�������������
		 * Զ��<----OS<----OSW
		 */
		
		OutputStreamWriter osw = 
		 new OutputStreamWriter(
		  s.getOutputStream(), "GBK");
		//osw.write("��÷����������ǿͻ���");
		//osw.flush();
		
		//s.close();//�Ͽ�����
	}
}






