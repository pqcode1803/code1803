package tedu.day0503;

public class Test2 {
	public static void main(String[] args) {
		char[][] a = {
		 {'μ','��','��','��','��','��','��'},
		 {'��','��','��','��','��','ɫ','��'},
		 {'Ȱ','��','��','��','һ','��','��'},
		 {'��','��','��','��','��','��','��'}
		};
		
		for(int i=0;i<a[0].length;i++) {
			for(int j=a.length-1;j>=0;j--) {
				System.out.print(a[j][i]);
			}
			System.out.println();
		}
		
	}
}
