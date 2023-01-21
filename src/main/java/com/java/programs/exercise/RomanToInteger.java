/**
 * 
 */
package com.java.programs.exercise;

/**
 * @author Balaji Soundarrajan
 *
 */
public class RomanToInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(romanToInt("IV"));

	}
	
    public static int romanToInt(String S) {
        int ans = 0, num = 0;
        for (int i = S.length()-1; i >= 0; i--) {
            switch(S.charAt(i)) {
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }
            if(3 * num < ans) {
            	ans = ans - num;
            }else {
            	ans = ans + num;
            }
        }
        return ans;
    }

}
