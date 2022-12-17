/**
 * 
 */
package com.java.programs.exercise;

/**
 * @author balajisoundarrajan
 * How do you reverse an array in place in Java?
 *
 */
public class ReverseAnArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Integer[] intArray = new Integer[100];
		Integer[] revArray = new Integer[100];
		
		
		for(int i=0; i< 100; i++) {
			intArray[i] = i;
		}
		
		int j=0;
		for(int i=intArray.length-1; i>0; i--) {
			revArray[i] = intArray[j];
			j++;
		}
		
		for(Integer i : revArray) {
			System.out.println(i);
		}
		

	}

}
