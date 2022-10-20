package week3.day2.collectionsprogram;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicateNumbers {

	public static void main(String[] args) {
		
		int[] data = {4,3,6,8,29,1,2,4,7,8};
		Set<Integer> dataSet = new HashSet<Integer>();
		for(int i=0;i<(data.length);i++){			
			 boolean isDuplicate = dataSet.add(data[i]);
			 if(isDuplicate==false){
				 System.out.println("Duplicate Number is "+data[i]);
			 }	 
		}
	}

}
