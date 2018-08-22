package tedu.day0201;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("两星相距16.4光年");
		System.out.println("光速 299792458 米/秒");
		System.out.println("喜鹊身长 0.46 米");
		System.out.println("牛郎织女相聚，需要多少只喜鹊");
		
		//光年
		long ly = 299792458L*60*60*24*365;
		double d = 16.4*ly;//16.4光年换算成米
		double r = d/0.46;//喜鹊数量
		//向上取整
		//Math.ceil(r)
		//取整结果，以double类型返回 xxxxx.0
		//把它强转成long类型
		long n = (long) Math.ceil(r);
		
		System.out.println(n);
		
	}
}









