package tedu.day0205;
import java.util.Scanner;
public class Test1 {
	public static void main(String[] args) {
		System.out.print("����۸�");
		double price = 
		 new Scanner(System.in).nextDouble();
		
		if(price>=500) {
			price *= 0.95; //price = price*0.95;
		}
		
		System.out.println(price);
	}
}
