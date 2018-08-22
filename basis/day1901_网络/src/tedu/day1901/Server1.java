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
		//新建ServerSocket对象，
		//在8000端口上启动服务
		ServerSocket ss = 
			new ServerSocket(8000);
		//等待客户端发起连接
		//并建立连接通道
		Socket s = ss.accept();
		System.out.println("----------------");
		//从连接通道取出双向的流
		InputStream in = s.getInputStream();
		OutputStream out = s.getOutputStream();  
		//接收文本数据,用GBK编码
		InputStreamReader isr = 
		 new InputStreamReader(in,"GBK");
		int c;
		while((c = isr.read()) != -1) {
			System.out.print((char) c);
		}
		
		
	}
}








