package tedu.day0601;
/*
 * ��װ��
 * ������ص��������ݡ��������룬
 * ��װ��һ�����ࡱ���
 */
public class Car {
	String brand;//Ʒ��
	int speed;//�ٶ�
	String color;//��ɫ
	
	public Car() {
		System.out.println("Car()");
	}
	public Car(String brand,
			   int speed,
			   String color) {
		System.out.println("Car(1,2,3)");
		//�ֲ��������Ա����ͬ��ʱ��
		//������ this.xxxx ���ʳ�Ա����	
		this.brand = brand;
		this.speed = speed;
		this.color = color;
	}

	public void go() {
		System.out.println(
		 color+"��"+brand+"ǰ��");
	}
	public void stop() {
		System.out.println(
		 color+"��"+brand+"ֹͣ");
	}
	public String toString() {
		return "Ʒ�ƣ�"+brand
				+"��ɫ��"+color
				+"�ٶȣ�"+speed;
	}
}





