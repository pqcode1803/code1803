package tedu.day0605;

import java.io.IOException;

import javax.swing.JFrame;

public class Test2 {
	public static void main(String[] args) throws IOException {
		//窗口
		JFrame f = new JFrame();
		f.setTitle("窗口1");
		f.setSize(500,300);
		f.setDefaultCloseOperation(
				JFrame.EXIT_ON_CLOSE);
		
		//新建面板对象，添加到窗口中
		MyPanel p = new MyPanel();
		f.add(p);
		
		//显示窗口
		f.setVisible(true);
	}
}



