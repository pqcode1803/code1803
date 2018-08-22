package tedu.day2001;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class DownloadClient {
	private Socket s;
	//网络流
	private InputStream in;
	private OutputStream out;
	//用来读取文件列表字符串
	DataInputStream dis;
	//用来发送客户端选择的文件序号
	DataOutputStream dos;
	//饭序列化接收封装文件信息的对象
	ObjectInputStream ois;
	//保存文件数据
	FileOutputStream fos;
	
	public void start() {
		try {
			s = new Socket("xxx.xx.xxx.x", 8000);
			in = s.getInputStream();
			out = s.getOutputStream();
			while(true) {
				//接收并打印列表
				receiveAndPrintFileList();
				//得到用户输入的序号
				int n = new Scanner(System.in).nextInt();
				//输入保存目录
				File dir = inputDir();
				//发送序号
				sendNumber(n);
				//接收文件信息对象
				FileInfo info = receiveFileInfo();
				//接收文件数据并保存
				receiveAndSaveFile(info, dir);
			}
		} catch (Exception e) {
		}		
		
		
		System.out.println("连接断开");
	}

	private void receiveAndPrintFileList() {
		// TODO Auto-generated method stub
		
	}

	private File inputDir() {
		// TODO Auto-generated method stub
		return null;
	}

	private void sendNumber(int n) {
		// TODO Auto-generated method stub
		
	}

	private FileInfo receiveFileInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	private void receiveAndSaveFile(FileInfo info, File dir) {
		// TODO Auto-generated method stub
		
	}
	
}






