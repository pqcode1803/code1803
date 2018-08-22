package tedu.day1901;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.Scanner;

public class EchoClient {
	public static void main(String[] args) throws Exception {
		Socket s = new Socket();
		s.connect(
		 new InetSocketAddress(
			"192.168.12.103", 8000), 
		 3000);
		
		BufferedReader in = 
		 new BufferedReader(
		 new InputStreamReader(
		 s.getInputStream(), "GBK"));
		
		PrintWriter out = 
		 new PrintWriter(
		 new OutputStreamWriter(
		 s.getOutputStream(), "GBK"));
		
		while(true) {
			System.out.print("输入：");
			String str = new Scanner(System.in).nextLine();
			out.println(str);
			out.flush();
			String str2 = in.readLine();
			if(str2 == null) {
				System.out.println("正常断开");
				break;
			} 
			System.out.println(str2);
		}
	}
}








