package tedu.day1102;

public class Test3 {
	public static void main(String[] args) {
		String s1 = "abc";//�����ش�������
		String s2 = "abc";//���ʳ����ش��ڵĶ���
		//�ڶ��ڴ洴���ַ�������
		String s3 = new String("abc");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s2.equals(s3));       
	}
}
