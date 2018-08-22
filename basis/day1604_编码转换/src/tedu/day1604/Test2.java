package tedu.day1604;

import java.io.UnsupportedEncodingException;

public class Test2 {
	public static void main(String[] args) throws Exception {
		//其他编码的一组字节值，转成Unicode
		f(new byte[] {97, 98, 99, -42, -48, -50, -60, -122, -76, -23, 70}, null);
		f(new byte[] {97, 98, 99, -42, -48, -50, -60, -122, -76, -23, 70}, "GBK");
		f(new byte[] {97, 98, 99, -42, -48, -50, -60, 63, 63}, "GB2312");
		f(new byte[] {97, 98, 99, -28, -72, -83, -26, -106, -121, -27, -106, -122, -23, -107, -107}, "UTF-8");
		f(new byte[] {0, 97, 0, 98, 0, 99, 78, 45, 101, -121, 85, -122, -107, 85}, "UTF-16Be");
		f(new byte[] {97, 0, 98, 0, 99, 0, 45, 78, -121, 101, -122, 85, 85, -107}, "UTF-16Le");
		f(new byte[] {97, 98, 99, 63, 63, 63, 63}, "iso-8859-1");
	}

	private static void f(
			byte[] a, String charset) throws Exception {
		String s;
		if(charset == null) {
			s = new String(a);//从默认编码转成Unicode
		} else {
			//从指定编码转成Unicode
			s = new String(a, charset);
		}
		System.out.println(charset+":\t"+s);
	}
}






