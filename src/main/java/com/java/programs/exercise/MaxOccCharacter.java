package com.java.programs.exercise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author balajisoundarrajan
 * 
 * How do you find the maximum occurring character in a given string
 *
 */
public class MaxOccCharacter {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String str = "aaserrdfeew";
		Map.Entry<String, Integer> max = null;
		Map.Entry<String, Integer> min = null;
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for(int i=0; i<str.length(); i++) {
			
			if(hm.containsKey(String.valueOf(str.charAt(i)))) {
				hm.put(String.valueOf(str.charAt(i)), hm.get(String.valueOf(str.charAt(i))) + 1);
			}else {
				hm.put(String.valueOf(str.charAt(i)), 1);
			}
		}
		for(Map.Entry<String, Integer> ks : hm.entrySet()) {
			if(max == null || ks.getValue().compareTo(max.getValue()) > 0) {
				max = ks;
			}
		}
		
		for(Map.Entry<String, Integer> ks : hm.entrySet()) {
			if(max == null || ks.getValue().compareTo(max.getValue()) < 0) {
				min = ks;
			}
		}
		
		//System.out.println("Maximum Occurence is " + max.getKey() + " occured " + max.getValue());
		//System.out.println("Minimum Occurence is " + min.getKey() + " occured " + min.getValue());
		
		findMaxOccChar();
		
	}
	
	public static void findMaxOccChar() {
		
		String str = "ASKDJGNETTKDSDWSAS";
		HashMap<String, Integer> actualMap = new HashMap<String, Integer>();
		LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
		for(int i=0;i<str.length();i++) {
			 Integer value = actualMap.get(String.valueOf(str.charAt(i)));
			 if(value == null) {
				 actualMap.put(String.valueOf(str.charAt(i)), 1);
			 }else {
				 actualMap.put(String.valueOf(str.charAt(i)), value + 1);
			 }
		}
		actualMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));
		int count =1;
		for(Map.Entry<String, Integer> me : sortedMap.entrySet()) {
			if(count==1) {
				System.out.println(me.getKey() + " Min Occured : " + me.getValue());
			}else if(count == sortedMap.size()) {
				System.out.println(me.getKey() + " Max Occured : " + me.getValue());
			}
			count++;
		}
		
	}
}
