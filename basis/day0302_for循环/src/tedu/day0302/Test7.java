package tedu.day0302;

public class Test7 {
	public static void main(String[] args) {
		// >0.999
		for(int i=1; ;i++) {
			double d = Math.random();
			if(d<=0.999) {
				continue;
			}
			System.out.println(
			"µÚ"+i+"´Î£º"+d);
			break;
		}
	}
}
