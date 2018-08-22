package tedu.day0103;

public class Test1 {
	public static void main(String[] args) {
		//定义abcdefgh八个变量，
		//保存四种整数的最小值和最大值
		byte a=-128;
		byte b=127;
		//调用JDK类库中的Short类
		//调用它的一个MIN_VALUE常量，
		//来获得最小值
		short c=Short.MIN_VALUE;
		short d=Short.MAX_VALUE;
		int e=Integer.MIN_VALUE;
		int f=Integer.MAX_VALUE;
		long g=Long.MIN_VALUE;
		long h=Long.MAX_VALUE;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
	}
}






