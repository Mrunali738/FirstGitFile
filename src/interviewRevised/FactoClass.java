package interviewRevised;

import java.util.Scanner;

public class FactoClass {
	public static void main(String[] args) {
		
		int n = 4;
		int a = 2;
		int factorial = 1;
		while(a<=n) {
			 factorial = factorial * a;
			 a++;
		}
		System.out.println("Factorial of "+n+ " is "+factorial);
		
	/*this is program for when we want to take number from user
		
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number");
	int k = scan.nextInt();
	int fact = 1;
	int i = 1;
	while(i<=k) {
		fact = fact*i;
		i++;
	}
	System.out.println("fact of "+k+ " is "+fact);
	}*/
}
}