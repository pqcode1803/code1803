package tedu.day2202;

public class A {
	@Test(id=1, value="≤‚ ‘1")
	public void a() {
		System.out.println("A.a()");
	}
	
	public void b() {
		System.out.println("A.b()");
	}
	
	@Test("≤‚ ‘2")
	public void c() {
		System.out.println("A.c()");
	}
}
