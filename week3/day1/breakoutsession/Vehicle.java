package week3.day1.breakoutsession;

public class Vehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Car
		
		BMW bmw = new BMW();
		bmw.autoPark();
		bmw.openSunroof();
		bmw.turnOnAC();
		Audi audi = new Audi();
		audi.hybridFuel();
		audi.openSunroof();
		audi.turnOnAC();
		audi.applyBrake();		
		//Auto
		
		Bajaj bajaj = new Bajaj();
		bajaj.electronicMeter();
		bajaj.handStarter();
		
		// this and super
		audi.getApplyBrake();
	}
	
	public void  applyBrake() {
		System.out.println("Vehicle --> applyBrake--Normal break");
	
	}
	
	public void  soundHorn() {
		System.out.println("Vehicle --> soundHorn");
	
	}

}
