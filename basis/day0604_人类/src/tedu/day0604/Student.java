package tedu.day0604;

public class Student extends Person {
	String school;
	
	public Student() {
		//super();//Ĭ����������
		System.out.println("Student()");
	}
	public Student(
			String name,
			char gender,
			int age,
			String school) {
		//super();//Ĭ����������
		
		//�ֶ����ø����вι��죬���ø����еĴ���
		super(name,gender,age);
		
		this.school = school;
		System.out.println("Student(1,2,3,4)");
	}
	
	public String toString() {
		//super.toString()
		//���ø����ͬһ������
		String s = super.toString();
		
		return s +" ѧУ��"+school;
	}
}
