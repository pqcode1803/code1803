package tedu.day0205;
import java.util.Scanner;
public class Test2 {
	public static void main(String[] args) {
		System.out.print("ÊäÈë¼Û¸ñ£º");
		double price = 
		 new Scanner(System.in).nextDouble();
		
		if(price>=8000) {
			price *= 0.7;
		} else if(price>=3000) {
			price *= 0.8;
		} else if(price>=1000) {
			price *= 0.9;
		} else if(price>=500){
			price *= 0.95;
		} 
		
		System.out.println(price);
	}
}





