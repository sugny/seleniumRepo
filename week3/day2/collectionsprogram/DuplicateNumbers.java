package week3.day2.collectionsprogram;

import java.util.Arrays;

public class DuplicateNumbers {

	public static void main(String[] args) {
		
		int[] data = {4,3,6,8,29,1,2,4,7,8};
		Arrays.sort(data);
		System.out.println("Duplicate Numbers are : ");
		for(int i=0;i<(data.length-1);i++){
			int currentNumber = data[i];
			int nextNumber = data[i+1];
			if(currentNumber==nextNumber){
				System.out.println(currentNumber);
			}
		}

	}

}
