package week1.day1;


public class Car {
	

	public static void main(String[] args) {
		Car add = new Car();
		int sum = add.addThreeNumbers(7, 8, 9);
		System.out.println(sum);
		Car sub = new Car();
		int subtract = sub.subTwoNumbers(10, 7);
		System.out.println(subtract);
		Car mul = new Car();
		float multiple = mul.mulThreeNumbers(0.12f, 0.123f, 0.1245f);
		System.out.println(multiple);
		Car div = new Car();
		int division = div.divTwoNumbers(100, 2);
		System.out.println(division);
			
	}
	
	public void printCarName(){
		System.out.println("hyndai");
	}
	
	public int getCarRegistrationNumber(){
		//int registrationNumber = 2222;
		return getCarRegistrationNumber();
	}
	
	public String getCarColor(){
		//String getColor = "blue";
		return getCarColor();
	}
	
	public boolean isCarPuntured(){
		return true;
	}
	
// Arithmetic functions methods
	
	public int addThreeNumbers(int num1,int num2,int num3){
		int sumOfThreeNumbers = num1+num2+num3;
		return sumOfThreeNumbers;
	}

	private int subTwoNumbers(int num1,int num2){
	int subOfTwoNumbers = num1-num2;
	return subOfTwoNumbers;
	}

	float mulThreeNumbers(float num1,float num2,float num3){
	float mulThreeNumbers = num1*num2*num3;
	return mulThreeNumbers;
	}

	public int divTwoNumbers(int num1,int num2){
	int divTwoNumbers = num1/num2;
	return divTwoNumbers;

	}
}
