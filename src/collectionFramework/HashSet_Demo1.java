package collectionFramework;

import java.util.HashSet;

//program for compare two sets and retain elements which are same on both hashsets
public class HashSet_Demo1 {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet();
		hs.add("Java");
		hs.add("Manual");
		hs.add("Selenium");
		hs.add("Cucumber");
		System.out.println("First HashSet: "+hs);
		
		HashSet<String> subSet = new HashSet();
		subSet.add("Java");
		subSet.add("TestNG");
		subSet.add("Maven");
		subSet.add("Jenkin");
		System.out.println("Second HashSet: "+subSet);
		System.out.println(subSet);
		hs.retainAll(subSet);
		// this function retain common element from both hashset
		System.out.println("Common HashSet Contain from both:");
		System.out.println(hs);
	}

}
