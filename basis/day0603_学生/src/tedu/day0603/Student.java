package tedu.day0603;

public class Student {
	int id;
	String name;
	char gender;
	int age;

	public Student() {
	}
	public Student(int id,String name) {
		this(id,name,'\u0000');
	}
	public Student(int id,String name,char gender) {
		//重载的构造方法之间调用
		this(id,name,gender,0);
	}
	public Student(int id,String name,char gender,int age) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	public String toString() {
		return "id："+id
				+" 姓名："+name
				+" 性别："+gender
				+" 年龄："+age;
	}
}



