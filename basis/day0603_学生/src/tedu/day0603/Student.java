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
		//���صĹ��췽��֮�����
		this(id,name,gender,0);
	}
	public Student(int id,String name,char gender,int age) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	public String toString() {
		return "id��"+id
				+" ������"+name
				+" �Ա�"+gender
				+" ���䣺"+age;
	}
}



