package interviewRevised;
import java.util.Scanner;

public class PowerRecurssion {
	int Power(int x, int n) {	//Recurssive function to calculate the power
		if(n==0) {
			return 1;
		}
		else {
			return x * Power(x,n-1);
		}
	}
	public static void main(String[] args) {
		PowerRecurssion obj1 = new PowerRecurssion();
		//Scanner scan = new Scanner(System.in);
		//System.out.println("Enter the base number: ");
		int x = 5;//scan.nextInt();
		//System.out.println("Enter the exponent number: ");
		int n = 4;//scan.nextInt();
		System.out.println("The Answer is: "+obj1.Power(x, n));
		

	}

}
