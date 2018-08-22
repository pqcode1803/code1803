package tedu.day0302;

public class Test6 {
	public static void main(String[] args) {
		// [0,1)
		//double d = Math.random();
		//System.out.println(d);
		
		//>0.999
		for(int i=1; ;i++) {
			double d = Math.random();
			if(d>0.999) {
				System.out.println(
				"µÚ"+i+"´Î£º"+d);
				break;
			}
		}
	}
}






