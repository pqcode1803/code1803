package tedu.day0305;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("����5Ԫ1ֻ");
		System.out.println("ĸ��3Ԫ1ֻ");
		System.out.println("С��1Ԫ3ֻ");
		System.out.println("��Ԫ��ټ�");
		
		/*���ѭ����������g��0��20����
		 *    ��gֻ��������໹�������ĸ��max
		 *    
		 *    �ڲ�ѭ��ĸ������m��0��max
		 *        ����С�������浽����x
		 *        �������g+m+x==100
		 *            ���������
		 */
		for(int g=0;g<=20;g++) {
			
			int money=100-5*g;
			int max=money/3;
			
			for(int m=0;m<=max;m++) {
				int x=(money-3*m)*3;
				if(g+m+x==100) {
				  System.out.println(
				  "����:"+g+", ĸ��:"+m+",С��:"+x);
				}
			}
		}
		
	}
}






