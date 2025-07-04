package karter.java;

import java.net.MulticastSocket;

import karter.api.Bike;
import karter.api.Scooter;

public class Brad18Scooter {

	public static void main(String[] args) {
		Scooter s1 = new Scooter();
		s1.changeGear(4);
		s1.upSpeed();s1.upSpeed();
		s1.upSpeed();s1.downSpeed();
		System.out.println(s1.getSpeed());
		
		Bike b1 = new Bike();
		s1.upSpeed();b1.upSpeed();
		s1.upSpeed();b1.upSpeed();
		System.out.println(b1.getSpeed());
		System.out.println(s1.getColor());
	}
 
}
