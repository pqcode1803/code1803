package tedu.day0604;

public class Test1 {
	public static void main(String[] args) {
		Person p = new Person("����",'��',20);
		Student s = new Student();
		s.name = "����";
		s.gender = 'Ů';
		s.age = 22;
		s.school = "ţ����ѧ";		
		Employee e = new Employee();
		e.name = "����";
		e.gender = '��';
		e.age = 21;
		e.salary = 8000;		
		System.out.println(p.toString());
		System.out.println(s.toString());
		System.out.println(e.toString());
		
		f(p);
		f(s);//����ת��
		f(e);//����ת��
		
	}
	
	static void f(Person p) {
		//����p
		//���������������е�һ��
		System.out.println(
		"����һ�µĸ�����Person���д���");
		
		//��Ȼ������ʵ�������в�����д�ķ���
		System.out.println(p.toString());
	}
}










