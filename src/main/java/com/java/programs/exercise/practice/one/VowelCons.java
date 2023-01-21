/**
 * 
 */
package com.java.programs.exercise.practice.one;

/**
 * @author Balaji Soundarrajan
 *
 */
public class VowelCons {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "WellsFargo";
		int vowel = 0;
		int cons = 0;
		for(int i=0; i<str.length(); i++) {
			char a = str.charAt(i);
			if(isVowel(a)) {
				vowel ++;
			}else if((a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z') && isVowel(a)== false) {
				cons ++;
			}
		}
		
		System.out.println("Vowels " + vowel);
		System.out.println("Consonants " + cons);
		
	}
	
	public static boolean isVowel(char a) {
		if(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' || a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U') {
			return true;
		}else {
			return false;
		}
	}

}
