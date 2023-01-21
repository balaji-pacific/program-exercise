/**
 * 
 */
package com.java.programs.exercise.practice.one;

/**
 * @author Balaji Soundarrajan
 *
 */
public class RomanToInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String roman = "MMMDCCXXIV";
		System.out.println("Value of Roman " + roman + " is " + romanToInteger(roman));
		

	}
	
	public static Integer romanToInteger(String romanString) {
		
		int answer = 0, number =0;
		for(int i=romanString.length() - 1; i>=0; i--) {
			switch(romanString.charAt(i)) {
			
			case 'I' :
				number = 1;
				break;
			case 'V' :
				number = 5;
				break;
			case 'X' :
				number = 10;
				break;
			case 'L' :
				number = 50;
				break;
			case 'C' :
				number = 100;
				break;
			case 'D' :
				number = 500;
				break;
			case 'M' :
				number = 1000;
				break;
			}
			if(4 * number < answer) {
				answer = answer - number;
			}else {
				answer = answer + number;
			}
		}
		return answer;
		
	}

}
