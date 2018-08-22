package tedu.day0306;

public class Test1 {
	public static void main(String[] args) {
		//>0.999
		int i=0;
		double d=0;
		
		while(d<=0.999) {
			d=Math.random();
			i++;
		}
		
		System.out.println(
		 "µÚ"+i+"´Î£º"+d);
	}
}
