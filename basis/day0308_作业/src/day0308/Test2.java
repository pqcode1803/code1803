package day0308;

public class Test2 {
	public static void main(String[] args) {
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=i;j++) {
				int r = i*j;
				if(j==3&&(i==3 || i==4)) {
					System.out.print(" ");
				}
				System.out.print(
				 j+"*"+i+"="+r+" ");
				
			}
			System.out.println();
		}
	}
}
