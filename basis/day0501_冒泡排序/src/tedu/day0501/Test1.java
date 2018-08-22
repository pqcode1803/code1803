package tedu.day0501;

import java.util.Arrays;
import java.util.Random;

public class Test1 {
	public static void main(String[] args) {
		int[] a = suiJi();
		System.out.println(Arrays.toString(a));
		System.out.println("==============================");
		sort(a);
		System.out.println("==============================");
		System.out.println(Arrays.toString(a));
	}

	private static int[] suiJi() {
		//�������len, [5,11)
		//�½�len���ȵ�int[]���飬
		//��������100���������
		//�����������
		int len = 5+new Random().nextInt(6);
		int[] a = new int[len];
		for(int i=0;i<a.length;i++) {
			a[i] = new Random().nextInt(100);
		}
		return a;
	}

	private static void sort(int[] a) {
		/*
		 * ð������
		 * 
		 *                     j
		 * [1, 60, 14, 88, 14, 43, 84]
		 *      i
		 * 
		 * *)iѭ����������
		 *     *)jѭ����a.lenth-1
		 *         *)���j-1λ��ֵ>jλ��ֵ
		 *             *)����j-1,��jλ��
		 *             
		 *             
		 *                     
		 * [1, 14, 14, 43, 60, 84, 88]
		 *                  i
		 *              
		 * jѭ����ʼǰ: 
		 * boolean flag = false û�н�������
		 * 
		 * �н�����
		 * flag = true ����������,���ݻ����ҵ�
		 * 
		 *          if(falg��false) {
		 *          	break;
		 *          }
		 */
		for(int i=0;i<a.length;i++) {
			
			boolean flag = false;//û�н���
			//����Сֵ�Ƶ�iλ��
			//�����У���СֵҲ����ǰ�ƶ�����
			for(int j=a.length-1;j>i;j--) {
				if(a[j-1]>a[j]) {
					int c = a[j];
					a[j] = a[j-1];
					a[j-1] = c;
					flag = true;
				}
			}
			//jѭ�������У�û�н���
			//����λ�ö�����ȷ�ģ��������
			if(!flag) {
				break;
			}
			
			System.out.println(Arrays.toString(a)); 
		}
		
		
	}
}















