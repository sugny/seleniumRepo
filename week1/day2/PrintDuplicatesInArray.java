package week1.day2;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {11,11,22,33,33,121,121,10,55};
				
		int length = numbers.length;
		
		for(int i=0;i<length-1;i++){
			if(numbers[i]==numbers[i+1])
				System.out.println("The Duplicate in Array " +numbers[i]);
			
		}
		
	}

}