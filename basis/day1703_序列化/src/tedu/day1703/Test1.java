package tedu.day1703;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test1 {
	public static void main(String[] args) throws Exception {
		Student s = new Student(5,"张三","男",21);
		
		/*      文件流    序列化
		 * f9<---FOS<---OOS
		 */
		ObjectOutputStream out =
		 new ObjectOutputStream(
		 new FileOutputStream("d:/abc/f9"));
		
		out.writeObject(s);
		out.close();
	}
}





