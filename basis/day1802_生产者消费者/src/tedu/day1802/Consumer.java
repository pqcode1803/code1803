
package tedu.day1802;

public class Consumer extends Thread {
	private Stack stack;
	public Consumer(Stack stack) {
		this.stack = stack;
	}
	
	@Override
	public void run() {
		//死循环弹出数据
		while(true) {
			synchronized (stack) {
				char c = stack.pop();
				System.out.println("pop<-- "+c);
			}
		}
	}
	
}
