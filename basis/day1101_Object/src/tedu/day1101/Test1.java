package tedu.day1101;

public class Test1 {
	public static void main(String[] args) {   
		Point a = new Point(3,4);
		Point b = new Point(3,4);
		
		System.out.println(a.toString());
		System.out.println(b.toString());
		//比较两个引用变量中保存的值
		//即内存地址
		System.out.println(a == b);
		System.out.println(a.equals(b));
	}
}




