package tedu.day1102;

public class Test3 {
	public static void main(String[] args) {
		String s1 = "abc";//常量池创建对象
		String s2 = "abc";//访问常量池存在的对象
		//在堆内存创建字符串副本
		String s3 = new String("abc");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s2.equals(s3));       
	}
}
