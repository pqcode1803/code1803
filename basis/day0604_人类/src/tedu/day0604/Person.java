package tedu.day0604;

public class Person {
	String name;
	char gender;
	int age;
	public Person() {
		System.out.println("Person()");
	}
	public Person(String name,char gender,int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		System.out.println("Person(1,2,3)");
	}
	public String toString() {
		return "姓名："+name
				+" 性别："+gender
				+" 年龄："+age;
	}
}


