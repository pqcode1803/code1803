package tedu.day0404;

import java.util.Arrays;
import java.util.Random;

public class Test1 {
	public static void main(String[] args) {
		//���һ�������������
		int[] a = suiJi();
		System.out.println(Arrays.toString(a));
		System.out.println("=======================");
		sort(a);//����
		System.out.println("=======================");
		System.out.println(Arrays.toString(a));
	}

	
	
	
	
	
	
	
	private static int[] suiJi() {
		/*
		 * *)����5+[0,6)��Χ���������
		 *   �������len
		 * *)�½�len���ȵ�int[]����浽����a
		 * *)��������a������100�����ֵ
		 * *)��������a���ڴ��ַ
		 */
		int len = 5+new Random().nextInt(6);
		int[] a = new int[len];
		for(int i=0;i<len;i++) {
			a[i]=new Random().nextInt(100);
		}
		return a;
	}
	
	private static void sort(int[] a) {
		/*
		 * ��������
		 * *)��һ��ֵ��������������
		 * *)�ӵڶ���ֵ��ʼ����
		 * *)��ǰ���뵽��������������
		 * 
		 *       j    
		 * [23, 32, 35, 39, 41, 42, 85, 28]
		 *                          i
		 */
		for(int i=1;i<a.length;i++) {
			//��iλ�õ�ֵ����ǰ�ƶ����嵽�����ڵ�λ��
			for(int j=i-1; j>=0; j--) {
				if(a[j]>a[j+1]) {
					int c = a[j];
					a[j] = a[j+1];
					a[j+1] = c;
				} else {
					break;
				}
			}
			System.out.println(Arrays.toString(a));
		}
		
		
		
	}
}










