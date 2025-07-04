package karter.java;

public class Brad15值交換 {

	public static void main(String[] args) {
		int a = 10, b = 3;
		/* 透過第三個變數，把ab的值進行交換
		int c = a;
		a = b;
		b = c; */
		
		/* 數學方式
		a = a + b; // a = 13
		b = a - b; // b = 10
		a = a - b; // a = 3 */
		
		/* XOR
		a = a ^ b;
		b = a ^ b;
		a = a ^ b; */
		
		System.out.printf("a= %d, b= %d\n",a,b);
		System.out.println(3 & 2);
		System.out.println(3 | 2);
		System.out.println(3 ^ 2);

	}

}
