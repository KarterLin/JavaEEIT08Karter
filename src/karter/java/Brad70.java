package karter.java;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Brad70 {

	public static void main(String[] args) {
		System.out.println("Start");
		
		new Thread() {
			public void run() {
				try {
					FileOutputStream fout = new FileOutputStream("dir1/test1.txt");
					fout.write("Hello, Seal".getBytes());
					fout.flush();
					fout.close();
					System.out.println("ok");
				} catch (Exception e) {
					System.out.println(e);
				}
			};
		}.start();
		
		for (int i=0; i<10; i++) {
			System.out.println(i);
		}
		
		System.out.println("main finish");
		
	}

}
