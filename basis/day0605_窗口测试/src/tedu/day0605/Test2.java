package tedu.day0605;

import java.io.IOException;

import javax.swing.JFrame;

public class Test2 {
	public static void main(String[] args) throws IOException {
		//����
		JFrame f = new JFrame();
		f.setTitle("����1");
		f.setSize(500,300);
		f.setDefaultCloseOperation(
				JFrame.EXIT_ON_CLOSE);
		
		//�½���������ӵ�������
		MyPanel p = new MyPanel();
		f.add(p);
		
		//��ʾ����
		f.setVisible(true);
	}
}



