package interviewRevised;
import java.util.Scanner;

public class RecurrsionFact {		//Recursive Function to find factorial
	int fact(int n) {
		if(n==0) {
			return 1;
		}
		else {
			return (n * fact(n-1));
		}
	}
	public static void main(String[] args) {
		RecurrsionFact obj = new RecurrsionFact();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		//Calling the recursive function
		System.out.println("Factorial = " +obj.fact(n));
	}

}
