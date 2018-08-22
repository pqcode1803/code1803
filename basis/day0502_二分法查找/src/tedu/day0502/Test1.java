package tedu.day0502;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		int[] a = suiJi();
		Arrays.sort(a);//�Ż��Ŀ��������㷨
		System.out.println(Arrays.toString(a));
		System.out.print("���ҵ�Ŀ��ֵ��");
		int t = new Scanner(System.in).nextInt();
		
		//���ַ�����
		int index = binarySearch(a, t);
		if(index>=0) {
			System.out.println(t+"��"+index+"λ��"); 
		} else {
			System.out.println("�Ҳ���Ŀ��ֵ "+t);
		}
	}

	private static int[] suiJi() {
		int len = 5+new Random().nextInt(6);
		int[] a = new int[len];
		for(int i=0;i<a.length;i++) {
			a[i] = new Random().nextInt(100);
		}
		return a;
	}

	private static int binarySearch(int[] a, int t) {
		/*
		 * ����������a��Ѱ��Ŀ��ֵt
		 * 
		 * 84
		 *              mid
		 * [12,35,53,56,69,77,80,83,85,91]
		 *  lo
		 *                             hi
		 * 
		 * �����±�
		 * lo=0
		 * hi=a.length-1
		 * mid
		 * 
		 * ��lo<=hi
		 * 		���м�λ�ñ��浽mid
		 * 		midλ�ô���Ŀ��ֵt,hi��λ�� mid-1
		 * 		midλ��С����Ŀ��ֵt,lo��λ�� mid+1    
		 * 		����,���� mid
		 * 
		 * ���� -1��������ֵ����ʾ�Ҳ���         
		 */
		int lo=0;
		int hi=a.length-1;
		int mid;
		while(lo<=hi) {
			mid = (lo+hi)/2;
			if(a[mid]>t) {
				hi = mid-1;
			} else if(a[mid]<t) {
				lo = mid+1;
			} else {
				return mid;
			}
		}
		return -1;
		
		
		
	}
}











