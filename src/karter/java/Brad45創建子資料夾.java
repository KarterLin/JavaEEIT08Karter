package karter.java;

import java.io.File;

public class Brad45創建子資料夾 {

	public static void main(String[] args) {
		File root = new File(".");
		System.out.println(root.getAbsolutePath());
		File dir1 = new File("dir4/dir5/dir6/dir7");
		System.out.println(dir1.exists());
		System.out.println(dir1.mkdirs());
	}

}
