package withstrategypattern;

public class Vehicle {

	DriveCapability driveCapability;
	
	Vehicle(DriveCapability obj){
		this.driveCapability = obj;
	}
	
	public void drive() {
		driveCapability.drive();
	}
	
}
