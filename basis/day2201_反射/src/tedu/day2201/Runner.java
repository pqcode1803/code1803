package tedu.day2201;

import java.lang.reflect.Method;
import java.util.List;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class Runner {
	private static List<Element> list;
	//��̬��ʼ�����м��������ļ�
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
			System.out.println("���������ļ�ʧ��");
		}
	}
	
	
	public static void main(String[] args) {
		String parm = "��ʼ����";
		
		for (Element e : list) {
			String className = e.attributeValue("name");
			String methodName = e.attributeValue("method");
			parm = run(className, methodName, parm);
			System.out.println(
			 className+"."+methodName+"�������� "+parm);
		}
	}


	private static String run(
			String className, 
			String methodName, 
			String parm) {
		try {
			//��á������
			Class<?> c = Class.forName(className);
			//�½�ʵ��
			Object obj = c.newInstance();
			//��÷���
			Method m = 
			 c.getMethod(methodName, Object.class);
			//ִ�з���
			Object r = m.invoke(obj, parm);
			return (String) r;
		} catch (Exception e) {
			System.out.println(
			 className+"."+methodName+" ִ��ʧ��");   
			return null;
		}
	}
	
}







