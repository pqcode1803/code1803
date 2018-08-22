package tedu.day1803;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Test1 {
	public static void main(String[] args) {
		//任务1：打印时间，单次任务代码
		TimerTask task1 = new TimerTask() {
			public void run() {
				SimpleDateFormat sdf = 
				 new SimpleDateFormat("HH:mm:ss.SSS");
				String s = sdf.format(new Date());
				String n = Thread.currentThread().getName();
				System.out.println(n+":  "+s);
			}
		};
		
		//定时器
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(task1, 3000, 1000);
		
		//任务2：20秒后，取消所有定时任务
		TimerTask task2 = new TimerTask() {
			@Override
			public void run() {
				String n = Thread.currentThread().getName();
				System.out.println(n+":  取消所有任务");
				timer.cancel();
			}
		};
		
		timer.schedule(task2, 20000);
		
	}
}







