package withstrategypattern;

public class PassangerVehicle extends Vehicle{
	
	public PassangerVehicle() {
		super(new NormalDriveCapability());
	}

}
