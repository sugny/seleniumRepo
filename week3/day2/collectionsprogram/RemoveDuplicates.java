package week3.day2.collectionsprogram;


import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String input = "PayPal India";
		char[] inputArray = input.toCharArray();
		Set<Character> charSet = new HashSet<Character>();
		Set<Character> dupeCharSet  = new HashSet<Character>(charSet);
		for(int i=0;i<(inputArray.length-1);i++){
			boolean add = charSet.add(inputArray[i]);
			if(add==false){
			dupeCharSet.add(inputArray[i]);
			System.out.println("1"+dupeCharSet);
			}
				
		}
		System.out.println("2"+charSet);
		System.out.println("3"+dupeCharSet);
		charSet.removeAll(dupeCharSet);
		for (char a : charSet) {
			if(a!=' '){
				charSet.add(a);
				System.out.println(a);
			}			
		}
		
	}
}



				
