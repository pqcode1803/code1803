package tedu.day1002;

public class Test1 {
	public static void main(String[] args) {
		A a = new A();
		//�����������ʵ����
		//�Ǿֲ�����AK47
		Weapon w1 = a.f();
		w1.kill();
		
		//
		Weapon w2 = a.g("���컭�");
		w2.kill();
	}
}

class A {
	public Weapon f() {
		class AK47 implements Weapon {
			@Override
			public void kill() {
				System.out.println(
				 "AK47����");
			}
		}
		
		AK47 a = new AK47();
		return a;
	}
	
	public Weapon g(String name) {
		Weapon w = new Weapon(){
			@Override
			public void kill() {
				System.out.println(name+"����");
			}
		};
		
		return w;
	}
	
	
}









