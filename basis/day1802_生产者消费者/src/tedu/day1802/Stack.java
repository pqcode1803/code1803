package tedu.day1802;

public class Stack {
	private char[] a = new char[5];
	private int index;
	
	public void push(char c) {
		while(index == 5) {
			//��ǰ�̣߳��ڵ�ǰ�����ϵȴ�
			try {
				this.wait();
			} catch (InterruptedException e) {
			}
		}
		a[index] = c;
		index++;
		//֪ͨ�ڵ�ǰ�����ϵȴ��������߳�
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



