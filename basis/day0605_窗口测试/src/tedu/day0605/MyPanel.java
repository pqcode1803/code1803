package tedu.day0605;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class MyPanel extends JPanel {
	
	BufferedImage img;
	
	public MyPanel() throws IOException {
		img = ImageIO.read(
		 getClass().getResource("/imgs/btree.png"));
	}
	
	
	
	
	//��дOverride
	//��дpaint()����
	//ϵͳ�ڻ������ʱ���Զ�����paint()�������л���
	@Override
	public void paint(Graphics g) {
		//����g��һ�Ż���
		
		//����ͼƬimg
		g.drawImage(img,0,0,null);
		
		g.drawLine(10, 20, 400, 250);
		g.drawRect(80, 10, 300, 180);
		g.drawOval(200, 50, 200, 150);
		
		
	}
}




