/**
 * 
 */
package com.java.programs.exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author balajisoundarrajan
 *
 */
public class HighestNumberInArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Integer[] intArray = new Integer[]{10, 20, 35, 789, 2, 45};
		
		List al =  (List) Arrays.asList(intArray);
		Collections.sort(al);
		
		System.out.println(al.get(al.size()-2));
		
		

	}

}
