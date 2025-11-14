package withstrategypattern;

public class OffRoadVehicle extends Vehicle{

	public OffRoadVehicle() {
		super(new RacingDriveCapability());
	}
	
}
