package tedu.day1704;

public class Test1 {
	public static void main(String[] args) {
		/*
		 * *)新建两个T1线程对象
		 * *)启动这两个线程
		 * *)两个线程并行打印1到1000
		 */
		T1 a = new T1();
		T1 b = new T1();
		a.start();
		b.start();
	}
	
	static class T1 extends Thread {
		@Override
		public void run() {
			//run()方法，就是与其他线程
			//并行的任务代码
			String n = getName();//线程名
			for(int i=1;i<=1000;i++) {
				System.out.println(n+": "+i); 
			}
		}
	}
	
}



