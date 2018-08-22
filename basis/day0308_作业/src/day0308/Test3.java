package day0308;

public class Test3 {
	public static void main(String[] args) {
		double sum=0;
		
		for(int a=1,b=1,i=1; 
		    i<1000000; 
		    a*=-1,b+=2,i++) {
			
			sum += a/(double)b;
			
		} 
		
		double pi = sum*4;
		System.out.println(pi);		
	}
}
