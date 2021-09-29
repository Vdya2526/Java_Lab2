package Lab2;

public class Program1 {
	public String carName = "TATA ALTROZ";
	public int carNumber = 6699;
	public float capacity = 5f;
	public boolean IsPurchased = true;
// Creating methods for the given 3 ( MaxSpeed, airPressure, isEngine on)
	public int maxSpeed() {
		return 145;
	}
	
	public double airPresure() {
		return 12.5;
	}
	public boolean isEngineOn() {
		return false;
	}
	public static void main(String[] args) 
	{
		Program1 myCar = new Program1();
		String Name = myCar.carName;
		System.out.println(Name);
		int number = myCar.carNumber;
		System.out.println("TS 26 E " + number);
		float seatCapacity = myCar.capacity;
		System.out.println("Seating Capacity is "+ seatCapacity);
		boolean purchased = myCar.IsPurchased;
		System.out.println("IS CAR PURCHASED " +purchased);
		int speed = myCar.maxSpeed();
		System.out.println("Car MAX Speed is "+speed + "Km/H");
		double pressure = myCar.airPresure();
		System.out.println("AIR Pressure of the car is "+pressure);
		boolean engine = myCar.isEngineOn();
		System.out.println("Is Engine on " + engine);
	}
}