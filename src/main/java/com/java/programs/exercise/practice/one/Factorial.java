/**
 * 
 */
package com.java.programs.exercise.practice.one;

/**
 * @author Balaji Soundarrajan
 *
 */
public class Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int n = 9;
		int fact = 1;
		for(int i=1; i<=n; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + n + " is " + fact);
	}

}
