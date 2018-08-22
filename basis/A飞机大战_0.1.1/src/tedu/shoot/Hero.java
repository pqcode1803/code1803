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
	//英雄使用的武器
	Weapon weapon = Main.weapons[0];
	//英雄的级别
	int level;
	
	int life=10;
	int status = STATUS_NORMAL;
	int curIndex=1;
	
	//得分属性
	int score;
	
	
	//接收的参数是鼠标位置
	//把鼠标位置，设置成下一步移动的目标位置
	public void moveTo(int tx, int ty) {
		this.tx = tx-img.getWidth()/2;
		this.ty = ty-img.getHeight()/2;
	}
	
	//移动一帧
	public void step() {
		if(status==STATUS_NORMAL) {
			if(x==tx && y==ty) {//没有移动
				img = imgs[1];//使用低速图片
			} else {//把x,y移动到tx,ty
				img = imgs[0];//使用加速图片
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
	
	//从参数拿到画布，把自己画在画布上
	public void paint(Graphics g) {
		if(status!=STATUS_DEAD) {
			g.drawImage(img,x,y,null);
		}
	}
	
	//英雄射击
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




