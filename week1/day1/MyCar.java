package week1.day1;

public class MyCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car add = new Car();
		int sum = add.addThreeNumbers(8,5,5);
		System.out.println(sum);
		
		// Car sub = new Car();
		// int subtract = sub.subTwoNumbers(10,5);  - subTwoNumbers is a private access modifier
		
		Car mul = new Car();
		float multiple = mul.mulThreeNumbers(1023f, 2.01f, 1.245f);  // default access modifier
		System.out.println(multiple);
		
		Car div = new Car();
		int division = div.divTwoNumbers(100, 2);
		System.out.println(division);	

	}


}
