package week3.day1.breakoutsession;

public class Audi extends Car {
	public void  hybridFuel() {
		System.out.println("Audi--> hybridFuel");
	
	}
	
	public void  applyBrake() {
		System.out.println("Vehicle --> applyBrake--ABS break");
	
	}
	
	public void getApplyBrake(){
		
		System.out.println("This and Super keywords");
		this.applyBrake();
		super.applyBrake();
	}
	

}
