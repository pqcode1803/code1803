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
	//������
	private InputStream in;
	private OutputStream out;
	//������ȡ�ļ��б��ַ���
	DataInputStream dis;
	//�������Ϳͻ���ѡ����ļ����
	DataOutputStream dos;
	//�����л����շ�װ�ļ���Ϣ�Ķ���
	ObjectInputStream ois;
	//�����ļ�����
	FileOutputStream fos;
	
	public void start() {
		try {
			s = new Socket("xxx.xx.xxx.x", 8000);
			in = s.getInputStream();
			out = s.getOutputStream();
			while(true) {
				//���ղ���ӡ�б�
				receiveAndPrintFileList();
				//�õ��û���������
				int n = new Scanner(System.in).nextInt();
				//���뱣��Ŀ¼
				File dir = inputDir();
				//�������
				sendNumber(n);
				//�����ļ���Ϣ����
				FileInfo info = receiveFileInfo();
				//�����ļ����ݲ�����
				receiveAndSaveFile(info, dir);
			}
		} catch (Exception e) {
		}		
		
		
		System.out.println("���ӶϿ�");
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






