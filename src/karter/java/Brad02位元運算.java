package karter.java;

public class Brad02位元運算 {

	public static void main(String[] args) {
		byte a = 126;
		a++;
		System.out.println(a);
		a++;	// a = a + 1    //位元裡面的運算   所以她沒有做a+1的動作
		System.out.println(a);
		a = 127;
		a += 2;
		System.out.println(a);
	}

}
