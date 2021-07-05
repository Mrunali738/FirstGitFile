package arrayPractice;

import java.util.Arrays;

public class CharArray {
	public static void main(String[] args) {
		//Creating an Array of four chars
				char[]values = new char[4];
				values[0] = 'j';
				values[1] = 'a';
				values[2] = 'v';
				values[3] = 'a';
				System.out.println("Before Sorting");
				//Loop Over array with for-loop.
				for (char c : values) {
					System.out.println(c);
				}
				Arrays.sort(values);
				System.out.println("After Sorting");
				for (char c : values) {
				System.out.println(c);
			}
			/*
			 * OR for(int i = 0; i<values.length; i++ ) { System.out.println(values[i]); }
			 */
				
	}

}


