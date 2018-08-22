package tedu.day1102;

public class Test2 {
	public static void main(String[] args) {
		String s0 = "abcdefghijklmnopqrstuvwxyz";
		String s = "";
		
		//1970-1-1 0点开始的毫秒值
		long t = System.currentTimeMillis();
		for(int i=0;i<100000;i++) {
			s += s0;
		}
		t = System.currentTimeMillis()-t;
		System.out.println(t);
	}
}
