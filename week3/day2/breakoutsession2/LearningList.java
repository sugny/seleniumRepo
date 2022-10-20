package week3.day2.breakoutsession2;

import java.util.Arrays;
import java.util.List;

public class LearningList{

	public static void main(String[] args) {
		
		//FindOddNumbers
		
		List<Integer> FindOddNumbers = Arrays.asList(23,54,67,55,66,42,27,89);
		System.out.println("The odd Numbers are : ");
		for(int forEachValue:FindOddNumbers)
			{		
			 if(forEachValue%2!=0){
				 System.out.println(forEachValue);
			 }
		}
		
		//Find Name 
		
		List<String> nameList = Arrays.asList("Arun","Deepa","Maria","Sharmila","Muthu");
		System.out.println("Name Starts with M : ");
		for (String name : nameList){
			
			if(name.startsWith("M")== true)
					System.out.println(name);
	}
	}
}


