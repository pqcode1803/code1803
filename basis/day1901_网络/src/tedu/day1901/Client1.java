package tedu.day1901;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client1 {
	public static void main(String[] args) throws Exception { 
		//与服务器建立连接
		Socket s = new Socket("127.0.0.1", 8000);
		/*
		 * 向远程服务器发送数据
		 * 远程<----OS<----OSW
		 */
		
		OutputStreamWriter osw = 
		 new OutputStreamWriter(
		  s.getOutputStream(), "GBK");
		//osw.write("你好服务器，我是客户端");
		//osw.flush();
		
		//s.close();//断开连接
	}
}






