package week3.day1.breakoutsession;

public class LearnOverloading {
	
	public  int add(int a, int b){
		int sum = a+b;
		System.out.println(sum);
		return sum;
		
	}
	
	public int add(int a, int b,int c){
		int sum = a+b+c;
		System.out.println(sum);
		return a+b+c;
				
	}
	
	public float add(float a, float b){
		float sum = a+b;
		System.out.println(sum);
		return sum;
		
	}
	
	public float add(float a, int b){
		float sum = a+b;
		System.out.println(sum);
		return sum;	
	}
	
	public static void main(String[] args) {
		
		LearnOverloading sum = new LearnOverloading();
		sum.add(5, 6);
		sum.add(2,3,4);
		sum.add(0.4f, 0.5f);
		sum.add(0.2f,10);
	}

}
