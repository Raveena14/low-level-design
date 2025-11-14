package withstrategypattern;

public class NormalDriveCapability implements DriveCapability{

	@Override
	public void drive() {
		System.out.println("Normal drive capability");
	}

}
