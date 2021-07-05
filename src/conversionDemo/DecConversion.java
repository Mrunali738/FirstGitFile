package conversionDemo;

public class DecConversion {
	public static void main(String[] args) {
		int dec;
		String oct, bin, hexa;
		 dec = 11;
		
		bin = Integer.toBinaryString(dec);
		oct = Integer.toOctalString(dec);
		hexa = Integer.toHexString(dec);
		System.out.println("Convert into Binary: "+bin);
		System.out.println("Convert into Octal: "+oct);
		System.out.println("Convert into Hexagonal: "+hexa);
		//System.out.println();
		
	}

}
