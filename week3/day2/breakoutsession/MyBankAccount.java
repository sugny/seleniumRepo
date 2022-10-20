package week3.day2.breakoutsession;

public class MyBankAccount {

	public static void main(String[] args) {
		
		System.out.println("object for normal class");
		System.out.println("--------------------------");
		HDFC hdfc = new HDFC();
		hdfc.minimumBalance(500);
		hdfc.provideDebitCard(false);
		hdfc.provideCreditCard(true);
		
		System.out.println("--------------------------");
		System.out.println("object for interface class");
		
		RBIinterface rbiInterface = new HDFC();
		rbiInterface.minimumBalance(500);
		rbiInterface.provideDebitCard(true);
		
		// cant use this ----> here : out of scope
		// rbiInterface.provideCreditCard(true);
		
	}

}
