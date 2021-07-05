package arrayPractice;

import java.util.Arrays;

public class MergeArray {

	public static void main(String[] args) {
		int [] val = {10,50,70};
		int [] val1 = {20,100,150};
		//Merge the two arrays with for-loops.
		int [] merge = new int [val.length + val1.length];
		for(int i=0; i<val.length; i++) {
			merge[i] = val[i];
		}
		for(int i=0; i<val1.length; i++ ) {
			merge[i+val.length] = val1[i];
		}
		//Display the Merged Array.
		System.out.println(Arrays.toString(merge));
	}

}
