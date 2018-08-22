package tedu.day0402;

import java.util.Scanner;

public class Test1 {
	
	static String[] names = 
		{"��ΪP20","��ΪP20 Pro","��ΪMate RS","��ΪMate 10","��ΪMatebook X"};
	static double[] prices = 
		{4999, 6999, 16699, 3199, 6799};
	static int[] numbers = 
		{100, 210, 60, 120, 20};
	
	public static void main(String[] args) {
		outer:
			while(true) {
				//��ʾ�˵�����������ָ��
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
		System.out.println("1. ��Ʒ�б�");
		System.out.println("2. ��Ʒ¼��");
		System.out.println("3. ��Ʒ��ѯ");
		System.out.println("4. ͳ����Ϣ");
		System.out.println("5. �˳�");
		System.out.println("-----------------");
		System.out.print("ָ��> ");
		return new Scanner(System.in).nextInt();
	}
	
	
	
	static void f1() {
		//����
		for(int i=0;i<names.length;i++) {
			String n = names[i];
			double p = prices[i];
			int u = numbers[i];
			
			System.out.println(
			 "���ƣ�"+n
			 +" ���ۣ�"+p
			 +" ������"+u
			 +" �ܼۣ�"+(p*u));
		}
	}
	
	
	
	
	static void f2() {
		//����
		for(int i=0;i<names.length;i++) {
			System.out.print("���ƣ�");
			String n = new Scanner(System.in).nextLine();
			System.out.print("�۸�");
			double p = new Scanner(System.in).nextDouble();
			System.out.print("������");
			int u = new Scanner(System.in).nextInt();
			
			names[i] = n;
			prices[i] = p;
			numbers[i] = u;
		}
		f1();
		
	}
	
	
	
	
	
	
	
	static void f3() {
		System.out.print("�����ѯ����Ʒ����");
		String n = new Scanner(System.in).nextLine();
		
		//�����Ƚ���Ʒ����
		for(int i=0;i<names.length;i++) {
			//�ַ����Ƚ��Ƿ���ȣ�
			//Ҫ��equals()����
			if(n.equals(names[i])) {
				String name = names[i];
				double p = prices[i];
				int u = numbers[i];				
				System.out.println(
				 "���ƣ�"+name+" ���ۣ�"+p+" ������"+u+" �ܼۣ�"+(p*u));
				return;
			}
		}
		
		System.out.println("�Ҳ�������Ʒ");
		
		
	}
	
	
	static void f4() {
		//�����ܼۣ���ߵ��ۣ�����ܼۣ����۾���
		double hwzj = 0;//�����ܼ�
		double zgdj = 0;//��ߵ���
		double zgzj = 0;//����ܼ�
		double djzj = 0;//�����ܼ�
		
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
		
		System.out.println("�����ܼ�: "+hwzj);
		System.out.println("��ߵ���: "+zgdj);
		System.out.println("����ܼ�: "+zgzj);
		System.out.println("���۾���: "+(djzj/names.length));
	}
	

	
	
	
	
	
	
	
	

}
