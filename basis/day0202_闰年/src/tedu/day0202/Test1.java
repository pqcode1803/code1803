package tedu.day0202;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("������ţ�");
		//�õ������ֵ�����浽����y
		int y = 
		 new Scanner(System.in).nextInt();
		
		//y�ܷ�4,100,400����
		boolean a = y%4==0;
		boolean b = y%100==0;
		boolean c = y%400==0;
		
		//�ַ����������ȸ�ֵ"ƽ��"
		//֮������ж������꣬
		//���޸�����������ĳ�"����"
		String r = "ƽ��";
		
		//���a��true���ܱ�4������
		/*if(a) {
			//�ܱ�4����������£�
			//��һ���ж�b��false�����ܱ�100������
			if(b == false) {
				r = "����";
			}
		}
		
		//���c��true���ܱ�400������
		if(c) {
			r = "����";
		}*/
		
		//a���沢�ҡ���b�����棨��b�Ǽ٣�
		//���ߣ�c����
		if((a && !b) || c) {
			r = "����";
		}
		
		System.out.println(y+"����"+r);
	}
}





