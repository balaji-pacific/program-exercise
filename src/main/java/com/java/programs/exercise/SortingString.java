/**
 * 
 */
package com.java.programs.exercise;

/**
 * @author balajisoundarrajan
 *
 */
public class SortingString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String str = "soundarrajankamalavasuki";
		char[] ch = str.toCharArray();
		for(int i = 0;i < ch.length; i++) {
			for(int j=i; j< ch.length; j++) {
				if(ch[i] < ch[j]) {
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
		
		for(char c : ch) {
			System.out.print(c);
		}

	}

}
