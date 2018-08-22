package tedu.day1703;

import java.io.Serializable;
/*
 * Serializable接口
 * 空接口，标识接口
 * 用来标识一个类，允许被序列化
 */
public class Student implements Serializable {
	/**
	 * 不定义id，编译器编译代码时，
	 * 会自动生成id值
	 * 根据类的定义信息，计算生成一个id值
	 * 
	 * 自定义id，可以指定任意版本号
	 */
	private static final long serialVersionUID = 2018L;      
	private int id;
	private String name;
	private static String gender;
	private transient int age;
	
	public Student() {
		super();
	}

	public Student(int id, String name, String gender, int age) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	
	
	
}
