/**
 * 
 */
package com.java.programs.exercise;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author Balaji Soundarrajan
 *
 */
public class DuplicateEntrySingleLine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> al = List.of(1,8,2,4,7,4,2,6,8,9);
		Set<Integer> ts = new HashSet<Integer>();
		al.stream().filter(e -> !ts.add(e)).collect(Collectors.toSet()).forEach(System.out::println);
	}

}