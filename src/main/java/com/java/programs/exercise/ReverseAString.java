/**
 * 
 */
package com.java.programs.exercise;

/**
 * @author balajisoundarrajan
 * Reverse a String without using String inbuilt method
 *
 */
public class ReverseAString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String str = "Balaji";
		StringBuffer buffer = new StringBuffer();
		for(int i=str.length()-1;i>=0; i--) {
			buffer.append(str.charAt(i));
			System.out.print(str.charAt(i));
		}
		//System.out.println("String reverse : " + buffer.toString());

	}

}
