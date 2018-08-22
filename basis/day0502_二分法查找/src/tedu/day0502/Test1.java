package tedu.day0502;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		int[] a = suiJi();
		Arrays.sort(a);//优化的快速排序算法
		System.out.println(Arrays.toString(a));
		System.out.print("查找的目标值：");
		int t = new Scanner(System.in).nextInt();
		
		//二分法查找
		int index = binarySearch(a, t);
		if(index>=0) {
			System.out.println(t+"在"+index+"位置"); 
		} else {
			System.out.println("找不到目标值 "+t);
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
		 * 在有序数组a中寻找目标值t
		 * 
		 * 84
		 *              mid
		 * [12,35,53,56,69,77,80,83,85,91]
		 *  lo
		 *                             hi
		 * 
		 * 定义下标
		 * lo=0
		 * hi=a.length-1
		 * mid
		 * 
		 * 当lo<=hi
		 * 		求中间位置保存到mid
		 * 		mid位置大于目标值t,hi定位到 mid-1
		 * 		mid位置小于于目标值t,lo定位到 mid+1    
		 * 		否则,返回 mid
		 * 
		 * 返回 -1，无意义值，表示找不到         
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











