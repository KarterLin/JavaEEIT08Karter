package karter.java;

public class Brad42TryCatch {

	public static void main(String[] args) {
		int a = 10, b = 3;
		int c;
		int[]d = {1,2,3,4};
		
		System.out.println("Hello, World");
		try {
		c = a / b;
		System.out.println(c);
		System.out.println(d[20]);
//		}catch(ArithmeticException e) {
//			System.out.println("Oooop!(1)");
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("Oooop!(2)");
		}catch(RuntimeException e) {
			System.out.println("xxx");
		}
		System.out.println("Finished");
	}

}
