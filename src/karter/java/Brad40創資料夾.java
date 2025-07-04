package karter.java;

import java.io.File;

public class Brad40創資料夾 {

	public static void main(String[] args) {
		File f1 = new File("d:/karter/dir2");
		if (f1.exists()) {
			System.out.println("ok");
		}else {
			System.out.println("xx");
			f1.mkdir();
		}

	}

}
