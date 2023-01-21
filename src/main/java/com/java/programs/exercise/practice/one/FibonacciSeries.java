/**
 * 
 */
package com.java.programs.exercise.practice.one;

/**
 * @author Balaji Soundarrajan
 *
 */
public class FibonacciSeries {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c = 0;
		System.out.print(a + " " + b + " ");
		for (int i = 1; i <= 10 - 2; i++) {
			c = a + b;
			a = b;
			b = c;
			System.out.print(c + " ");
		}
	}

}
