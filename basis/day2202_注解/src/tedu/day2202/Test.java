package tedu.day2202;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 * 针对方法的注解，
 * Runner执行工具，
 * 自动发现一个类中所有添加 @Test 注解当方法，
 * 自动执行这些方法
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Test {
	int id() default 0;
	String value() default "";
}






