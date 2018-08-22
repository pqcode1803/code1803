package tedu.day1302;

public class Student {
	private int id;
	private String name;
	private String gender;
	private int age;
	
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
	
	@Override
	public int hashCode() {
		/*
		 * 尽量让不同属性，计算出不同的哈希值
		 * 
		 * 数学家发明了一种算法
		 * 是一种惯用的有效算法
		 */
		int p = 31;
		int r =1;
		r = r*p + id;
		r = r*p + name.hashCode();
		r = r*p + gender.hashCode();
		r = r*p + age;
		return r;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==null)return false;
		if(obj==this)return true;
		if(!(obj instanceof Student)) 
			return false;
		
		Student s = (Student) obj;
		return id == s.id &&
			   age == s.age &&
			   name.equals(s.name) &&
			   gender.equals(s.gender);
		
	}
	
}









