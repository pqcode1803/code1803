package tedu.day0801;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class DrawPanel extends JPanel{
	Shape s;
	/*
	 * ״̬�� status
	 * 0 ��ʼ״̬
	 * 1 ��ʾ����ͼ��
	 * 2 ��ʾ���
	 */
	int status;
	
	public DrawPanel() {
		//���������С
		setPreferredSize(new Dimension(500,500));
		//��Ӽ�����
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(status != 1) {
					status = 1;//����ͼ��
					switch(new Random().nextInt(4)) {
					case 0: 
						JOptionPane.showMessageDialog(
							DrawPanel.this,"�����½�������ʵ��");
						status = 0;
						return; 
					case 1: s = new Line(125,250,375,250);break;
					case 2: s = new Circle(125,125);break;
					case 3: s = new Square(125,125);break;
					}
				} else {
					status = 2;
				}
				//ˢ�»���
				repaint();
			}
		});
	}
	
	@Override
	public void paint(Graphics g) {
		//0.��ʼ״̬
		//1.����ͼ��
		//2.���
		if(status == 0) {
			//��
		} else if(status == 1) {
			s.draw(g);
			if(s instanceof Line) { //s����ʵ������Line
				Line line = (Line) s;//����ת��
				line.length(g);
			}
		} else if(status == 2) {
			s.clear(g);
		}
	}
}








