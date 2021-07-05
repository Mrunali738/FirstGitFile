package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestArrayList {
	public static void main(String[] args) {
	ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
		
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		arr1.add(34);
		arr1.add(34);
		arr1.add(34);
		arr1.add(34);
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		arr2.add(34);
		arr2.add(34);
		arr2.add(34);
		arr2.add(34);
		ArrayList<Integer> arr3 = new ArrayList<Integer>();
		arr3.add(34);
		arr3.add(34);
		arr3.add(34);
		arr3.add(34);
		arr.add(arr1);
		arr.add(arr2);
		arr.add(arr3);
		System.out.println(arr);
 System.out.println("Iteration of ArrayList by for loop");
 for(int i=0; i<arr.size(); i++) {
	 System.out.println(arr.get(i));
 }
 
 System.out.println("Iteration of ArrayList by Iterator");
 Iterator<ArrayList<Integer>> itr = arr.iterator();
 while(itr.hasNext()) {
	 System.out.println(itr.next());
 }
 
 System.out.println("Iteration of ArrayList by List Iterator");
 ListIterator<ArrayList<Integer>> ltr = arr.listIterator();
 while(ltr.hasNext()) {
	 System.out.println(ltr.next());
 }
 
	}
	
	

}
