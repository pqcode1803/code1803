package day1503;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("输入目录：");
		String path = new Scanner(System.in).nextLine();
		
		//如果不是目录，提示并结束
		File dir = new File(path);
		if(! dir.isDirectory()) {
			System.out.println("输入的不是目录");
			return;
		}
		
		//key用来求异或
		System.out.print("Key：");
		int key = new Scanner(System.in).nextInt();
		
		
		try {
			encriptAll(dir, key);
			System.out.println("完成");
		} catch (Exception e) {
			System.out.println("失败");
		}
	}

	private static void encriptAll(
			File dir, int key) throws Exception {
		File[] files = dir.listFiles();
		if(files == null) {
			return;
		}
		for (File f : files) {
			if(f.isFile()) {
				if(isPic(f)) {
					encript(f, key);
				}
			} else {
				encriptAll(f, key);
			}
		}
	}
	
	
	private static boolean isPic(File f) {
		//jpg png gif
		return f.getName()
				.toLowerCase()
				.matches(".+\\.(jpg|png|gif)");
	}

	private static void encript(
			File file,
			int key) throws Exception {
		
		RandomAccessFile raf = 
		 new RandomAccessFile(file, "rw");
		
		byte[] buff = new byte[8192];
		int n;//每一批的数量
		while((n = raf.read(buff)) != -1) {
			//对数组中前n个字节加密、解密
			for (int i = 0; i < n; i++) {
				buff[i] ^= key;
			}
			//下标向前移动n位
			raf.seek(raf.getFilePointer()-n);   
			//数组前n个，一批写回文件
			raf.write(buff, 0, n);
		}
		
		raf.close();
	}
	
	
}






