package tedu.day0801;

import java.awt.Color;
import java.awt.Graphics;

public class Line extends Shape {
	int x2;
	int y2;
	
	public Line(int x,int y,int x2,int y2) {
		super(x,y,Color.RED);
		this.x2 = x2;
		this.y2 = y2;
	}
	
	@Override
	public void draw(Graphics g) {
		g.setColor(color);
		g.drawLine(x, y, x2, y2);
	}
	
	public void length(Graphics g) {
		int dx = x-x2;
		int dy = y-y2;
		double s = Math.sqrt(dx*dx+dy*dy);
		g.drawString("³¤¶È£º"+s,125,270);
	}
}





