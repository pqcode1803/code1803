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
		//启动服务线程，循环等待客户端发起连接
		new Thread() {public void run() {
			startServer();
		}}.start();
	}
	
	
	

	protected static void startServer() {
		try {
			ServerSocket ss = new ServerSocket(8000);
			while(true) {
				Socket s = ss.accept();
				//处理连接通道
				handelSocket(s);
			}
		} catch (Exception e) {
			System.out.println("服务停止");
		}
	}




	private static void handelSocket(Socket s) {
		//启动通信线程，负责在连接通道s上执行通信
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
			 * 通信数据格式
			 * GBK编码
			 * 按行来读写
			 * 每一行末尾有换行符
			 * BufferedReader
			 * 		readLine()
			 * 
			 * PrintWriter
			 *      println()
			 *      
			 * 网络--->IS--->ISR--->BR
			 * 网络<---OS<---OSW<---PW
			 */
			try {
				//设置等待接收数据的超时时间
				//超时后会出现 SocketTimeoutException
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
				 * 对方主动断开连接 socket.close()
				 * 会收到null值（不同的操作系统也能出现异常）
				 * 
				 * 网络异常断开，出现异常
				 * 
				 * 接收到exit，断开连接并退出，
				 */
				String line;
				while(true) { //((line = in.readLine()) != null) {
					try {
						line = in.readLine();
					} catch (SocketTimeoutException e) {
						System.out.println("等三秒长超时");
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
				System.out.println("正常断开");
			} catch (Exception e) {
				System.out.println("网络异常中断");
			}
		}
	}
	
	
	
}






