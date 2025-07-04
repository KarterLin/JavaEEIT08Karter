package karter.java;

import karter.api.Bike;

public class Brad23String比較 {

	public static void main(String[] args) {
		String s1 = "Seal";
		String s2 = "Seal";
		String s3 = new String("Seal");
		String s4 = new String("Seal");
		
		int a = 10, b = 3;
		int c = 10, d = 10;
		System.out.println(a == b);
		System.out.println(c == d);
		System.out.println(s1 == s2);
		System.out.println(s3 == s4);
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3)); //是比裡面的String內容
	}

}
