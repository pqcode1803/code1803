package tedu.day1102;

public class Test4 {
	public static void main(String[] args) {
		String s = " abc abc abc ";
		System.out.println(s);
		System.out.println(s.charAt(2));//2位置字符
		System.out.println(s.charAt(3));//3位置字符
		System.out.println(s.length());//字符数量
		System.out.println(s.startsWith(" ab"));//判断前缀
		System.out.println(s.endsWith("bc "));//判断后缀
		System.out.println(s.indexOf("bc"));//找第一个bc
		System.out.println(s.indexOf("bc",3));//3位置向后找bc
		System.out.println(s.lastIndexOf("bc"));//从后向前找bc
		System.out.println(s.indexOf("xxxx"));//不存在，得到-1   
		System.out.println(s.substring(5));//截取5到末尾
		System.out.println(s.substring(5,10));//截取[5,10)
		System.out.println(s.trim());//去除两端空白字符
		
	}
}
