package tedu.day1102;

public class Test4 {
	public static void main(String[] args) {
		String s = " abc abc abc ";
		System.out.println(s);
		System.out.println(s.charAt(2));//2λ���ַ�
		System.out.println(s.charAt(3));//3λ���ַ�
		System.out.println(s.length());//�ַ�����
		System.out.println(s.startsWith(" ab"));//�ж�ǰ׺
		System.out.println(s.endsWith("bc "));//�жϺ�׺
		System.out.println(s.indexOf("bc"));//�ҵ�һ��bc
		System.out.println(s.indexOf("bc",3));//3λ�������bc
		System.out.println(s.lastIndexOf("bc"));//�Ӻ���ǰ��bc
		System.out.println(s.indexOf("xxxx"));//�����ڣ��õ�-1   
		System.out.println(s.substring(5));//��ȡ5��ĩβ
		System.out.println(s.substring(5,10));//��ȡ[5,10)
		System.out.println(s.trim());//ȥ�����˿հ��ַ�
		
	}
}
