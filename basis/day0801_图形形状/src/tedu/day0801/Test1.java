package tedu.day0801;

import javax.swing.JFrame;

public class Test1 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("»æÍ¼");
		f.setDefaultCloseOperation(
		  JFrame.EXIT_ON_CLOSE);
		f.setResizable(false);
		
		DrawPanel p = new DrawPanel();
		f.add(p);
		f.pack();
		
		f.setVisible(true);
	}
}
