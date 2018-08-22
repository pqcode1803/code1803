package tedu.day2203;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;

public class Test3 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Collections.addAll(list, 4,45,63,4,45,75,45);
		
		//遍历list，打印每个值
		//list.forEach(new Consumer<Integer>() {
		//	@Override
		//	public void accept(Integer t) {
		//		System.out.println(t);
		//	}
		//});
		list.forEach((t)->System.out.println(t));
		
		list.forEach(System.out::println);
		
		list.forEach(Test3::f);
	}
	
	static void f(Integer n) {
		System.out.println(n*n);
	}
}




