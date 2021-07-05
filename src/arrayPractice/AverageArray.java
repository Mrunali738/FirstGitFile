package arrayPractice;

public class AverageArray {
	public static void main(String[] args) {
		double nums [] = {10.5, 11.2, 15.6, 13.7, 14.1};
		double result = 0; //Result variable to Store the sum of array of values
		
		for(int i = 0; i<nums.length; i++) {
			//result = result + nums[i];	//Addition of Values
			System.out.println("Average of Elements is: "+nums[i]/nums.length);
		}
		System.out.println();

	}

}
