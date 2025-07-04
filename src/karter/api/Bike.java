package karter.api;

public class Bike {
	protected double speed; //封裝起來，不讓別人直接set速度，只能用下方的方法後，用get去查詢速度
	
	public void upSpeed() {
		speed = speed < 1 ? 1 : speed * 1.4;
	}
	
	public void downSpeed() {
		speed = speed < 1 ? 0 : speed * 0.6;
	}
	public double getSpeed() {
		return speed;
	}
	public String toString() {
		return "Speed:"+speed;
	}
}

