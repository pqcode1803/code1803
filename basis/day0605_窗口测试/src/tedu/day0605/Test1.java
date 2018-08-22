package tedu.day0605;

import javax.swing.JFrame;

public class Test1 {
	public static void main(String[] args) {
		//新建两个 JFrame 窗口实例
		JFrame f1 = new JFrame();
		JFrame f2 = new JFrame();
		
		//设置窗口的属性
		f1.setTitle("窗口1");
		f1.setSize(500, 300);
		f1.setResizable(false);
		
		f2.setTitle("窗口2");
		f2.setSize(300, 500);
		f2.setDefaultCloseOperation(
			JFrame.EXIT_ON_CLOSE);
		
		//通知系统，在屏幕上绘制窗口
		f1.setVisible(true);
		f2.setVisible(true);
	}
}







