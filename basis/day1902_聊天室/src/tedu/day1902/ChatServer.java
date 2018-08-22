package tedu.day1902;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ChatServer {
	private ServerSocket ss;
	private List<TongXinThread> list = 
			new ArrayList<>();
	
	//��������
	public void start() {
		new Thread() {public void run() {
			startServer();
		}}.start();
	}

	protected void startServer() {
		try {
			ss = new ServerSocket(8000);
			while(true) {
				Socket s = ss.accept();
				//��������ͨ��
				handelSocket(s);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("����ֹͣ");
		}
	}

	private void handelSocket(Socket s) {
		//�½�ͨ���̣߳�
		//��Socketͨ�������߳�ִ��ͨ�Ź���
		TongXinThread t = new TongXinThread(s);
		list.add(t);
		t.start();
	}
	
	
	class TongXinThread extends Thread {
		private Socket s;
		private BufferedReader in;
		private PrintWriter out;
		private String name;
		public TongXinThread(Socket s) {
			this.s = s;
		}
		
		@Override
		public void run() {
			try {
				//׼���������������
				prepareStream();
				//�����ǳ�
				this.name = in.readLine();
				
				sendToAll(
				name+"���������ң�����������"+list.size());
				
				String line = null;
				while(true) {
					line = in.readLine();
					if(line==null) break;
					
					sendToAll(name+"˵��"+line);
				}
				
			} catch (Exception e) {				
			}
			//�ͻ��˶Ͽ����Ӽ����Ƴ���ǰ����
			list.remove(this);
			sendToAll(
			name+"�뿪�������ң�����������"+list.size());
		}

		private void prepareStream() throws Exception {
			this.in =
			 new BufferedReader(
			 new InputStreamReader(
			 s.getInputStream(), "GBK"));
			
			this.out = 
			 new PrintWriter(
			 new OutputStreamWriter(
			 s.getOutputStream(), "GBK"));
		}
		
		public void send(String msg) {
			out.println(msg);
			out.flush();
		}
		
		public void sendToAll(String msg) {
			System.out.println(msg);
			
			for (TongXinThread t : list) {
				t.send(msg);
			}
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		ChatServer server = new ChatServer();
		server.start();
		System.out.println("�����ҷ�����");
	}
	
}









