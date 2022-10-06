package week1.day2;

import week1.day1.Car;

public class MyNewCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car add = new Car();
		int sum = add.addThreeNumbers(10, 20, 30);
		System.out.println(sum);
		
		/*Car sub = new Car();
		int subtract = sub.subTwoNumbers(20,10);
		
		subTwoNumbers - private access modifier
		
		
		Car mul = new Car();
		float multiply = mul.mulThreeNumbers(1.2f,2.2f,3.3f);
		
		mulThreeNumbers - default access modifier : access only within the package 
		
		*/
		
		Car div = new Car();
		int divide = div.divTwoNumbers(4, 2);
		System.out.println(divide);
	}

}
