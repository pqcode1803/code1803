package tedu.day0401;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		//新建int[]数组，它的内存地址保存到变量a
		int[] a = new int[10];
		//Arrays.toString(a)
		//把数组中的数据连接成字符串
		System.out.println(Arrays.toString(a));
		
		//遍历数组，填入100内随机整数
		for(int i=0; i<a.length; i++) {
			a[i] = new Random().nextInt(100);
			System.out.println(Arrays.toString(a));
		}
		
		
		//求平均值
		double sum=0;
		for(int i=0;i<a.length;i++) {
			sum += a[i]; 
		}
		System.out.println(
		"平均值： "+(sum / a.length));
		
		
		//交换下标3, 4位置的值
		int c = a[3];
		a[3] = a[4];
		a[4] = c;
		System.out.println(Arrays.toString(a));
		
		
		//从start位置开始向后找最小值
		//获取最小值的位置下标
		/*
		 *              min
		 *              |
		 * [7,85,95,54,24,28,19,3,63,66]
		 *              |     i
		 *              start
		 *              
		 * 1.假设start位置就是最小值 min=start
		 * 2.从start+1开始，
		 *   向后到末尾寻找比min位置值更小的值
		 * 3.找到更小值，修改min到更小值位置
		 */
		System.out.print("从哪开始找最小值：");
		int start = new Scanner(System.in).nextInt();
		int min = start;
		for(int i=start+1;i<a.length;i++) {
			if(a[i]<a[min]) {
				min = i;
			}
		}
		System.out.println(
		 start+"向后"+min+"位置最小值："+a[min]);
	}
}




