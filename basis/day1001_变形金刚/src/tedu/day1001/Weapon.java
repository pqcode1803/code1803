package tedu.day1001;

public interface Weapon {
	/*public static final*/ 
	int TYPE_COLD=6534;
	int TYPE_HOT=8565;
	int TYPE_NUCLEAR=3534;
	
	/*public abstract*/
	void kill();
	String getName();
	int getType();
}
