package interviewRevised;

import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		
		int i,num, s=0;
		double Avg;
		System.out.println("Input the five numbers");
		
		for(i=0; i<5; i++) {
			Scanner sc = new Scanner(System.in);
			num = sc.nextInt();
			s+=num;	
		}
		Avg = s/5;
		System.out.println("The sum of 5 no is : " +s+" The Average is :" +Avg);
	}

}
