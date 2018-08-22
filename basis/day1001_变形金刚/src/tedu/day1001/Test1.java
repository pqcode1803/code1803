package tedu.day1001;

public class Test1 {
	public static void main(String[] args) {
		Transformer t = new Transformer();
		Sword s = new Sword();
		AK47 a = new AK47();
		Lyb l = new Lyb();
		
		t.attack();
		
		t.setWeapon(s);
		t.attack();
		t.setWeapon(a);
		t.attack();
		t.setWeapon(l);
		t.attack();
	}
}




