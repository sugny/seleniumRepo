package week1.day2;

public class TwoWheeler {
	
	
	int noOfWheels = 4;
	short noOfMirrors = 2;
	long chasisNumber = 235484;
	boolean isPuntured = true;
	String bikeName = "Activa";
	double runningKM = 23000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TwoWheeler noOfWheels = new TwoWheeler();
		int wheels = noOfWheels.noOfWheels;
		System.out.println("Wheels " + wheels);
		
		TwoWheeler noOfMirrors = new TwoWheeler();
		short mirror = noOfMirrors.noOfMirrors;
		System.out.println("Mirror "+mirror);
		
		TwoWheeler chasisNumber = new TwoWheeler();
		long chasNumber = chasisNumber.chasisNumber;
		System.out.println("ChasNumber " +chasNumber);
		
		TwoWheeler isPuntured = new TwoWheeler();
		boolean Puntured = isPuntured.isPuntured;
		System.out.println("Puntured " +Puntured);
		
		TwoWheeler bikeName = new TwoWheeler();
		String myBikeName = bikeName.bikeName;
		System.out.println("MyBikeName " +myBikeName);
		
		TwoWheeler runningKM = new TwoWheeler();
		double runKM = runningKM.runningKM;
		System.out.println("RunningKM " +runKM);
		
		
	}

}
