/**
 * 
 */
package com.java.programs.exercise;

/**
 * @author Balaji Soundarrajan
 *
 * How can you write a code to check if a string is a palindrome or not?
 */
public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String str = "Madami";
		StringBuffer sb = new StringBuffer();
		
		for(int i=str.length()-1; i>=0; i--) {
			sb.append(str.charAt(i));
		}
		
		if(str.equalsIgnoreCase(sb.toString())) {
			System.out.println("The Given String is Palindrome");
		}else {
			System.out.println("The Given String is not Palindrome");
		}

	}

}
