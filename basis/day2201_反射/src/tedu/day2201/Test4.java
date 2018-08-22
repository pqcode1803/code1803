package tedu.day2201;

import java.lang.reflect.Method;

public class Test4 {
	public static void main(String[] args) throws Exception {
		/*
		 *  StringBuilderµÄreplace(start,end,×Ó´®)
		 */
		Class<StringBuilder> c = 
		 StringBuilder.class;
		
		StringBuilder sb = 
		 new StringBuilder("abcdefghijklmnopq");
		
		Method m = c.getMethod(
					"replace", 
					int.class, 
					int.class, 
					String.class);
		
		Object r = m.invoke(sb, 4, 14, "***");
		System.out.println(r);
		
		
		
	}
}



