package conversionDemo;
import java.util.Scanner;
public class DecimaltoALL {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Decimal Number");
		int decimal = sc.nextInt();
		String binary, octal, hexadecimal;
		
		binary = Integer.toBinaryString(decimal);
		octal = Integer.toOctalString(decimal);
		hexadecimal = Integer.toHexString(decimal);
		
		System.out.println("Binary: "+binary+ " Octal: "+octal+ " Hexadecimal: "+hexadecimal);
	}

}
