/**
 * 
 */
package com.java.programs.exercise;

/**
 * @author balajisoundarrajan
 * Can you find duplicate numbers in an array?
 *
 */
public class FindDuplicateNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Integer[] intArray = new Integer[100];
		
		for(int i=0;i<100;i++) {
			intArray[i] = getRandomValue();
		}
		
		for(int i=0;i<intArray.length;i++) {
			for(int j=1;j<intArray.length;j++) {
				if(j!=i && intArray[j] == intArray[i]) {
					System.out.println(intArray[j]);
				}
			}
		}
		
		
	}
	
	
	public static int getRandomValue() {
		return (int) (Math.random()*100);
	}

}
