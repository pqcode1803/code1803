package tedu.day1001;

public class AK47 implements Weapon{
	public void kill() {
		System.out.println("ˣǹ");
	}
	public String getName() {
		return "AK47";
	}
	public int getType() {
		return Weapon.TYPE_HOT;
	}
}
