package tedu.day0103;

public class Test3 {
	public static void main(String[] args) {
		char c1 = 'a';
		char c2 = 97;
		char c3 = 'b';
		char c4 = 98;
		char c5 = '中';
		char c6 = 20013;
		char c7 = 20014;
		char c8 = 20015;
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println(c7);
		System.out.println(c8);
		
		System.out.println(c1+1);
		System.out.println("------------------------------");
		char c9 = '\u4e2d';
		char c10 = '\u4e2e';
		char c11 = '\u4e2f';
		//unicode编码中第一个和最后一个中文
		//这个范围内有 20902个中文字符
		char c12 = '\u4e00';
		char c13 = '\u9fa5';
		System.out.println(c9);
		System.out.println(c10);
		System.out.println(c11);
		System.out.println(c12);
		System.out.println(c13);
	}
}



