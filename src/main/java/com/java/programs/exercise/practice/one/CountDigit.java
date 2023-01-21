/**
 * 
 */
package com.java.programs.exercise.practice.one;

/**
 * @author Balaji Soundarrajan
 *
 */
public class CountDigit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Integer x = 23456;
		Integer sum = 0;
		while(x!=0) {
			int a = x%10;
			x = x/10;
			sum = sum + a;
		}
		System.out.println("Sum of the digit is " + sum);
	}

}
