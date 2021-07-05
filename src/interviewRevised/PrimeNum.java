package interviewRevised;

public class PrimeNum {

	public static void main(String[] args) {
		
		int c = 5;
		int Count = 0;
		for(int i=2; i<5; i++) {
			if(c%i==0){
				Count++;
				break;
			}
		}
		if(Count==0) {
			System.out.println("Prime");	
		}
		else {
			System.out.println("Non Prime");
		}
		
	}


}