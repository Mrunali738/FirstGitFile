package arrayPractice;

import java.util.Scanner;

public class UIArray {
	public static void main(String[] args) {
		//Program for accept array from user and display it
		
		int z[] = new int [10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 integers of array");
		for(int i=0; i<10; i++) {
			System.out.println("Enter array element");
			 z[i] = sc.nextInt();
		}
		System.out.println("You have Entered");
		for(int i=0; i<10; i++) {
			System.out.println(z[i]);
		}
	}

}
