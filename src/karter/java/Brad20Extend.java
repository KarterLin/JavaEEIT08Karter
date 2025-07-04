package karter.java;

import karter.api.Ispan01;
import karter.api.Ispan02;

public class Brad20Extend {

	public static void main(String[] args) {
		Ispan01 i1 = new Ispan01();
		i1.m1();
		Ispan02 i2 = new Ispan02(); 
		//因為i2 extend from i1，
		//所以i1有的方法，i2也可以找到。
		i2.m1();

	}

}
