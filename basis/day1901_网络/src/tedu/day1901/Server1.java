package tedu.day1901;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {
	public static void main(String[] args) throws Exception {
		/*
		 * cmd
		 * ipconfig
		 * 192.168.12.xxx
		 */
		//�½�ServerSocket����
		//��8000�˿�����������
		ServerSocket ss = 
			new ServerSocket(8000);
		//�ȴ��ͻ��˷�������
		//����������ͨ��
		Socket s = ss.accept();
		System.out.println("----------------");
		//������ͨ��ȡ��˫�����
		InputStream in = s.getInputStream();
		OutputStream out = s.getOutputStream();  
		//�����ı�����,��GBK����
		InputStreamReader isr = 
		 new InputStreamReader(in,"GBK");
		int c;
		while((c = isr.read()) != -1) {
			System.out.print((char) c);
		}
		
		
	}
}








