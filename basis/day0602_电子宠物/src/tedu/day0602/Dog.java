package tedu.day0602;

import java.util.Random;

public class Dog {
	String name;//����
	int full;//��ʳ��
	int happy;//���ֶ�
	
	//ȫ�ι���
	//���ղ������ݣ�
	//�ٰ��յ������ݱ��浽��Ա����
	public Dog(String name,
			   int full,
			   int happy) {
		this.name = name;
		this.full = full;
		this.happy = happy;
	}
	
	// ιʳ
	public void feed() {
		if(full == 100) {
			System.out.println(
			 name+"�Ѿ��Բ�����");
			return;
		}
		System.out.println("��"+name+"ιʳ");
		int d = new Random().nextInt(10);
		if(full+d > 100) {
			full = 100;
		} else {
			full += d;
		}
		System.out.println(name+"�ı�ʳ�ȣ�"+full);
	}
	// ��ˣ
	public void play() {
		if(full == 0) {
			System.out.println(
			 name+"�Ѿ������治����");
			return;
		}
		System.out.println("��"+name+"��ˣ");
		//���ӿ��ֶ�
		int d1 = new Random().nextInt(10);
		//���ͱ�ʳ��
		int d2 = new Random().nextInt(10);
		
		happy += d1;
		
		if(full-d2 < 0) {
			full = 0;
		} else {
			full -= d2;
		}
		System.out.println(name+"�Ŀ��ֶȣ�"+happy);
		System.out.println(name+"�ı�ʳ�ȣ�"+full);
	}
	// �ͷ�
	public void punish() {
		System.out.println(
		 "��"+name+"��PP��"+name+"�޽У���~");
		
		int d = new Random().nextInt(10);
		happy -= d;
		
		System.out.println(name+"�Ŀ��ֶȣ�"+happy);
	}
}








