package tedu.day0201;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("�������16.4����");
		System.out.println("���� 299792458 ��/��");
		System.out.println("ϲȵ�� 0.46 ��");
		System.out.println("ţ��֯Ů��ۣ���Ҫ����ֻϲȵ");
		
		//����
		long ly = 299792458L*60*60*24*365;
		double d = 16.4*ly;//16.4���껻�����
		double r = d/0.46;//ϲȵ����
		//����ȡ��
		//Math.ceil(r)
		//ȡ���������double���ͷ��� xxxxx.0
		//����ǿת��long����
		long n = (long) Math.ceil(r);
		
		System.out.println(n);
		
	}
}









