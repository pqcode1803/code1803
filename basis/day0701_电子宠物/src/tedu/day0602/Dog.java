package tedu.day0602;

public class Dog extends Pet {
	public Dog(String name,
			   int full,
			   int happy) {
		//super()
		//���಻�����޲ι��죬�����ֶ����вι���
		super(name,full,happy);
	}
	
	//����û��ʵ�ֵķ�����
	//���������ʵ�ֳ���
	@Override
	public String cry() {
		return "��~";
	}
}








