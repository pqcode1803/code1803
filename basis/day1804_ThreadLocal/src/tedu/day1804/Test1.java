package tedu.day1804;

public class Test1 {
	static ThreadLocal<Double> tl = new ThreadLocal<>();
	
	public static void main(String[] args) {
		new Thread() {public void run() {
			a();
			b();
			c();
		}}.start();
		
		new Thread() {public void run() {
			a();
			b();
			c();
		}}.start();
	}
	
	static void a() {
		double d = Math.random();
		tl.set(d);//把数据绑定到当前线程
		System.out.println("a : "+d);
	}
	static void b() {
		double d = tl.get();
		System.out.println("b : "+d);
	}
	static void c() {
		double d = tl.get();
		tl.remove();
		System.out.println("c : "+d);
	}
}


