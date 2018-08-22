package tedu.day0105;
import java.math.BigDecimal;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("输入降落时间（秒）：");  
		//获得输入的值，保存到变量t
		double t=
		 new Scanner(System.in).nextDouble();
		
		//套公式，求出降落距离保存到变量d
		//double d=0.5*9.8*t*t;
		
		BigDecimal bd1 = BigDecimal.valueOf(4.9);
		BigDecimal bd2 = BigDecimal.valueOf(t);
		double d = 
		 bd1.multiply(bd2.pow(2))
		    .doubleValue();
		
		System.out.println(
		 "经过 "+t+" 秒，降落了 "+d+" 米");
	}
}





