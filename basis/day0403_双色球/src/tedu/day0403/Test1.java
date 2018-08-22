package tedu.day0403;

import java.util.Arrays;
import java.util.Random;

public class Test1 {
	public static void main(String[] args) {
		//��init()�����л��һ������
		int[] r = init(33);
		int[] b = init(16);
		System.out.println(Arrays.toString(r));
		System.out.println(Arrays.toString(b));  
		
		//ѡ��6���������
		int[] red = xuanRed(r);
		//ѡ��1���������
		int blue = xuanBlue(b);
		System.out.println(Arrays.toString(red));
		System.out.println(blue);
	}
	
	
	
	
	
	
	
	
	
	
	
	private static int[] xuanRed(int[] r) {
		/*
		 * r
		 * [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17...]
		 *          j                                                        
		 * 
		 * flag
		 * [x,x,v,x,x,x,v,x,x, x, v, x, v, x, x, x, x...]
		 * 
		 * red
		 * [7 13 3 11     ]
		 *            i
		 */
		int[] red = new int[6];
		//33��λ�ö���Ĭ��ֵfalse
		boolean[] flag = new boolean[33];
		
		//����red����6��λ�ã�����ѡ��ĺ���
		for(int i=0;i<6;i++) {
			//�������λ�ñ���j
			int j;
			//��ѡһ��λ�ã����ж��Ƿ�ѡ��
			//ѡ����������ѡ
			do {
				j = new Random().nextInt(33);
			} while(flag[j]);
			
			red[i] = r[j];
			flag[j] = true;//���jλ���Ѿ�ѡ��
		}
		
		return red;		
	}

	private static int xuanBlue(int[] b) {
		return b[new Random().nextInt(16)];
	}

	static int[] init(int n) {
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = i+1;
		}
		return a;//���ص���������ڴ��ַ
	}
}











