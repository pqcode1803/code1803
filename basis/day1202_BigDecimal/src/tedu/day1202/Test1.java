package tedu.day1202;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("输入两个浮点数：");
		double a = new Scanner(System.in).nextDouble();
		double b = new Scanner(System.in).nextDouble();
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println("----------------------");
		
		BigDecimal bd1 = BigDecimal.valueOf(a);
		BigDecimal bd2 = BigDecimal.valueOf(b);
		BigDecimal bd3;
		
		bd3=bd1.add(bd2);
		System.out.println(bd3.doubleValue());
		bd3=bd1.subtract(bd2);
		System.out.println(bd3.doubleValue());
		bd3=bd1.multiply(bd2);
		System.out.println(bd3.doubleValue());
		//bd3=bd1.divide(bd2);//不允许无限小数
		bd3=bd1.divide(
		 bd2, 30, BigDecimal.ROUND_HALF_UP);
		
		System.out.println(bd3.toString());
		
		bd3 = bd3.setScale(3, BigDecimal.ROUND_HALF_UP);
		System.out.println(bd3.doubleValue());
		
		DecimalFormat f = 
		 new DecimalFormat("\u00a4###,###.0000");
		String s = f.format(bd3.doubleValue());
		System.out.println(s);
		
		
	}
}









