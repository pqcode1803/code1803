package tedu.day0901;

public class Test1 {
	public static void main(String[] args) {
		new B();
		System.out.println("--------------");
		new B();
	}
}	

class A {
	int prt(int i) {
		System.out.println("v1="+v1);
		return i;
	}
	
	
	int v1=  prt(1);
	static {
		System.out.println("A静态块");
		System.out.println(A.v2);
		System.out.println(B.v4);
	}
	static int v2=2;
	public A() {
		System.out.println("A构造方法");
	}
}


class B extends A {
	int v3=3;
	static int v4=4;
	static {
		System.out.println("B静态块");
	}
	public B() {
		System.out.println("B构造方法");
	}
}



