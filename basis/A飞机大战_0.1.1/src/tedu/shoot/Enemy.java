package tedu.shoot;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.Random;

public class Enemy {
	static final int STATUS_NORMAL=0;
	static final int STATUS_EXPLODE=1;
	static final int STATUS_DEAD=2;
	
	BufferedImage[] imgs;
	BufferedImage img;
	int x;
	int y;
	int stepPx;
	
	//����ֵ
	int life;
	
	//��ǰͼƬ�±꣬��������ը
	int curIndex;
	
	//��ǰ��״̬
	int status = STATUS_NORMAL;
	
	//��Ӣ�۵��˺�
	int damage;
	
	//��ֵ��
	int score;
	
	
	public void step() {
		if(status==STATUS_NORMAL) {
			y += stepPx;
		} else if(status==STATUS_EXPLODE) {
			//�л�ͼƬ
			if(GamePanel.counter%6==0) {
				curIndex++;
				if(curIndex>=5) {
					status=STATUS_DEAD;
					return;
				}
				
				img = imgs[curIndex];
				
			}
		}
		
	}
	
	//�ж��Ƿ��Ƴ�����
	public boolean isOut() {
		return x<=-img.getWidth() ||
			   x>=400 ||
			   y>=654;
	}
	
	//��ʼ���л�λ��
	public void init() {
		y = -img.getHeight();
		x = new Random().nextInt(
			400-img.getWidth());
	}
	
	
	public void paint(Graphics g) {
		g.drawImage(img,x,y,null);
	}
	
	//��ײ�ӵ����
	public boolean hit(Bullet b) {
		//�뾶
		int r = img.getHeight()/2;
		//���ĵ�����
		int x1 = x+img.getWidth()/2;
		int y1 = y+img.getHeight()/2;
		
		//�����ֵ
		int dx = x1-b.x;
		int dy = y1-b.y;
		
		boolean bol = Math.sqrt(dx*dx+dy*dy)<=r;
		if(bol) {//��ǰ������ײ�ӵ�
			life--;
			if(life<=0) {
				life = 0;
				status=STATUS_EXPLODE;
			}
		}
		return bol;
	}
	
	//��ײӢ�ۼ��
	public boolean hit(Hero hero) {
		//���˰뾶
		int r1 = img.getHeight()/2;
		//�������ĵ�����
		int x1 = x+img.getWidth()/2;
		int y1 = y+img.getHeight()/2;
		//Ӣ�۰뾶
		int r2 = hero.img.getHeight()/2;
		//Ӣ�����ĵ�����
		int x2 = hero.x+hero.img.getWidth()/2;
		int y2 = hero.y+hero.img.getHeight()/2;
		
		int dx = x1-x2;
		int dy = y1-y2;
		//���˺�Ӣ����ײ
		boolean bol = Math.sqrt(dx*dx+dy*dy)<=r1+r2;
		if(bol) {
			//����������ʼ��ը
			life = 0;
			status = STATUS_EXPLODE;
			//Ӣ��
			hero.life -= damage;
			if(hero.life<=0) {
				hero.life=0;
				hero.status = Hero.STATUS_EXPLODE;  
			} else {
				hero.status = Hero.STATUS_HURT;
			}
		}
		
		return bol;
	}
	
	
	public boolean isNormal() {
		return status==STATUS_NORMAL;
	}
	public boolean isExplode() {
		return status==STATUS_EXPLODE;
	}
	public boolean isDead() {
		return status==STATUS_DEAD;
	}
	
	
}






