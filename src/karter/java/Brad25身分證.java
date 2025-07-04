package karter.java;

import karter.api.Bike;
import karter.api.TWID;

public class Brad25身分證 {

	public static void main(String[] args) {
//		System.out.println(Math.random());
		System.out.println(TWID.isRightID("F130632856"));
		System.out.println(Math.PI);
		System.out.println("-----------------");
		TWID id1 = new TWID();
		TWID id2 = new TWID(false);
		TWID id3 = new TWID('B');
		TWID id4 = new TWID(true,'A');
		
		System.out.println(id1.getId());
		System.out.println(id2.getId());
		System.out.println(id3.getId());
		System.out.println(id4.getId());
		
		TWID id5 = TWID.createTWID("A123456789");
		if(id5 != null) {
			System.out.println(id5.getId());
		}else {
			System.out.println("xxxxx");
		}
		
		
		
	}

}
