package day1701;

public class Test1 {
	public static void main(String[] args) {
		String s1 = "aaa";//常量池
		String s2 = "bbb";//常量池
		
		String s3 = s1+s2;//堆内存
		//将s3的内存地址放入常量池引用
		//intern()有返回值，返回放入常量池的内存地址
		//1.7后也就是当前对象的地址
		s3.intern();
		
		String s4 = "aaabbb";//常量池
		System.out.println(s3==s4);
	}
}



