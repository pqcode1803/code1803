package tedu.day1704;

public class Test1 {
	public static void main(String[] args) {
		/*
		 * *)�½�����T1�̶߳���
		 * *)�����������߳�
		 * *)�����̲߳��д�ӡ1��1000
		 */
		T1 a = new T1();
		T1 b = new T1();
		a.start();
		b.start();
	}
	
	static class T1 extends Thread {
		@Override
		public void run() {
			//run()�����������������߳�
			//���е��������
			String n = getName();//�߳���
			for(int i=1;i<=1000;i++) {
				System.out.println(n+": "+i); 
			}
		}
	}
	
}



