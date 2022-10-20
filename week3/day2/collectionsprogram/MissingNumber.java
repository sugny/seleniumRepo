package week3.day2.collectionsprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MissingNumber {

	public static void main(String[] args) {
		
		List<Integer> inputList = Arrays.asList(1,23,5,8,8,6,4);
		System.out.println("inputList "+inputList);
		Set<Integer> deDupeSet = new HashSet<Integer>(inputList);
		System.out.println("deDupeSet "+deDupeSet);
		List<Integer> deDupeList= new ArrayList<Integer>(deDupeSet);
		System.out.println("deDupeList "+deDupeList);
		Collections.sort(deDupeList);
		System.out.println("Sorted deDupeList "+deDupeList);
		for(int i=0; i<(deDupeList.size()-1);i++){
			int currentNumber = deDupeList.get(i);
			int nextNumber = deDupeList.get(i+1);
			if(currentNumber+1==nextNumber){
				
			}
			else {
				System.out.println(currentNumber+1);
				break;
			}
			
		}
	}
}