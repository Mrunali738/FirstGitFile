package conversionDemo;

import java.util.Scanner;

public class BinarytoAll {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Binary number");
		String binary = scan.nextLine();
		int decimal;
		String octal, hexadecimal;
		
		decimal = Integer.parseInt(binary, 2);
		octal = Integer.toOctalString(decimal);
		hexadecimal = Integer.toHexString(decimal);
		
		System.out.println("Convert from Binary number to Decimal: "+decimal);
		System.out.println("Convert from Binary number to Octal: "+octal);
		System.out.println("Convert from Binary number to Hexadecimal: "+hexadecimal);
		//System.out.println("Decimal: "+decimal+ "Octal: "+octal+ "Hexadecimal: "+hexadecimal);
		
	}

}
