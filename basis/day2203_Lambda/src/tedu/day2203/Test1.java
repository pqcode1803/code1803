package tedu.day2203;

public class Test1 {
	public static void main(String[] args) {
		//�����ڲ���ʵ��Runnable
		new Thread(new Runnable() {
			@Override
			public void run() {
				f();
			}
		}).start();
		
		//Lambda����ʽ���
		/*
		 * Java���Զ�ʶ��С������
		 * ���������� Runnable��
		 * �Զ�����Runnable�������
		 * ����run()�����У�����ָ����f����
		 */
		new Thread(Test1::f).start();
	}
	
	static void f() {
		System.out.println("f()");
	}
}
