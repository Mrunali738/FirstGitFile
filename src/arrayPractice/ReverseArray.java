package arrayPractice;

public class ReverseArray {
	public static void main(String[] args) {
		
		boolean [] values = {false, true, true, true};
		String [] values2 = {"Java", "Selenium", "Maven", "Jenkin"};
		
		//Loop over array elements in reverse order.
		for(int i = values.length-1; i>=0; i--) {
			System.out.println(values[i]);
		}
		for(int i = values2.length-1; i>=0; i--) {
			System.out.println(values2[i]);
		}

	}

}
