package tedu.day1205;

public class Test1 {
	public static void main(String[] args) {
		Student[] a = new Student[100000000];
		for(int i=0;i<a.length;i++) {
			a[i] = new Student(i,"name"+i,i);
		}
	}
}
