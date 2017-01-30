package Java.com.lectures;

public class Bicycle {
	// Class with three fields
	public int cadence;
	public int gear;
	public int speed;
	// Constructor
	public Bicycle(int startCadence, int startSpeed, int startGear){
		gear = startGear;
		speed = startSpeed;
		cadence = startCadence;
	}
	public void setCadence(int newValue){
		cadence = newValue; 
		}
	public void setGear(int newValue){
		gear = newValue;
	}
	public void SpeedUp(int increment){
		speed += increment;
		
	}
	public void SpeedDown(int decrement){
		speed -= decrement;
	}
}
