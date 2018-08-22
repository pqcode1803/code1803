package tedu.day1902;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.LinkedList;
import java.util.Scanner;

public class ChatClient {
	private Socket s;
	private BufferedReader in;
	private PrintWriter out;
	private LinkedList<String> list = 
			new LinkedList<>();
	private Thread prtThread;
	private boolean inputFlag = false;
	
	
	public void start() {
		try {
			s = new Socket("192.168.12.103", 8000);
			this.in =
			 new BufferedReader(
			 new InputStreamReader(
			 s.getInputStream(), "GBK"));
			this.out = 
			 new PrintWriter(
			 new OutputStreamWriter(
			 s.getOutputStream(), "GBK"));
			
			
			//昵称
			System.out.print("输入昵称：");
			String name = new Scanner(System.in).nextLine();
			out.println(name);
			out.flush();
			
			
			new Thread() {public void run() {
				input();//控制台输入
			}}.start();
			
			new Thread() {public void run() {
				receive();//从服务器接收
			}}.start();
			
			this.prtThread = new Thread() {@Override public void run() {
				print();//打印从服务器收到的数据
			}};
			
			this.prtThread.start();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("无法连接服务器");
		}
	}

	protected void print() {
		while(true) {
			synchronized (list) {
				while(list.isEmpty() || inputFlag) {
					try {
						list.wait();
					} catch (InterruptedException e) {
					}
				}
				String s = list.poll();//removeFirst()
				System.out.println(s);
			}
		}
	}

	protected void receive() {
		try {
			String line;
			while((line = in.readLine()) != null) {
				synchronized (list) {
					//从服务器收到的聊天内容，加入队列
					list.offer(line);
					list.notifyAll();//通知消费者
				}
			}
		} catch (Exception e) {
		}
		
		
		System.out.println("已经断开连接");
	}

	protected void input() {
		while(s.isConnected()) {
			//等待按回车
			new Scanner(System.in).nextLine();
			
			inputFlag = true;//开始输入标记
			System.out.print("输入聊天内容：");
			String s = new Scanner(System.in).nextLine();
			//发送到服务器
			out.println(s);
			out.flush();
			inputFlag = false;
			synchronized (list) {
				list.notifyAll();
			}
		}
	}
	
	public static void main(String[] args) {
		ChatClient client = new ChatClient();
		client.start();
	}
	
}






