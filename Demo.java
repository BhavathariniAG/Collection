package co.proj;

import java.util.HashSet;
import java.util.Iterator;

public class Demo2 {

	public static void main(String[] args) {
		HashSet<String> al = new HashSet<String>();
		
		al.add("Alvin");
		al.add("Benny");
		al.add("Arvi");
		al.add("Alvin");
		al.add("Tom");
		al.add("Darwin");
		al.add("Swetha");
		al.add("Arvi");
		
		System.out.println("Set is:" +al);
		
		al.remove("Benny");
		System.out.println("After removing:" +al);
		
		if(al.contains("Tom")) {
			System.out.println("Tom is present in the set");
		}
		
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);
		}

	}

}