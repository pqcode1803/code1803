package tedu.shoot;

public class Bee extends Enemy implements Award {
	
	int dx;
	
	public Bee() {
		imgs = Main.bees;
		img = Main.bees[0];
		stepPx = 5;
		life = 1;
		damage=0;
		init();
	}
	
	@Override
	public void init() {
		super.init();
		if(Math.random()<0.5) {
			dx = -1;
		} else {
			dx = 1;
		}
	}
	
	
	@Override
	public void step() {
		super.step();
		x += dx;
	}

	@Override
	public int getLife() {
		return 1;
	}

	@Override
	public Weapon getWeapon(int level) {
		if(level<0){
			return Main.weapons[0];
		}
		if(level>=Main.weapons.length) {
			return Main.weapons[
			       Main.weapons.length-1];
		}
		
		return Main.weapons[level];
	}
	
}



