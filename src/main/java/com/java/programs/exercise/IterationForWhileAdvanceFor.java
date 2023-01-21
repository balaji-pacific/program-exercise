/**
 * 
 */
package com.java.programs.exercise;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Balaji Soundarrajan
 *
 */
public class IterationForWhileAdvanceFor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Yashika");
		al.add(" is");
		al.add(" a");
		al.add(" good");
		al.add(" girl");
		
		//Iterate using for
		for(int i=0; i< al.size() ; i++) {
			System.out.print(al.get(i));
		}
		System.out.println();
		//Using while
		Iterator<String> iterator = al.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next());
		}
		
		System.out.println("");
		for(String str : al) {
			System.out.print(str);
		}
		
		System.out.println();
		//Lambda
		al.forEach(s -> System.out.print(s));

	}

}
