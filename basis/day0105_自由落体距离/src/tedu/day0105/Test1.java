package tedu.day0105;
import java.math.BigDecimal;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("���뽵��ʱ�䣨�룩��");  
		//��������ֵ�����浽����t
		double t=
		 new Scanner(System.in).nextDouble();
		
		//�׹�ʽ�����������뱣�浽����d
		//double d=0.5*9.8*t*t;
		
		BigDecimal bd1 = BigDecimal.valueOf(4.9);
		BigDecimal bd2 = BigDecimal.valueOf(t);
		double d = 
		 bd1.multiply(bd2.pow(2))
		    .doubleValue();
		
		System.out.println(
		 "���� "+t+" �룬������ "+d+" ��");
	}
}





