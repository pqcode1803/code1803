package tedu.day0605;

import javax.swing.JFrame;

public class Test1 {
	public static void main(String[] args) {
		//�½����� JFrame ����ʵ��
		JFrame f1 = new JFrame();
		JFrame f2 = new JFrame();
		
		//���ô��ڵ�����
		f1.setTitle("����1");
		f1.setSize(500, 300);
		f1.setResizable(false);
		
		f2.setTitle("����2");
		f2.setSize(300, 500);
		f2.setDefaultCloseOperation(
			JFrame.EXIT_ON_CLOSE);
		
		//֪ͨϵͳ������Ļ�ϻ��ƴ���
		f1.setVisible(true);
		f2.setVisible(true);
	}
}







