package tedu.day1002;

public class Test1 {
	public static void main(String[] args) {
		A a = new A();
		//武器对象的真实类型
		//是局部类型AK47
		Weapon w1 = a.f();
		w1.kill();
		
		//
		Weapon w2 = a.g("方天画戟");
		w2.kill();
	}
}

class A {
	public Weapon f() {
		class AK47 implements Weapon {
			@Override
			public void kill() {
				System.out.println(
				 "AK47进攻");
			}
		}
		
		AK47 a = new AK47();
		return a;
	}
	
	public Weapon g(String name) {
		Weapon w = new Weapon(){
			@Override
			public void kill() {
				System.out.println(name+"进攻");
			}
		};
		
		return w;
	}
	
	
}









