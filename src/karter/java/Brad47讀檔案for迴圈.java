package karter.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Brad47讀檔案for迴圈 {

	public static void main(String[] args) {
		File f1 = new File("dir1/file1.txt");
		long len = f1.length();
		try {
			FileInputStream fin = new FileInputStream(f1);
			
			for (int i = 0;i<len;i++) {
				System.out.println((char)fin.read());
			}

			fin.close();
			System.out.println();
			System.out.println("ok");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
