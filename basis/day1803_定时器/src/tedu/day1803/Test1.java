package tedu.day1803;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Test1 {
	public static void main(String[] args) {
		//����1����ӡʱ�䣬�����������
		TimerTask task1 = new TimerTask() {
			public void run() {
				SimpleDateFormat sdf = 
				 new SimpleDateFormat("HH:mm:ss.SSS");
				String s = sdf.format(new Date());
				String n = Thread.currentThread().getName();
				System.out.println(n+":  "+s);
			}
		};
		
		//��ʱ��
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(task1, 3000, 1000);
		
		//����2��20���ȡ�����ж�ʱ����
		TimerTask task2 = new TimerTask() {
			@Override
			public void run() {
				String n = Thread.currentThread().getName();
				System.out.println(n+":  ȡ����������");
				timer.cancel();
			}
		};
		
		timer.schedule(task2, 20000);
		
	}
}







