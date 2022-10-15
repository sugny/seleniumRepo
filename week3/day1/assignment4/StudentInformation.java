package week3.day1.assignment4;

public class StudentInformation {

	public static void main(String[] args) {
		
		Students students = new Students();
		students.getStudentInfo(123);
		students.getStudentInfo(123, "xyz");
		students.getStudentInfo(123456789,"abc@gmail.com");

	}

}
