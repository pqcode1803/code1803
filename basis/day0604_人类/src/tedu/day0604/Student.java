package tedu.day0604;

public class Student extends Person {
	String school;
	
	public Student() {
		//super();//默认隐含调用
		System.out.println("Student()");
	}
	public Student(
			String name,
			char gender,
			int age,
			String school) {
		//super();//默认隐含调用
		
		//手动调用父类有参构造，重用父类中的代码
		super(name,gender,age);
		
		this.school = school;
		System.out.println("Student(1,2,3,4)");
	}
	
	public String toString() {
		//super.toString()
		//调用父类的同一个方法
		String s = super.toString();
		
		return s +" 学校："+school;
	}
}
