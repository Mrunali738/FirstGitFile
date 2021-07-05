package collectionFramework;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<String> hs1 = new HashSet<>();
		hs1.add("Java");
		hs1.add("By");
		hs1.add("Kiran");
		hs1.add("Karvenagar");
		System.out.println("HashSet is empty or not: "+hs1.isEmpty());
		
		Iterator<String> irh = hs1.iterator(); //to iterate HashSet element through iterator
		while(irh.hasNext()) {
			System.out.println(irh.next());
			}
		hs1.remove("Karvenagar");
		System.out.println(hs1);
		System.out.println(" Size of HashSet= " + hs1.size());
		System.out.println(" Does HashSet contains Second element= " +
		hs1.contains("By"));
	}

}
