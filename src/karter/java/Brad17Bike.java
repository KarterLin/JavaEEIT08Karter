package karter.java;

import karter.api.Bike;

public class Brad17Bike {

	public static void main(String[] args) {
		Bike b1 = new Bike();
		Bike b2 = new Bike();
		Bike b3 = new Bike();
		System.out.println(b1.getSpeed());
		System.out.println(b2.getSpeed());
		b1.upSpeed();b1.upSpeed();b1.upSpeed();b1.upSpeed();
		b1.upSpeed();b1.upSpeed();b1.upSpeed();b1.upSpeed();
		System.out.println(b1.getSpeed());
		System.out.println(b2.getSpeed());	
		System.out.println("-------");
		
		//Question:請讓b2腳踏車的速度加到20以上
		//Solve 1:(用do迴圈，do upSpeed while 速度未達20:
		do {
			b2.upSpeed();
		}while(b2.getSpeed()<20);
		System.out.println(b2.getSpeed());
		
		//Solve 2:if 迴圈
		if (b3.getSpeed()<20) {
			b3.upSpeed();
		}else {}
		System.out.println(b3.getSpeed());
	}

}
