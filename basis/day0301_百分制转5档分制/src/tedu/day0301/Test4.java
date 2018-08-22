package tedu.day0301;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		System.out.print("����ٷ��Ʒ�����");
		int s = new Scanner(System.in).nextInt();

		// ����f()������
		// �ѷ���s���ݵ�����������м���
		// �ٵõ������صļ�����
		String r = f(s);
		System.out.println(r);
	}

	static String f(int s) {
		if (s < 0 || s > 100) {
			return "��Χ����";
		}

		// ���屣�����ı���
		String r = "";
		// �ж�s
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
