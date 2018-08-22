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
	
	//启动服务
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
				//处理连接通道
				handelSocket(s);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("服务停止");
		}
	}

	private void handelSocket(Socket s) {
		//新建通信线程，
		//将Socket通道交给线程执行通信过程
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
				//准备输入流和输出流
				prepareStream();
				//接收昵称
				this.name = in.readLine();
				
				sendToAll(
				name+"进入聊天室，在线人数："+list.size());
				
				String line = null;
				while(true) {
					line = in.readLine();
					if(line==null) break;
					
					sendToAll(name+"说："+line);
				}
				
			} catch (Exception e) {				
			}
			//客户端断开，从集合移除当前对象
			list.remove(this);
			sendToAll(
			name+"离开了聊天室，在线人数："+list.size());
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
		System.out.println("聊天室服务器");
	}
	
}









