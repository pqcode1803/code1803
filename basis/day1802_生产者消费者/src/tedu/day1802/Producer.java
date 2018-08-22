package tedu.day1802;

import java.util.Random;

public class Producer extends Thread{
	private Stack stack;
	public Producer(Stack stack) {
		this.stack = stack;
	}
	
	@Override
	public void run() {
		//��ѭ����������ѹ��ջ
		while(true) {
			char c = (char) ('a'+new Random().nextInt(26));
			synchronized (stack) {
				stack.push(c);
				System.out.println("push--> "+c);
			}
		}
	}
	
}




