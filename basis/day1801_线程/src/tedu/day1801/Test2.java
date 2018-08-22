package tedu.day1801;

public class Test2 {
	public static void main(String[] args) {
		R1 a = new R1();
		
		Thread t = new Thread(a, "t");
		//a.run()中死循环执行 a.add()
		t.start();
		
		//main线程
		while(true) {
			int i = a.get();
			if(i%2==1) {
				System.out.println(i);
				System.exit(0);//退出虚拟机         
			}
		}
		
	}
	
	static class R1 implements Runnable {
		static int i;
		
		//t线程执行add()
		public synchronized void add() {
			i++;
			i++;
		}
		
		//main线程执行get()
		public synchronized int get() {
			return i;
		}
		
		public void run() {
			while(true) {
				add();
			}
		}
	}
	
}








