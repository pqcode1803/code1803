package tedu.day2201;

import java.lang.reflect.Method;
import java.util.List;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class Runner {
	private static List<Element> list;
	//静态初始化块中加载配置文件
	static {
		try {
			String path = 
			 Runner.class
			 .getResource("/cfg.xml")
			 .getPath();
			
			list = new SAXReader().read(path)
					.getRootElement()
					.elements();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("加载配置文件失败");
		}
	}
	
	
	public static void main(String[] args) {
		String parm = "初始参数";
		
		for (Element e : list) {
			String className = e.attributeValue("name");
			String methodName = e.attributeValue("method");
			parm = run(className, methodName, parm);
			System.out.println(
			 className+"."+methodName+"计算结果： "+parm);
		}
	}


	private static String run(
			String className, 
			String methodName, 
			String parm) {
		try {
			//获得“类对象”
			Class<?> c = Class.forName(className);
			//新建实例
			Object obj = c.newInstance();
			//获得方法
			Method m = 
			 c.getMethod(methodName, Object.class);
			//执行方法
			Object r = m.invoke(obj, parm);
			return (String) r;
		} catch (Exception e) {
			System.out.println(
			 className+"."+methodName+" 执行失败");   
			return null;
		}
	}
	
}







