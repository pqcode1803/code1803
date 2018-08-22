package tedu.shoot;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JPanel;

public class GamePanel extends JPanel {
	Background bg = new Background();
	Hero hero = new Hero();

	//存放所有敌人的列表
	ArrayList<Enemy> enemys = new ArrayList<>();

	//存放所有子弹的列表
	ArrayList<Bullet> bullets = new ArrayList<>();

	//静态的帧计数变量
	static int counter;



	public GamePanel() {
		//设置面板的期望大小
		setPreferredSize(new Dimension(400,654));
	}

	@Override
	public void paint(Graphics g) {
		bg.paint(g);
		hero.paint(g);
		//绘制所有敌人
		paintEnemy(g);
		//绘制所有子弹
		paintBullet(g);
		//绘制得分和英雄生命
		paintScore(g);
	}

	private void paintScore(Graphics g) {
		Font font = new Font(
			Font.SANS_SERIF,Font.BOLD,14);
		g.setFont(font);
		
		g.setColor(Color.BLACK);
		g.drawString("生命：",8,20);
		g.drawString(""+hero.life, 160, 20);
		g.drawString("得分："+hero.score, 8, 38);
		
		g.setColor(Color.WHITE);
		g.drawString("生命：",8-1,20-1);
		g.drawString(""+hero.life, 160-1, 20-1);
		g.drawString("得分："+hero.score, 8-1, 38-1);
		
		g.setColor(Color.BLACK);
		g.drawRect(53, 8, 100, 14);
		g.setColor(Color.RED);
		g.fillRect(54, 9, 98*hero.life/10, 12);
		
	}

	private void paintBullet(Graphics g) {
		for (Iterator iterator = bullets.iterator(); iterator.hasNext();) {
			Bullet b = (Bullet) iterator.next();
			b.paint(g);
		}
	}

	private void paintEnemy(Graphics g) {
		for (Iterator iterator = enemys.iterator(); iterator.hasNext();) {
			Enemy e = (Enemy) iterator.next();
			e.paint(g);
		}
	}

	//动起来
	public void action() {
		//监听器，监听鼠标在面板上的动作
		addMouseMotionListener(new MouseAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				//设置英雄要移动到的新的目标位置
				hero.moveTo(e.getX(), e.getY());
			}
		});


		/*
		 * 计时器：
		 * jdk中，提供了一个执行定时间隔任务的工具，
		 * 可以以固定的时间频率，来执行指定的任务代码
		 * 
		 * 以 60 fps 帧速率来执行
		 */

		//新建计时器对象
		Timer timer = new Timer();
		//用计时器来安排任务代码执行日程
		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				counter++;
				bg.step();
				hero.step();

				//敌人随机出现
				enemyIn();
				//敌人移动一步
				enemyStep();

				//子弹发射
				bulletIn();
				//子弹移动
				bulletStep();

				//碰撞检测,碰撞子弹,碰撞英雄
				pengZhuang();

				//通知底层系统，重新绘制画面
				//系统会调用paint()方法进行重回
				repaint();
			}
		}, 0, 1000/60);

	}


	protected void pengZhuang() {
		//遍历敌人
		for (Iterator it1 = enemys.iterator(); it1.hasNext();) {
			Enemy e = (Enemy) it1.next();
			if(e.isExplode()||e.isDead()) {
				continue;//处理下一个敌人
			}

			//遍历子弹
			for (Iterator it2 = bullets.iterator(); it2.hasNext();) {
				Bullet b = (Bullet) it2.next();
				if(e.hit(b)) {//敌人碰撞子弹
					it2.remove();//子弹移除
				}
			}

			//敌人碰撞英雄
			if(hero.isNormal() && e.hit(hero)) {
				//敌人e，是否是Award子类
				if(e instanceof Award) {
					Award a = (Award) e;
					hero.life += a.getLife();
					if(hero.life>10) {
						hero.life = 10;
					}
					//英雄级别还没有到最高级
					if(hero.level<Main.weapons.length-1) {
						hero.weapon=a.getWeapon(++hero.level);
					}
				} else {
					//英雄级别还没到最低0
					if(hero.level>0) {
						hero.weapon=Main.weapons[--hero.level];
					}
				}
			}
		}
	}

	protected void bulletIn() {
		if(hero.isDead()) {
			return;
		}

		if(counter%15 != 0) return;
		//英雄射击
		Bullet[] a = hero.shoot();
		//发射的子弹加入子弹列表
		for (int i = 0; i < a.length; i++) {
			Bullet b = a[i];
			if(b != null) {
				bullets.add(b);
			}
		}
	}

	protected void bulletStep() {
		for (Iterator it = bullets.iterator(); it.hasNext();) {
			Bullet b = (Bullet) it.next();
			b.step();
			if(b.isOut()) {
				it.remove();
			}
		}
	}

	protected void enemyIn() {
		/*
			每半秒(30帧)出现一个敌人
			三种敌人随机出现
			60% 小飞机
			30% 大飞机
			10% 小蜜蜂
		 */
		if(counter%30 != 0) return;

		double d = Math.random();

		if(d<0.1) {
			enemys.add(new Airplane());
		} else if(d<0.4) {
			enemys.add(new BigPlane());
		} else {
			enemys.add(new Bee());
		}
	}

	protected void enemyStep() {
		//迭代遍历
		for (Iterator it = enemys.iterator(); it.hasNext();) {
			Enemy e = (Enemy) it.next();

			if(e.isDead()) {//爆炸结束已经死亡
				hero.score += e.score;
				it.remove();//删除这个敌人
				continue;
			}
			e.step();
			if(e.isOut()) {//走出画面
				it.remove(); //从列表删除这个敌人
			}
		}
	}
}





