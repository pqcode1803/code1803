package tedu.day1704;

public class Test2 {
	public static void main(String[] args) {
		R1 r = new R1();//����
		
		Thread a = new Thread(r,"A");
		Thread b = new Thread(r,"B");
		a.start();//a������ִ��r.run()
		b.start();//b������ִ��r.run()
	}
	
	//Runnable �������룬���Է����߳�ִ��
	static class R1 implements Runnable {
		@Override
		public void run() {
			//��õ�ǰ��ִ�����д�����̶߳���
			Thread t = Thread.currentThread();
			String n = t.getName();
			for(int i=1;i<=1000;i++) {
				System.out.println(n+": "+i); 
			}
		}
	}
	
}





