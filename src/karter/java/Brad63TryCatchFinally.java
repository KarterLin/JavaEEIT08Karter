package karter.java;

public class Brad63TryCatchFinally {

	public static void main(String[] args) {
		m1();

	}

	static void m1() {
		int a = 10, b= 0;
		int c;
		try {
			c = a / b;
			System.out.println(c);
		}catch(Exception e) {
			System.out.println(e);
			return;
		}finally {
		System.out.println("Finally");
		}
		System.out.println("ok");
	}
}
