package tedu.day0102;
//导包，指明路径
import java.util.Scanner;

public class ItemInput {
	public static void main(String[] args) {
		System.out.print("商品名：");
		//获得输入的值，保存到变量name
		String name=
		 new Scanner(System.in).nextLine(); 		
		System.out.print("价格：");
		double price=
		 new Scanner(System.in).nextDouble(); 		
		System.out.print("数量：");
		int n=
		 new Scanner(System.in).nextInt(); 
		System.out.println("您输入的商品信息：");
		System.out.println(
		 name+", "+price+", "+n);
		
		
	}
}
