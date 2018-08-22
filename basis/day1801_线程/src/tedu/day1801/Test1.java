package tedu.day1801;

public class Test1 {
	public static void main(String[] args) throws Exception {
		
		long t;
		
		t = System.currentTimeMillis();
		
		T1 a = new T1(2,2000000); 
		T1 b = new T1(2000000,4000000); 
		T1 c = new T1(4000000,6000000); 
		T1 d = new T1(6000000,8000000); 
		T1 e = new T1(8000000,10000000); 
		
		a.start();
		b.start();
		c.start();
		d.start();
		e.start();
		
		a.join();
		b.join();
		c.join();
		d.join();
		e.join();
		
		int n = a.n+b.n+c.n+d.n+e.n;
		System.out.println(n);
		
		t = System.currentTimeMillis()-t;
		System.out.println(t);
		
		System.out.println("-----------------------");
		
		t = System.currentTimeMillis();
		T1 f = new T1(2,10000000);
		f.start();
		f.join();
		System.out.println(f.n);
		t = System.currentTimeMillis()-t;
		System.out.println(t);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	static boolean isPrime(int n) {
		if(n==2) return true;
		
		double max = Math.sqrt(n)+1;
		
		for(int i=2;i<max;i++) {
			if(n%i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	static class T1 extends Thread {
		int start;
		int end;
		int n;
		public T1(int start, int end) {
			super();
			if(start<2) start = 2;
			
			this.start = start;
			this.end = end;
		}
		
		@Override
		public void run() {
			for(int i=start; i<end; i++) {  
				if(isPrime(i)) n++;
			}
		}
		
	}
	
}





