package week1.day2;

public class ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int calculated =0;
		int reminder;
		int original = 153;
		int input = original;
		
		while(input>0){
			
			reminder = input%10;
			//System.out.println(reminder + "reminder");
			calculated = calculated+(reminder*reminder*reminder);
			//System.out.println(calculated);
			input = input/10;
		}
		if(original == calculated)
			System.out.println(original + " is a Armstrong Number");
		else 
			System.out.println(original + " is not a Armstrong Number");
		}
	}