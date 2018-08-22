package tedu.day1901;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

public class EchoServer {
	public static void main(String[] args) {
		//���������̣߳�ѭ���ȴ��ͻ��˷�������
		new Thread() {public void run() {
			startServer();
		}}.start();
	}
	
	
	

	protected static void startServer() {
		try {
			ServerSocket ss = new ServerSocket(8000);
			while(true) {
				Socket s = ss.accept();
				//��������ͨ��
				handelSocket(s);
			}
		} catch (Exception e) {
			System.out.println("����ֹͣ");
		}
	}




	private static void handelSocket(Socket s) {
		//����ͨ���̣߳�����������ͨ��s��ִ��ͨ��
		new TongXinThread(s).start();
	}
	
	static class TongXinThread extends Thread {
		Socket s;
		public TongXinThread(Socket s) {
			this.s = s;
		}
		
		@Override
		public void run() {
			/*
			 * ͨ�����ݸ�ʽ
			 * GBK����
			 * ��������д
			 * ÿһ��ĩβ�л��з�
			 * BufferedReader
			 * 		readLine()
			 * 
			 * PrintWriter
			 *      println()
			 *      
			 * ����--->IS--->ISR--->BR
			 * ����<---OS<---OSW<---PW
			 */
			try {
				//���õȴ��������ݵĳ�ʱʱ��
				//��ʱ������ SocketTimeoutException
				s.setSoTimeout(3000);
				
				BufferedReader in = 
				 new BufferedReader(
				 new InputStreamReader(
				 s.getInputStream(), "GBK"));
				
				PrintWriter out = 
				 new PrintWriter(
				 new OutputStreamWriter(
				 s.getOutputStream(), "GBK"));
				
				/*
				 * �Է������Ͽ����� socket.close()
				 * ���յ�nullֵ����ͬ�Ĳ���ϵͳҲ�ܳ����쳣��
				 * 
				 * �����쳣�Ͽ��������쳣
				 * 
				 * ���յ�exit���Ͽ����Ӳ��˳���
				 */
				String line;
				while(true) { //((line = in.readLine()) != null) {
					try {
						line = in.readLine();
					} catch (SocketTimeoutException e) {
						System.out.println("�����볤��ʱ");
						continue;
					}
					
					if(line == null) break;
					
					if("exit".equals(line)) {
						s.close();
						break;
					}
					out.println(line);
					out.flush();
				}		
				System.out.println("�����Ͽ�");
			} catch (Exception e) {
				System.out.println("�����쳣�ж�");
			}
		}
	}
	
	
	
}






