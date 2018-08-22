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
		//随机长度len, [5,11)
		//新建len长度的int[]数组，
		//遍历填入100内随机整数
		//返回这个数组
		int len = 5+new Random().nextInt(6);
		int[] a = new int[len];
		for(int i=0;i<a.length;i++) {
			a[i] = new Random().nextInt(100);
		}
		return a;
	}

	private static void sort(int[] a) {
		/*
		 * 冒泡排序
		 * 
		 *                     j
		 * [1, 60, 14, 88, 14, 43, 84]
		 *      i
		 * 
		 * *)i循环遍历数组
		 *     *)j循环从a.lenth-1
		 *         *)如果j-1位置值>j位置值
		 *             *)交换j-1,和j位置
		 *             
		 *             
		 *                     
		 * [1, 14, 14, 43, 60, 84, 88]
		 *                  i
		 *              
		 * j循环开始前: 
		 * boolean flag = false 没有交换数据
		 * 
		 * 有交换：
		 * flag = true 交换了数据,数据还是乱的
		 * 
		 *          if(falg是false) {
		 *          	break;
		 *          }
		 */
		for(int i=0;i<a.length;i++) {
			
			boolean flag = false;//没有交换
			//把最小值推到i位置
			//过程中，较小值也会向前移动几步
			for(int j=a.length-1;j>i;j--) {
				if(a[j-1]>a[j]) {
					int c = a[j];
					a[j] = a[j-1];
					a[j-1] = c;
					flag = true;
				}
			}
			//j循环过程中，没有交换
			//数据位置都是正确的，排序结束
			if(!flag) {
				break;
			}
			
			System.out.println(Arrays.toString(a)); 
		}
		
		
	}
}















