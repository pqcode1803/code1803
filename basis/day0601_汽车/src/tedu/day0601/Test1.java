package tedu.day0601;

public class Test1 {
	public static void main(String[] args) {
		//�½�Car���󣬰������ڴ��ַ���浽����c1
		//����c1������������Ϊ����������ֵ
		Car c1 = new Car();
		c1.brand = "������";
		c1.color = "��ɫ";
		c1.speed = 240;
		
		//��c1����ȥִ��go()��stop()����
		c1.go();
		c1.stop();
		
		System.out.println(c1.toString());
		
		Car c2 = new Car("��+��",30,"��ɫ");
		c2.go();
		c2.stop();		
		System.out.println(c2.toString());
		
	}
}




