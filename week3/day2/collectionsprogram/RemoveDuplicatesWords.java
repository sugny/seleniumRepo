package week3.day2.collectionsprogram;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesWords {
	
	public static void main(String[] args) {
	
		String text = "We learn java basics as part of java sessions in java week1";
		String[] wordArray = text.split("\\s+");		
		Set<String> memory = new HashSet<String>();
		for(String word : wordArray){			
			if(!memory.contains(word)){
				System.out.print(word+" ");
			}
			memory.add(word);		
			
		}
	}
}


