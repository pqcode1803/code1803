package tedu.day1205;

public class Student {
	private int id;
	private String name;
	private int age;
	
	public Student() {
		super();
	}
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("手动清理一些资源");
		System.out.println("不能完全依赖于此方法来清理资源"); 
	}
	
}





