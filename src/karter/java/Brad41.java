package karter.java;

import java.io.File;
import java.io.IOException;

public class Brad41 {

	public static void main(String[] args) {
		File f1 = new File("d:/karter/dir1/file1");
		if (!f1.exists()) {
			try {
				if(f1.createNewFile()) {
					
				}else {
					System.out.println("XX");
				}
				System.out.println("ok2");
			}catch (IOException e) {
				System.out.println(e);
			}
		}
	}

}
