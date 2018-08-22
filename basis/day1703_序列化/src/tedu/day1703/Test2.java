package tedu.day1703;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test2 {
	public static void main(String[] args) throws Exception {
		/*
		 *      文件流    反序列化 
		 * f9--->FIS--->OIS
		 */
		ObjectInputStream in = 
		 new ObjectInputStream(
		 new FileInputStream("d:/abc/f9"));
		
		Student s = (Student) in.readObject();
		System.out.println(s);
		
		in.close();
		
	}
}





