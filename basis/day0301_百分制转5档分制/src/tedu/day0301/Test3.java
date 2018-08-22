package tedu.day0301;

public class Test3 {
	public static void main(String[] args) {
		System.out.println(1);
		int r = f(2);
		System.out.println(r);
		System.out.println(3);
		System.out.println(f(4));
		f(5);
	}
	
	static int f(int x) {
		return x*x;
	}
}
