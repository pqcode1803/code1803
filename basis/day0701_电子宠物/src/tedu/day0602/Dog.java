package tedu.day0602;

public class Dog extends Pet {
	public Dog(String name,
			   int full,
			   int happy) {
		//super()
		//父类不存在无参构造，必须手动调有参构造
		super(name,full,happy);
	}
	
	//父类没有实现的方法，
	//在这里必须实现出来
	@Override
	public String cry() {
		return "旺~";
	}
}








