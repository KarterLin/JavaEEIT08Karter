package karter.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Brad52 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		File source = new File("dir1/TheNothingSeal.jpg");
		byte[] buf = new byte[(int)source.length()];
		try (FileInputStream fin = new FileInputStream(source);
				FileOutputStream fout = new FileOutputStream("dir2/TheNothingSeal.jpg")){
			int len;
			while ((len = fin.read(buf)) != -1) {
				fout.write(buf, 0, len);
			}
//			fin.read(buf);
//			fout.write(buf);
//			fout.flush();
			System.out.println("Finished");
			System.out.println(System.currentTimeMillis()- start);
		}catch(Exception e) {
			System.out.println(e);

	}
	}

}
