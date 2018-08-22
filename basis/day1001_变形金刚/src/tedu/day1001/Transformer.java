package tedu.day1001;

public class Transformer {
	private Weapon w;
	
	public void setWeapon(Weapon w) {
		this.w = w;
	}
	
	public void attack() {
		System.out.println("变形金刚开始进攻");
		if(w == null) {
			System.out.println("用牙咬");
			return;
		}
		
		String type="";
		switch(w.getType()) {
		case Weapon.TYPE_COLD:type="冷兵器";break;
		case Weapon.TYPE_HOT:type="热兵器";break;
		case Weapon.TYPE_NUCLEAR:type="核武器";break;
		}
		
		System.out.println(
		 "使用"+type+w.getName()+"进攻");
		w.kill();
	}
}



