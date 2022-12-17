package com.java.programs.exercise;

import java.util.Arrays;
import java.util.TreeSet;

/**
 * 
 * @author balajisoundarrajan Can you remove duplicates from an array?
 */
public class RemoveDuplicatesArray {

	public static void main(String arg[]) {

		Integer[] intArray = new Integer[100];

		for (int i = 0; i < 100; i++) {
			intArray[i] = getRandomValue();
		}
		
		TreeSet<Integer> treeset = new TreeSet<Integer>(Arrays.asList(intArray));
		
		treeset.forEach(System.out::println);

	}

	public static int getRandomValue() {
		return (int) (Math.random() * 100);
	}

}
