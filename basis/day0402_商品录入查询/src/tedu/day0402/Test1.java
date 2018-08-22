package tedu.day0402;

import java.util.Scanner;

public class Test1 {
	
	static String[] names = 
		{"华为P20","华为P20 Pro","华为Mate RS","华为Mate 10","华为Matebook X"};
	static double[] prices = 
		{4999, 6999, 16699, 3199, 6799};
	static int[] numbers = 
		{100, 210, 60, 120, 20};
	
	public static void main(String[] args) {
		outer:
			while(true) {
				//显示菜单并获得输入的指令
				int c = menu();
				switch(c) {
				case 1: f1(); break;
				case 2: f2(); break;
				case 3: f3(); break;
				case 4: f4(); break;
				case 5: 
					System.out.println("Bye-bye!");
					break outer;
				}
			}
	}

	static int menu() {
		System.out.println("-----------------");
		System.out.println("1. 商品列表");
		System.out.println("2. 商品录入");
		System.out.println("3. 商品查询");
		System.out.println("4. 统计信息");
		System.out.println("5. 退出");
		System.out.println("-----------------");
		System.out.print("指令> ");
		return new Scanner(System.in).nextInt();
	}
	
	
	
	static void f1() {
		//遍历
		for(int i=0;i<names.length;i++) {
			String n = names[i];
			double p = prices[i];
			int u = numbers[i];
			
			System.out.println(
			 "名称："+n
			 +" 单价："+p
			 +" 数量："+u
			 +" 总价："+(p*u));
		}
	}
	
	
	
	
	static void f2() {
		//遍历
		for(int i=0;i<names.length;i++) {
			System.out.print("名称：");
			String n = new Scanner(System.in).nextLine();
			System.out.print("价格：");
			double p = new Scanner(System.in).nextDouble();
			System.out.print("数量：");
			int u = new Scanner(System.in).nextInt();
			
			names[i] = n;
			prices[i] = p;
			numbers[i] = u;
		}
		f1();
		
	}
	
	
	
	
	
	
	
	static void f3() {
		System.out.print("输入查询的商品名：");
		String n = new Scanner(System.in).nextLine();
		
		//遍历比较商品名称
		for(int i=0;i<names.length;i++) {
			//字符串比较是否相等，
			//要用equals()方法
			if(n.equals(names[i])) {
				String name = names[i];
				double p = prices[i];
				int u = numbers[i];				
				System.out.println(
				 "名称："+name+" 单价："+p+" 数量："+u+" 总价："+(p*u));
				return;
			}
		}
		
		System.out.println("找不到此商品");
		
		
	}
	
	
	static void f4() {
		//货物总价，最高单价，最高总价，单价均价
		double hwzj = 0;//货物总价
		double zgdj = 0;//最高单价
		double zgzj = 0;//最高总价
		double djzj = 0;//单价总价
		
		for(int i=0;i<names.length;i++) {
			hwzj += prices[i]*numbers[i];
			djzj += prices[i];
			if(prices[i]>zgdj) {
				zgdj = prices[i];
			}
			if(prices[i]*numbers[i]>zgzj) {
				zgzj = prices[i]*numbers[i];
			}
		}
		
		System.out.println("货物总价: "+hwzj);
		System.out.println("最高单价: "+zgdj);
		System.out.println("最高总价: "+zgzj);
		System.out.println("单价均价: "+(djzj/names.length));
	}
	

	
	
	
	
	
	
	
	

}
