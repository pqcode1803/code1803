package tedu.shoot;

public class BigPlane extends Enemy {
	public BigPlane() {
		imgs = Main.bigplanes;
		img = Main.bigplanes[0];
		stepPx = 1;
		life = 4;
		damage=2;
		score=2;
		init();
	}
}
