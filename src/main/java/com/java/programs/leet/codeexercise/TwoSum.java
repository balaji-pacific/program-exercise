/**
 * 
 */
package com.java.programs.leet.codeexercise;

/**
 * 
 * This code is for finding the sum of two places in an array and till the sum is become the target value
 * @author Balaji Soundarrajan
 *
 */
public class TwoSum {
	
	public int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        for(int i=0;i<nums.length; i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i] + nums[j] == target) {
					System.out.println("Because nums["+i+"]" + " and nums["+j+"] is " + target);
                    output[0] = i;
                    output[1] = j;
                    break;
				}
			}
		}
        return output;
    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] nums = {3,3}; int target = 6;
		TwoSum sum = new TwoSum();
		int[] output = sum.twoSum(nums, target);
		
		for(int i:output) {
			System.out.println(i);
		}
	}

}
