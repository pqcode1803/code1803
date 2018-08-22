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
			
			
			//�ǳ�
			System.out.print("�����ǳƣ�");
			String name = new Scanner(System.in).nextLine();
			out.println(name);
			out.flush();
			
			
			new Thread() {public void run() {
				input();//����̨����
			}}.start();
			
			new Thread() {public void run() {
				receive();//�ӷ���������
			}}.start();
			
			this.prtThread = new Thread() {@Override public void run() {
				print();//��ӡ�ӷ������յ�������
			}};
			
			this.prtThread.start();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("�޷����ӷ�����");
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
					//�ӷ������յ����������ݣ��������
					list.offer(line);
					list.notifyAll();//֪ͨ������
				}
			}
		} catch (Exception e) {
		}
		
		
		System.out.println("�Ѿ��Ͽ�����");
	}

	protected void input() {
		while(s.isConnected()) {
			//�ȴ����س�
			new Scanner(System.in).nextLine();
			
			inputFlag = true;//��ʼ������
			System.out.print("�����������ݣ�");
			String s = new Scanner(System.in).nextLine();
			//���͵�������
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






