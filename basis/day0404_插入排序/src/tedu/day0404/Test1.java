package tedu.day0404;

import java.util.Arrays;
import java.util.Random;

public class Test1 {
	public static void main(String[] args) {
		//获得一个随机乱序数组
		int[] a = suiJi();
		System.out.println(Arrays.toString(a));
		System.out.println("=======================");
		sort(a);//排序
		System.out.println("=======================");
		System.out.println(Arrays.toString(a));
	}

	
	
	
	
	
	
	
	private static int[] suiJi() {
		/*
		 * *)产生5+[0,6)范围的随机整数
		 *   保存变量len
		 * *)新建len长度的int[]数组存到变量a
		 * *)遍历数组a，填入100内随机值
		 * *)返回数组a的内存地址
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
		 * 插入排序
		 * *)第一个值是有序数字序列
		 * *)从第二个值开始处理
		 * *)向前插入到有序数字序列中
		 * 
		 *       j    
		 * [23, 32, 35, 39, 41, 42, 85, 28]
		 *                          i
		 */
		for(int i=1;i<a.length;i++) {
			//把i位置的值，向前移动，插到它该在的位置
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










