package tedu.day0602;

public class Cat extends Pet {
	public Cat(String name,
			   int full,
			   int happy) {
		//super()
		//���಻�����޲ι��죬�����ֶ����вι���
		super(name,full,happy);
	}
	
	@Override
	public String cry() {
		return "��~";
	}
}








