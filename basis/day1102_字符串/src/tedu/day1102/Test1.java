package tedu.day1102;

public class Test1 {
	public static void main(String[] args) {
		char[] a = {'a','b','c','d'};
		String s1 = new String(a);
		
		String s2 = "abcd";
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}
}





