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
	
	
	
	
	//重写Override
	//重写paint()方法
	//系统在绘制面板时，自动调用paint()方法进行绘制
	@Override
	public void paint(Graphics g) {
		//参数g是一张画布
		
		//绘制图片img
		g.drawImage(img,0,0,null);
		
		g.drawLine(10, 20, 400, 250);
		g.drawRect(80, 10, 300, 180);
		g.drawOval(200, 50, 200, 150);
		
		
	}
}




