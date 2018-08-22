package tedu.day0403;

import java.util.Arrays;
import java.util.Random;

public class Test1 {
	public static void main(String[] args) {
		//从init()方法中获得一个数组
		int[] r = init(33);
		int[] b = init(16);
		System.out.println(Arrays.toString(r));
		System.out.println(Arrays.toString(b));  
		
		//选择6个红球号码
		int[] red = xuanRed(r);
		//选择1个蓝球号码
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
		//33个位置都是默认值false
		boolean[] flag = new boolean[33];
		
		//遍历red数组6个位置，放入选择的号码
		for(int i=0;i<6;i++) {
			//定义随机位置变量j
			int j;
			//先选一个位置，再判断是否选过
			//选过，重新再选
			do {
				j = new Random().nextInt(33);
			} while(flag[j]);
			
			red[i] = r[j];
			flag[j] = true;//标记j位置已经选过
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
		return a;//返回的是数组的内存地址
	}
}











