package tedu.day1704;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Thread a = new Thread() {public void run() {
			SimpleDateFormat sdf = 
			 new SimpleDateFormat("HH:mm:ss.SSS");
			while(true) {
				String s = sdf.format(new Date());
				System.out.println(s);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
					break;
				}
			}
		}};
		
		a.start();
		
		//在main主线程中
		//用户按回车后，打断a的暂停状态
		new Scanner(System.in).nextLine();
		a.interrupt();
		
	}
}



