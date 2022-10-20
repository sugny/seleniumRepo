package week3.day2.collectionsprogram;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		int[] data = {3,2,11,4,6,7,2,3,3,6,7,23,44,76,99};
		Set<Integer> dataSet = new TreeSet<Integer>();
		for(int i =0; i<(data.length);i++){
			dataSet.add(data[i]);
		}
		System.out.println("Array to Set convertion "+dataSet);
		List<Integer> dataList= new ArrayList<Integer>(dataSet);
		int dataListSize = dataList.size();
		System.out.println("The Second Largest number is "+dataList.get(dataListSize-2));
	}

}
