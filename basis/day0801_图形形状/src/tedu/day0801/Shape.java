package tedu.day0801;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Shape {
	int x;
	int y;
	Color color;
	public Shape(int x,int y,Color color) {
		this.x = x;
		this.y = y;
		this.color = color;
	}
	
	//��ָ��ͼ�θ����У��޷�ʵ��
	//�����ͨ�õĳ��󷽷�
	public abstract void draw(Graphics g);
	
	public void clear(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 500, 500);
	}
}




