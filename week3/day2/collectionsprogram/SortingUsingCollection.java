package week3.day2.collectionsprogram;

import java.util.Arrays;

public class SortingUsingCollection {

	public static void main(String[] args) {
		
		String[] values = {"HCL", "Wipro",  "Aspire Systems", "CTS","Infosys"};
		int length = values.length;
		System.out.println(length);
		Arrays.sort(values);
		for (int i=(length-1); i>=0;i--){
			System.out.println(values[i]);		
		}	
	}
}
