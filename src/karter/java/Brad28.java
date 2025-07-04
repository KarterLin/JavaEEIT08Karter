package karter.java;

public class Brad28 {

	public static void main(String[] args) {
		
	}

}
class Brad281{
	protected Object m1() {
		System.out.println("Brad281:m1()");
		return null;
	}
	void m2 () {}
}
class Brad282 extends Brad281{
	@Override
	protected String m1() {
		System.out.println("Brad281:m1()");
		super.m1();
		return null;
	}
}