/**
 * 
 */
package com.java.programs.exercise;

/**
 * @author Balaji Soundarrajan
 * 
 * Swapping two different number with and without using temp variable
 *
 */
public class SwappingTwoNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int a = 4539, b= 4498;
		withTempVariable(a, b);
		
		withOutTempVariable(a, b);

	}
	
	public static void withTempVariable(int a, int b) {
		System.out.println("Before Swapping A : " + a + " B : " + b);
		int temp = 0;
		temp = a;
		a = b;
		b = temp;
		System.out.println("After Swapping A : " + a + " B : " + b);
	}
	
	
	public static void withOutTempVariable(int a, int b) {
		System.out.println("Before Swapping A : " + a + " B : " + b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("After Swapping A : " + a + " B : " + b);
	}

}
