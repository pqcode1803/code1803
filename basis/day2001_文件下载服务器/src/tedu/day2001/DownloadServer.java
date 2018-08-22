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
	//�ÿͻ������ص��ļ���Ŀ¼
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
			System.out.println("����ֹͣ");
		}
	}
	
	
	private void handleSocket(Socket s) {
		new TongXinThread(s).start();
	}
	
	class TongXinThread extends Thread {
		private Socket s;
		//������
		InputStream in;
		OutputStream out;
		//��������ļ��б��ַ���
		DataOutputStream dos;
		//������ȡ�ͻ���ѡ����ļ����
		DataInputStream dis;
		//���л����ͷ�װ�ļ���Ϣ�Ķ���
		ObjectOutputStream oos;
		//��ȡ�ļ�����
		FileInputStream fis;
		
		public TongXinThread(Socket s) {
			this.s = s;
		}
		
		@Override
		public void run() {
			try {
				//ȡ��������
				in = s.getInputStream();
				out = s.getOutputStream();
				
				while(s.isConnected()) {
					//�����ļ��б�
					sendFileList();
					//���տͻ���ѡ����ļ����
					int n = receiveNumber();      
					//�����ļ���Ϣ����
					sendFileInfo(n);
					//�����ļ�����
					sendFileData(n);					
				}
			} catch (Exception e) {
			}
			
			
			
			System.out.println("�ͻ����ѶϿ�");
			
		}

		
		
		private void sendFileInfo(int n) throws Exception {
			//�ļ��б�
			File[] files = listFiles();
			//ȡ����n���ļ����±�n-1
			File f = files[n-1];
			//ȡ���ļ���Ϣ��װ��FileInfo����
			FileInfo info = 
			  new FileInfo(f.getName(),
					       f.length(),
					       f.lastModified());
			//���л����Ͷ���
			oos = new ObjectOutputStream(out);
			oos.writeObject(info);
			oos.flush();
			oos = null;
		}
		
		private void sendFileList() throws Exception {
			//�õ��ļ��б��ַ���
			String s = getFileListString();
			//��Data�������ַ���
			dos = new DataOutputStream(out);
			dos.writeUTF(s);
			dos.flush();
			dos = null;
		}
		private String getFileListString() {
			//����ļ��б�
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
			  .append("ѡ��> ");
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
			//Data������4���ֽڵ�int����
			dis = new DataInputStream(in);
			int n = dis.readInt();
			dis = null;
			return n;
		}
		
		
		private void sendFileData(int n) throws Exception {
			//�ļ��б�
			File[] files = listFiles();
			//ȡ����n���ļ�
			File f = files[n-1];
			//�½��ļ�������
			fis = new FileInputStream(f);
			//�������ļ��������������
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
		System.out.println("�ļ����ط�����");
	}
	
}







