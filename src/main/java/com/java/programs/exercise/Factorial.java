/**
 * 
 */
package com.java.programs.exercise;

/**
 * @author Balaji Soundarrajan
 *
 */
public class Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Integer factorial = 5;
		Integer factValue = 1;
		for(int i=1;i<=factorial; i++) {
			factValue = factValue * i;
		}
		
		System.out.println("Value through factorial : " + factValue);
		
		factValue = factorial(factorial);
		
		System.out.println("Value of factorial - recuressive : " + factValue);

	}
	
	public static Integer factorial(Integer n) {
		if(n==0) {
			return 1;
		}else {
			return n*factorial(n-1);
		}
	}

}
