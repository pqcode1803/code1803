package tedu.day1205;

public class Test2 {
	public static void main(String[] args) {
		Student s = new Student();
		s = null;
		//建议现在就执行垃圾回收
		System.gc();
		
		for(int i=0;i<100000000;i++) {
			s = new Student();
		}
	}
}
