package tedu.day1704;

public class Test2 {
	public static void main(String[] args) {
		R1 r = new R1();//代码
		
		Thread a = new Thread(r,"A");
		Thread b = new Thread(r,"B");
		a.start();//a启动后，执行r.run()
		b.start();//b启动后，执行r.run()
	}
	
	//Runnable 包含代码，可以放入线程执行
	static class R1 implements Runnable {
		@Override
		public void run() {
			//获得当前正执行这行代码的线程对象
			Thread t = Thread.currentThread();
			String n = t.getName();
			for(int i=1;i<=1000;i++) {
				System.out.println(n+": "+i); 
			}
		}
	}
	
}





