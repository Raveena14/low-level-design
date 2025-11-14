package withstrategypattern;

public class RacingDriveCapability implements DriveCapability{

	@Override
	public void drive() {
		System.out.println("Racing capability");		
	}

}
