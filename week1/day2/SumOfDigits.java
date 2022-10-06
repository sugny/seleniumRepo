package week1.day2;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input = 503;
		int sum=0;
		while(input>0){
			int reminder = input%10;
			int quotient = input/10;
			sum=sum+reminder;	
			input = quotient;		
		}
		System.out.println("The Sum of digits is "+sum);		
	}

}
