package karter.java;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import karter.api.Student;

public class Brad56物件序列化 {
//物件序列化
	public static void main(String[] args) {
		try(FileInputStream fin = new FileInputStream("dir1/karter.score");
			ObjectInputStream oin = new ObjectInputStream(fin)){
			Object obj = oin.readObject();
//			if(obj instanceof Student) {System.out.println("student");}
			Student s1 = (Student)obj;  //轉型回來
			System.out.println(s1.sum());
			System.out.println(s1.avg());
			System.out.println(s1.getBike().getSpeed());
			
			System.out.println("ok");
			
			
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
