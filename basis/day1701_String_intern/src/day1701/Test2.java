package day1701;

public class Test2 {
	public static void main(String[] args) {
		// �����������ַ�����
		// "aaa" �����ش���
		// new ���ڴ����½�һ������
		String s1 = new String("aaa");
		//�������Ѿ�������ͬ�ַ���
		//intern()ʲô������
		//ֱ�ӷ��س������ж�����ڴ��ַ
		s1 = s1.intern();
		
		System.out.println(s1 == "aaa");
		
	}
}





