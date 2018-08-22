package tedu.shoot;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Hero {
	static final int STATUS_NORMAL=0;
	static final int STATUS_HURT=1;
	static final int STATUS_EXPLODE=2;
	static final int STATUS_DEAD=3;
	
	BufferedImage[] imgs = Main.heros;
	BufferedImage img = imgs[1];
	int x = 200-img.getWidth()/2;
	int y = 654-img.getHeight()-100;
	int tx = x;
	int ty = y;
	//Ӣ��ʹ�õ�����
	Weapon weapon = Main.weapons[0];
	//Ӣ�۵ļ���
	int level;
	
	int life=10;
	int status = STATUS_NORMAL;
	int curIndex=1;
	
	//�÷�����
	int score;
	
	
	//���յĲ��������λ��
	//�����λ�ã����ó���һ���ƶ���Ŀ��λ��
	public void moveTo(int tx, int ty) {
		this.tx = tx-img.getWidth()/2;
		this.ty = ty-img.getHeight()/2;
	}
	
	//�ƶ�һ֡
	public void step() {
		if(status==STATUS_NORMAL) {
			if(x==tx && y==ty) {//û���ƶ�
				img = imgs[1];//ʹ�õ���ͼƬ
			} else {//��x,y�ƶ���tx,ty
				img = imgs[0];//ʹ�ü���ͼƬ
				x = tx;
				y = ty;
			}
		} else if(status==STATUS_HURT) {
			if(x!=tx || y!=ty) {
				x = tx;
				y = ty;
			}
			if(GamePanel.counter%6==0) {
				curIndex++;
				if(curIndex>=4) {
					status=STATUS_NORMAL;
					curIndex=1;
					img = imgs[curIndex];
				}
				img = imgs[curIndex];
			}			
		} else if(status==STATUS_EXPLODE) {
			if(GamePanel.counter%6==0) {
				curIndex++;
				if(curIndex>=6) {
					status=STATUS_DEAD;
					return;
				}
				img = imgs[curIndex];
			}	
		}
	}
	
	//�Ӳ����õ����������Լ����ڻ�����
	public void paint(Graphics g) {
		if(status!=STATUS_DEAD) {
			g.drawImage(img,x,y,null);
		}
	}
	
	//Ӣ�����
	public Bullet[] shoot() {
		return weapon.fire(this);
	}
	
	public boolean isNormal() {
		return status==STATUS_NORMAL;
	}
	public boolean isHurt() {
		return status==STATUS_HURT;
	}
	public boolean isExplode() {
		return status==STATUS_EXPLODE;
	}
	public boolean isDead() {
		return status==STATUS_DEAD;
	}
	
	
}




