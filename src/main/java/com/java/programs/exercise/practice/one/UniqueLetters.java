/**
 * 
 */
package com.java.programs.exercise.practice.one;

import java.util.HashMap;

/**
 * @author Balaji Soundarrajan
 *
 */
public class UniqueLetters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String str = "Balaji";
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
		for(int i=0; i<str.length(); i++) {
			if(hm.get(str.charAt(i)) == null) {
				hm.put(str.charAt(i), 1);
			}else {
				hm.put(str.charAt(i), hm.get(str.charAt(i)) + 1);
			}
		}
		
		hm.entrySet().stream().filter(e -> e.getValue() ==1).forEach(e -> System.out.println(e.getKey()));
	}

}
