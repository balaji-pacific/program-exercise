/**
 * 
 */
package com.java.programs.exercise;

/**
 * @author balajisoundarrajan
 *
 */
public class FindDuplicate {

	/**
	 * @param args
	 * Find the duplicate character in the String
	 */
	public static void main(String[] args) {
		
		String str = "aAsseerttiionn";
		
		for(int i=0;i<str.length(); i++) {
			for(int j=i+1; j<str.length(); j++) {
				if(str.charAt(i) == str.charAt(j)) {
					System.out.println(str.charAt(j));
					break;
				}
			}
		}

	}

}
