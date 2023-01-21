/**
 * 
 */
package com.java.programs.leet.codeexercise;

/**
 * @author Balaji Soundarrajan
 *
 */
public class PalindromNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		PalindromNumber number = new PalindromNumber();
		System.out.println(number.isPalindrome1(121));

	}

	public boolean isPalindrome(int x) {

		int reverse = 0;
		int temp = x;
		while (temp != 0) {
			int digit = temp % 10;
			reverse = reverse * 10 + digit;
			temp = temp / 10;
		}

		if (x == reverse) {
			return true;
		} else {
			return false;
		}

	}

	public boolean isPalindrome1(int x) {
		
		String actual = String.valueOf(x);
		StringBuffer sb = new StringBuffer();
		for(int i=actual.length()-1; i>=0;i--) {
			sb.append(actual.charAt(i));
		}
		if(sb.toString().equals(actual)) {
			return true;
		}else {
			return false;
		}
		
	}	

}
