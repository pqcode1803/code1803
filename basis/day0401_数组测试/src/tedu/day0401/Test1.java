package tedu.day0401;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		//�½�int[]���飬�����ڴ��ַ���浽����a
		int[] a = new int[10];
		//Arrays.toString(a)
		//�������е��������ӳ��ַ���
		System.out.println(Arrays.toString(a));
		
		//�������飬����100���������
		for(int i=0; i<a.length; i++) {
			a[i] = new Random().nextInt(100);
			System.out.println(Arrays.toString(a));
		}
		
		
		//��ƽ��ֵ
		double sum=0;
		for(int i=0;i<a.length;i++) {
			sum += a[i]; 
		}
		System.out.println(
		"ƽ��ֵ�� "+(sum / a.length));
		
		
		//�����±�3, 4λ�õ�ֵ
		int c = a[3];
		a[3] = a[4];
		a[4] = c;
		System.out.println(Arrays.toString(a));
		
		
		//��startλ�ÿ�ʼ�������Сֵ
		//��ȡ��Сֵ��λ���±�
		/*
		 *              min
		 *              |
		 * [7,85,95,54,24,28,19,3,63,66]
		 *              |     i
		 *              start
		 *              
		 * 1.����startλ�þ�����Сֵ min=start
		 * 2.��start+1��ʼ��
		 *   ���ĩβѰ�ұ�minλ��ֵ��С��ֵ
		 * 3.�ҵ���Сֵ���޸�min����Сֵλ��
		 */
		System.out.print("���Ŀ�ʼ����Сֵ��");
		int start = new Scanner(System.in).nextInt();
		int min = start;
		for(int i=start+1;i<a.length;i++) {
			if(a[i]<a[min]) {
				min = i;
			}
		}
		System.out.println(
		 start+"���"+min+"λ����Сֵ��"+a[min]);
	}
}




