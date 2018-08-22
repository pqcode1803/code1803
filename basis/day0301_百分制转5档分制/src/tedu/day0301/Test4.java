package tedu.day0301;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		System.out.print("输入百分制分数：");
		int s = new Scanner(System.in).nextInt();

		// 调用f()方法，
		// 把分数s传递到这个方法进行计算
		// 再得到它返回的计算结果
		String r = f(s);
		System.out.println(r);
	}

	static String f(int s) {
		if (s < 0 || s > 100) {
			return "范围错误";
		}

		// 定义保存结果的变量
		String r = "";
		// 判断s
		switch (s / 10) {
		case 10:
		case 9:
			r = "A";
			break;
		case 8:
		case 7:
			r = "B";
			break;
		case 6:
			r = "C";
			break;
		case 5:
		case 4:
		case 3:
		case 2:
			r = "D";
			break;
		case 1:
		case 0:
			r = "E";
			break;
		}
		return r;
	}

}
