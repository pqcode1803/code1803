package tedu.day2202;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 * ��Է�����ע�⣬
 * Runnerִ�й��ߣ�
 * �Զ�����һ������������� @Test ע�⵱������
 * �Զ�ִ����Щ����
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Test {
	int id() default 0;
	String value() default "";
}






