package tedu.day0102;
//������ָ��·��
import java.util.Scanner;

public class ItemInput {
	public static void main(String[] args) {
		System.out.print("��Ʒ����");
		//��������ֵ�����浽����name
		String name=
		 new Scanner(System.in).nextLine(); 		
		System.out.print("�۸�");
		double price=
		 new Scanner(System.in).nextDouble(); 		
		System.out.print("������");
		int n=
		 new Scanner(System.in).nextInt(); 
		System.out.println("���������Ʒ��Ϣ��");
		System.out.println(
		 name+", "+price+", "+n);
		
		
	}
}
