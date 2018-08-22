package tedu.day0305;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("公鸡5元1只");
		System.out.println("母鸡3元1只");
		System.out.println("小鸡1元3只");
		System.out.println("百元买百鸡");
		
		/*外层循环公鸡数量g从0到20递增
		 *    买g只公鸡后最多还能买多少母鸡max
		 *    
		 *    内层循环母鸡数量m从0到max
		 *        计算小鸡数量存到变量x
		 *        数量相加g+m+x==100
		 *            输出这个组合
		 */
		for(int g=0;g<=20;g++) {
			
			int money=100-5*g;
			int max=money/3;
			
			for(int m=0;m<=max;m++) {
				int x=(money-3*m)*3;
				if(g+m+x==100) {
				  System.out.println(
				  "公鸡:"+g+", 母鸡:"+m+",小鸡:"+x);
				}
			}
		}
		
	}
}






