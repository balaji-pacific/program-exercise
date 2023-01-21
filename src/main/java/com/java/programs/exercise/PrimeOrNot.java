/**
 * 
 */
package com.java.programs.exercise;

/**
 * @author Balaji Soundarrajan
 * Check the given number is Prime or not
 */
public class PrimeOrNot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int primeNumber = 2997;
		boolean isPrime = true;
		
		for(int i=2; i<=primeNumber/2; i++) {
			if((primeNumber%i) == 0) {
				isPrime = false;
				break;
			}
		}
		
		if(isPrime) {
			System.out.println("The number " + primeNumber  + " is prime number");
		}else {
			System.out.println("The number " + primeNumber  + " is not a prime number");
		}

	}

}
