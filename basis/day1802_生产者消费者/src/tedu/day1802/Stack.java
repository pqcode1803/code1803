package tedu.day1802;

public class Stack {
	private char[] a = new char[5];
	private int index;
	
	public void push(char c) {
		while(index == 5) {
			//当前线程，在当前对象上等待
			try {
				this.wait();
			} catch (InterruptedException e) {
			}
		}
		a[index] = c;
		index++;
		//通知在当前对象上等待的所有线程
		notifyAll();
	}
	public char pop() {
		while(index == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		index--;
		char c = a[index];
		notifyAll();
		return c;
	}
}



