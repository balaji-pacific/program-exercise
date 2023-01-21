/**
 * 
 */
package com.java.programs.exercise;

import java.util.Arrays;
import java.util.TreeSet;

/**
 * @author Balaji Soundarrajan
 * How do you find the largest and smallest number in an array of 1-100
 */
public class LargestSmallestArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Double[] intArr = new Double[100];
		for(int i=0;i<100;i++) {
			intArr[i] = getRandomValue();
		}
		
		for(int i=0;i<100;i++) {
			System.out.println(intArr[i]);
		}
		
		TreeSet<Double> ts = new TreeSet<Double>(Arrays.asList(intArr));
		
		System.out.println("Min : " + ts.first());
		System.out.println("Max : " + ts.last());
	}
	
	public static double getRandomValue() {
		return Math.random() * 100;
	}

}
