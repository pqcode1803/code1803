package day1701;

public class Test1 {
	public static void main(String[] args) {
		String s1 = "aaa";//������
		String s2 = "bbb";//������
		
		String s3 = s1+s2;//���ڴ�
		//��s3���ڴ��ַ���볣��������
		//intern()�з���ֵ�����ط��볣���ص��ڴ��ַ
		//1.7��Ҳ���ǵ�ǰ����ĵ�ַ
		s3.intern();
		
		String s4 = "aaabbb";//������
		System.out.println(s3==s4);
	}
}



