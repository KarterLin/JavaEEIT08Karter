package karter.java;

public class Brad43 {

	public static void main(String[] args) {
		Bird b1 = new Bird();
		try {
			b1.setLeg(3);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		System.out.println("ok");
	}
 
	
}
class Bird {
	int leg;
	void setLeg(int n) throws Exception {
		if(n >= 0 && n <= 2) {
			leg = n;
		}else {
			throw new RuntimeException();
		}
	}
}