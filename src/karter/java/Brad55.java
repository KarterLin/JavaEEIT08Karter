package karter.java;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import karter.api.Student;

public class Brad55 {

	public static void main(String[] args) {
		Student s1 = new Student("Karter", 76, 87, 32);
		System.out.println(s1.sum());
		System.out.println(s1.avg());
		System.out.println(s1.getBike().getSpeed());
		
		
		try {
			FileOutputStream fout = new FileOutputStream("dir1/karter.score");
			ObjectOutputStream oout = new ObjectOutputStream(fout);
			oout.writeObject(s1);
			fout.flush();
			fout.close();
			System.out.println("OK");
		} catch (Exception e) {			
			System.out.println(e);
		}

	}

}
