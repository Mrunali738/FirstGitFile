package arrayPractice;

public class CopyArray {

	public static void main(String[] args) {
		int array1 [] = {7,4,3,6,5,2};
		int array2 [] = new int [6];
		
		System.out.println("array1");
		System.out.println("[");
		for(int i=0; i<array1.length; i++) {
			System.out.println(""+array1[i]);
		}
		System.out.println("]");
		System.out.println("array2:");
		System.out.println("[");
		for(int j=0; j<array1.length; j++) {
			array2[j] = array1[j];
			System.out.println(""+array2[j]);
		}
		System.out.println("]");
	
	}
}
