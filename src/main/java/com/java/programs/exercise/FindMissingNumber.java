/**
 * 
 */
package com.java.programs.exercise;

import java.util.Arrays;
import java.util.TreeSet;

/**
 * @author balajisoundarrajan
 * How do you find a missing number in an array of 1-100?
 */
public class FindMissingNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Integer[] intArray = new Integer[100];
		
		for(int i=0;i<100;i++) {
			intArray[i] = getRandomValue();
			System.out.print(" " + intArray[i]);
		}
		
		TreeSet<Integer> hs = new TreeSet<Integer>(Arrays.asList(intArray));
		
		System.out.println("\nBelow Value is missing : ");
		for(int i=0;i<100;i++) {
			if(!hs.contains(i)) {
				System.out.println(i);
			}
		}
	}
	
	
	public static Integer getRandomValue() {
		return (int) (Math.random()*100);
	}

}
