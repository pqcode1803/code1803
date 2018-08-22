package tedu.day1103;

public class Test2 {
	public static void main(String[] args) {
		StringBuilder sb = 
			new StringBuilder("abc");
		sb.append("def")
		.append("ghi")//abcdefghi
		.insert(5, "---")//abcde---fghi
		.delete(7, 9);//abcde--ghi
		
		System.out.println(sb.toString());
	}
}
