package tedu.day1802;

import java.util.Timer;

public class Test1 {
	public static void main(String[] args) {
		Stack stack = new Stack();
		
		new Producer(stack).start();
		new Consumer(stack).start();
		
		Timer t;
		t.schedule(task, time);
		
		//main
		while(true) {
			synchronized (stack) {
				stack.notifyAll();
			}			
		}
	}
}







