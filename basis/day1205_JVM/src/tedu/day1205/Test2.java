package tedu.day1205;

public class Test2 {
	public static void main(String[] args) {
		Student s = new Student();
		s = null;
		//�������ھ�ִ����������
		System.gc();
		
		for(int i=0;i<100000000;i++) {
			s = new Student();
		}
	}
}
