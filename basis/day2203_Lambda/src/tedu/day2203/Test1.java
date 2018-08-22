package tedu.day2203;

public class Test1 {
	public static void main(String[] args) {
		//匿名内部类实现Runnable
		new Thread(new Runnable() {
			@Override
			public void run() {
				f();
			}
		}).start();
		
		//Lambda函数式编程
		/*
		 * Java会自动识别小括号中
		 * 参数类型是 Runnable，
		 * 自动创建Runnable子类对象，
		 * 并在run()方法中，调用指定的f方法
		 */
		new Thread(Test1::f).start();
	}
	
	static void f() {
		System.out.println("f()");
	}
}
