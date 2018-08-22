package tedu.day2001;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class DownloadServer {
	private ServerSocket ss;
	//让客户端下载的文件的目录
	private File dir = new File("d:/abc");
	
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
				handleSocket(s);
			}
		} catch (Exception e) {
			System.out.println("服务停止");
		}
	}
	
	
	private void handleSocket(Socket s) {
		new TongXinThread(s).start();
	}
	
	class TongXinThread extends Thread {
		private Socket s;
		//网络流
		InputStream in;
		OutputStream out;
		//用来输出文件列表字符串
		DataOutputStream dos;
		//用来读取客户端选择的文件序号
		DataInputStream dis;
		//序列化发送封装文件信息的对象
		ObjectOutputStream oos;
		//读取文件数据
		FileInputStream fis;
		
		public TongXinThread(Socket s) {
			this.s = s;
		}
		
		@Override
		public void run() {
			try {
				//取出网络流
				in = s.getInputStream();
				out = s.getOutputStream();
				
				while(s.isConnected()) {
					//发送文件列表
					sendFileList();
					//接收客户端选择的文件序号
					int n = receiveNumber();      
					//发送文件信息对象
					sendFileInfo(n);
					//发送文件数据
					sendFileData(n);					
				}
			} catch (Exception e) {
			}
			
			
			
			System.out.println("客户端已断开");
			
		}

		
		
		private void sendFileInfo(int n) throws Exception {
			//文件列表
			File[] files = listFiles();
			//取出第n个文件，下标n-1
			File f = files[n-1];
			//取出文件信息封装成FileInfo对象
			FileInfo info = 
			  new FileInfo(f.getName(),
					       f.length(),
					       f.lastModified());
			//序列化发送对象
			oos = new ObjectOutputStream(out);
			oos.writeObject(info);
			oos.flush();
			oos = null;
		}
		
		private void sendFileList() throws Exception {
			//得到文件列表字符串
			String s = getFileListString();
			//用Data流发送字符串
			dos = new DataOutputStream(out);
			dos.writeUTF(s);
			dos.flush();
			dos = null;
		}
		private String getFileListString() {
			//获得文件列表
			File[] files = listFiles();
			StringBuilder sb = new StringBuilder();
			sb.append("----------------------\n");
			for (int i = 0; i < files.length; i++) {
				File f = files[i];
				// 3. sdfsdf.zip
				sb.append(i+1).append(". ")
				.append(f.getName()).append("\n");
			}
			sb.append("----------------------\n")
			  .append("选择> ");
			return sb.toString();
		}
		private File[] listFiles() {
			return dir.listFiles(new FileFilter() {
				public boolean accept(File f) {
					return f.isFile();
				}
			});
		}
		

		private int receiveNumber() throws Exception {
			//Data流接收4个字节的int类型
			dis = new DataInputStream(in);
			int n = dis.readInt();
			dis = null;
			return n;
		}
		
		
		private void sendFileData(int n) throws Exception {
			//文件列表
			File[] files = listFiles();
			//取出第n个文件
			File f = files[n-1];
			//新建文件输入流
			fis = new FileInputStream(f);
			//批量从文件读，向网络输出
			byte[] buff = new byte[8192];
			int m;
			while((m = fis.read(buff)) != -1) {
				out.write(buff,0,m);
			}
			fis.close();
			fis = null;			
		}
	}
	
	
	public static void main(String[] args) {
		DownloadServer server = new DownloadServer();
		server.start();
		System.out.println("文件下载服务器");
	}
	
}







