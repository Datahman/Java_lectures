package Java.com.lectures;

public class MountainBike extends Bicycle {
	public int seatHeight;
	
	// Child class constructor 
	public MountainBike(int startHeight,int startCadence, int startSpeed, int startGear) {
		super(startCadence, startSpeed, startGear);
		seatHeight = startHeight;
		}
	public void SetBikeHeight(int Some_val){
		seatHeight = Some_val;
	}
}
