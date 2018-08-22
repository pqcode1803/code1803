package tedu.day0602;

public class Cat extends Pet {
	public Cat(String name,
			   int full,
			   int happy) {
		//super()
		//父类不存在无参构造，必须手动调有参构造
		super(name,full,happy);
	}
	
	@Override
	public String cry() {
		return "喵~";
	}
}








