package tedu.day0604;

public class Test2 {
	public static void main(String[] args) {
		new Student();//先执行Person()
		System.out.println("-------------");
		new Student("A",'A',1,"A");//先执行Person(1,2,3)
	}
}
