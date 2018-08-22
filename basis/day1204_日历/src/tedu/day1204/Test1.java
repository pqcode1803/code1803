package tedu.day1204;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) throws ParseException {
		System.out.println("���롰��-�¡���");
		String s = new Scanner(System.in).nextLine();
		
		//2018-4 -->Date 2018-4-1 0��
		SimpleDateFormat f = 
		 new SimpleDateFormat("yyyy-MM");
		Date d = f.parse(s);
		
		//�½�Calendar����
		//����Calendar��ʾ��d��ͬ��ʱ��
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		
		//1�����ܼ�
		int day = c.get(Calendar.DAY_OF_WEEK);
		//���µ�����
		int max = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		//��������
		int count=0;
		
		System.out.println(
		 "��\tһ\t��\t��\t��\t��\t��");
		for(int i=0;i<day-1;i++) {
			System.out.print(" \t");
			count++;
		}
		for(int i=1;i<=max;i++) {
			System.out.print(i+"\t");
			count++;
			if(count==7) {
				System.out.println();
				count=0;
			}
		}
	}
}	





