package day1701;

public class Test2 {
	public static void main(String[] args) {
		// 创建了两个字符串：
		// "aaa" 常量池创建
		// new 堆内存又新建一个副本
		String s1 = new String("aaa");
		//常量池已经存在相同字符串
		//intern()什么都不做
		//直接返回常量池中对象的内存地址
		s1 = s1.intern();
		
		System.out.println(s1 == "aaa");
		
	}
}





