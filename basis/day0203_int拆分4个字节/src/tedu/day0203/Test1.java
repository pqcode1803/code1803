package tedu.day0203;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("输入整数：");
		//得到输入的值，保存到变量n
		int n = 
		 new Scanner(System.in).nextInt();
		
		//n右移24,16,8,0位，再强转成byte
		byte b1 = (byte) (n>>24);
		byte b2 = (byte) (n>>16);
		byte b3 = (byte) (n>>8);
		byte b4 = (byte) (n>>0);
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		
		int r = 0;
		
		//左移24,再不带符号右移0,8,16,24
		//再和r求位或

		r = r | (b1<<24>>>0);
		r = r | (b2<<24>>>8);
		r = r | (b3<<24>>>16);
		r = r | (b4<<24>>>24);
		
		System.out.println(r);
		
		System.out.println("-------------");
		
		r = 0;
		//把左侧3个字节变成0，和0x000000ff求与
		//再左移24,16,8,0
		//和r求位或
		
		r = r | ((b1&0x000000ff)<<24);
		r = r | ((b2&0x000000ff)<<16);
		r = r | ((b3&0x000000ff)<<8);
		r = r | ((b4&0x000000ff)<<0);
		
		System.out.println(r);
	}
}



