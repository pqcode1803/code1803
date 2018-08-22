package tedu.day2203;

import java.util.Arrays;
import java.util.Comparator;

public class Test2 {
	public static void main(String[] args) {
		Integer[] a = {34,45,3,546,7,34,4,4,7,5,4356,7,5};
		//µπ–Ú≈≈–Ú
		//Arrays.sort(a, new Comparator<Integer>() {
		//	@Override
		//	public int compare(Integer o1, Integer o2) {
		//		return o2-o1;
		//	}
		//});
		
		Arrays.sort(a, (o1,o2)->o2-o1);
		
		System.out.println(Arrays.toString(a));
	}
}





