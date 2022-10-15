package week3.day1.assignment3;

public class AxisBank extends BankInfo {
	
	public void deposit() {
		System.out.println("deposit account Child");
	}

	public void getDeposit() {
		this.deposit();
		super.deposit();
	}
		
}

