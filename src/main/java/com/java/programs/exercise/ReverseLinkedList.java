package com.java.programs.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 * @author balaji soundarrajan
 * How do you reverse a linked list?
 */
public class ReverseLinkedList {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList = (ArrayList<Integer>) Stream.of(10, 20, 45, 60, 78, 99).collect(Collectors.toList());
		
		LinkedList<Integer> ll = (LinkedList<Integer>) Stream.of(10, 20, 45, 60, 78, 99).collect(Collectors.toList());
		
	    LinkedList<Integer> linkedList = convertFromALtoLL(arrayList);
		
		System.out.println("Before : " + linkedList);
		Collections.reverse(linkedList);
		
		System.out.println("After : " + linkedList);
		
		
	}

	private static LinkedList<Integer> convertFromALtoLL(ArrayList<Integer> arrayList) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		for(Integer i : arrayList) {
			ll.add(i);
		}
		return ll;
	}
}
