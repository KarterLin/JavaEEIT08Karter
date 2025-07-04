package karter.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Brad50檔案讀中文 {

	public static void main(String[] args) {
		File f1 = new File("dir1/file1.txt");
		byte[] buf = new byte[21];
		try {
			FileInputStream fin = new FileInputStream(f1);
			int len;
			while( (len = fin.read(buf)) != -1 ) {
				System.out.print(new String (buf,0,len));
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
