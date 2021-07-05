package arrayPractice;

import java.util.Arrays;
public class Array {
	public static void main(String[] args) {
		String [] str = {"Java","Python","Ruby","Pearl","C#"};
		int [] arr = new int [4];
		arr[0] = 3;
		arr[1] = 2;
		arr[2] = 4;
		arr[3] = 1;
		int [] arr2 = arr;
		System.out.println(arr2[1]); //2
		System.out.println(str[0]);
		System.out.println(str[3]);
		System.out.println(arr.length);
		System.out.println(arr[2]);
		System.out.println(str.length);
		System.out.println(arr2.equals(arr)); //true
		System.out.println(str.equals(arr));  //false
		System.out.println("Before Array Sorted");// number sorting
		for (int k = 0; k<arr.length; k++) {
			System.out.println(arr[k]);
		}
		System.out.println("After Array Sorted");
		Arrays.sort(arr);
		for(int k = 0; k<arr.length; k++) {
			System.out.println(arr[k]);
			}
		//String Sorting (IN Ascending Order)
		System.out.println("Before String/Object array Sorting");
		for (String ab : str) {
			System.out.println(ab);
		}
		Arrays.sort(str);
		System.out.println("After String/Object array Sorting");
		for(String ab: str) {
			System.out.println(ab);
	}

}

	}


