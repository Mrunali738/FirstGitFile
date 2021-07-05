package arrayPractice;

public class DuplicateElement {
	public static void main(String[] args) {
		//Program to print the duplicate elements of an array
		
		int aa[] = {1,2,4,6,2,3,4,6};
		System.out.println("Duplicate Elements in Array");
		
		for(int i=0; i<aa.length; i++) {
			for(int j=i+1; j<aa.length; j++) {
				if(aa[i]==aa[j]) {
					System.out.println(aa[j]);
				}
			}
		}
		
	}

}
