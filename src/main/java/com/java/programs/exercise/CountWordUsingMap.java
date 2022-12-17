/**
 * 
 */
package com.java.programs.exercise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author balajisoundarrajan
 * Count the word using in the given sentence using hashmap
 * Iterate the map using while and for
 */
public class CountWordUsingMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String str = "Yashika Balaji is a good Girl! Yashike went to tamil class her mother name is Deepa and father name is Balaji";
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		String[] strArray = str.split(" " );
		
		for(int i=0; i< strArray.length; i++) {
			if(hashMap.containsKey(strArray[i])) {
				hashMap.put(strArray[i], hashMap.get(strArray[i]) + 1);
			}else {
				hashMap.put(strArray[i], 1);
			}
		}
		
		for(Map.Entry<String, Integer> mapEntry : hashMap.entrySet()) {
			System.out.println(mapEntry.getKey() + " occured " + mapEntry.getValue() + " times");
		}
		
		Iterator<Map.Entry<String, Integer>> iterator = hashMap.entrySet().iterator();
		while(iterator.hasNext()) {
			Map.Entry<String, Integer> mapEntry = iterator.next();
			System.out.println(mapEntry.getKey() + " occured " + mapEntry.getValue() + " times");
		}

	}

}
