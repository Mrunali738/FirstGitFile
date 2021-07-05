package interviewRevised;

import java.util.Scanner;

public class TcsNqt { //To print how many time addition num of given number

	public static void main(String[] args) {
		int n,i,j,c=0;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number");
		 n = sc.nextInt();
		if(n<=12 && n>0) {
			for (i = 1; i <=6; i++) {
				for (j = 1; j <=6; j++) {
					if(i+j==n)
						c++;
				}
			}
			System.out.println(c);
		}
	}

}
