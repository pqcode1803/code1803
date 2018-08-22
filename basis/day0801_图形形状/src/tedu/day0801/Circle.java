package tedu.day0801;

import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Shape {
	public Circle(int x, int y) {
		super(x, y, Color.GREEN);
	}
	
	@Override
	public void draw(Graphics g) {
		g.setColor(color);
		g.drawOval(x, y, 250, 250);
	}
	
}



