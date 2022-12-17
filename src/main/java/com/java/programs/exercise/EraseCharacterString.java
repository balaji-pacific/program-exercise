/**
 * 
 */
package com.java.programs.exercise;

/**
 * @author balajisoundarrajan
 * 
 * Can you write a method that will erase any character from a string?
 *
 */
public class EraseCharacterString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String str = "Tamil is a very good Language";
		char ch = 'a';
		StringBuffer sb = new StringBuffer();
		
		for(int i=0;i<str.length();i++) {
			if(ch != str.charAt(i)) {
				sb.append(str.charAt(i));
			}
		}
		System.out.println(sb.toString());

	}

}
