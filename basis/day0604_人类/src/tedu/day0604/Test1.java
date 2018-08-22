package tedu.day0604;

public class Test1 {
	public static void main(String[] args) {
		Person p = new Person("张三",'男',20);
		Student s = new Student();
		s.name = "李四";
		s.gender = '女';
		s.age = 22;
		s.school = "牛蹄筋大学";		
		Employee e = new Employee();
		e.name = "王五";
		e.gender = '男';
		e.age = 21;
		e.salary = 8000;		
		System.out.println(p.toString());
		System.out.println(s.toString());
		System.out.println(e.toString());
		
		f(p);
		f(s);//向上转型
		f(e);//向上转型
		
	}
	
	static void f(Person p) {
		//参数p
		//可能是三种类型中的一个
		System.out.println(
		"当做一致的父类型Person进行处理");
		
		//仍然会在真实子类型中查找重写的方法
		System.out.println(p.toString());
	}
}










