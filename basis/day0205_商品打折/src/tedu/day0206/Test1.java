package tedu.day0206;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("���빤�ʣ�");
		double s =
		new Scanner(System.in).nextDouble();
		
		if(s<=3500) {
			System.out.println("û�дﵽ������");
			return;//����������������벻ִ��
		}
		
		//�ٵ�3500
		s -= 3500; //s = s-3500;
		
		//����s�ķ�Χ����ȷ��˰�ʺ�����۳���
		double r = 0;//˰�ʱ���
		int k = 0;//����۳�������
		
		if(s<=1500) {
			r=0.03; k=0;
		} else if(s<=4500) {
			r=0.1;  k=105;
		} else if(s<=9000) {
			r=0.2;  k=555;
		} else if(s<=45000) {
			r=0.25; k=1005;
		} else if(s<=55000) {
			r=0.3;  k=2755;
		} else if(s<=80000) {
			r=0.35; k=5505;
		} else {
			r=0.45; k=13505;
		}
		
		double tax = s*r - k;
		System.out.println("��������˰��"+tax);
		
	}
}






