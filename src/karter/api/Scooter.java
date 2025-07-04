package karter.api;

public class Scooter extends Bike{
//子類別延伸父類別 (父類別為public or protected才看的到
//	            private(會沒辦法參照))
	private int gear;   // 0
	private String color;
	
	public Scooter() {
		System.out.println("Scooter!!");
		color = "red";
	}
	
	public String getColor() {
		return color;
	}
	
	public void upSpeed() {
		if (gear > 0) {
		speed = speed < 1 ? 1 : speed * 1.8 * gear;
		}
	}
	
	public int changeGear(int gear) {
		if(gear >=0 && gear <=4) {
			this.gear = gear;
		}
		return this.gear;
	}
	
}
