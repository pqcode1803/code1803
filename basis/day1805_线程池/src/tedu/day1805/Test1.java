package tedu.day1805;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test1 {
	public static void main(String[] args) {
		Runnable[] a = new Runnable[1000];
		for (int i = 0; i < a.length; i++) {
			a[i] = new R1(i);
		}
		
		//新建线程池
		//ExecutorService p = Executors.newCachedThreadPool();
		ExecutorService p = Executors.newFixedThreadPool(4);
		
		//1000个任务，丢进线程池
		for (int i = 0; i < a.length; i++) {
			Runnable r = a[i];
			p.execute(r);
		}
		
	}
	
	static class R1 implements Runnable {
		int id;
		public R1(int id) {
			this.id = id;
		}
		@Override
		public void run() {
			String n = Thread.currentThread().getName();
			System.out.println(n+":  "+id);
		}
	}
}




