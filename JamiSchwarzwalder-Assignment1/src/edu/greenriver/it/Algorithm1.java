/**
 * 
 */
package edu.greenriver.it;

import java.util.Arrays;
import java.util.Random;

/*
 * Jami Schwarzwalder
 * 4/9/2016
 * Algorithm1.java
 * Assignment #1 - Algorithm Analysis
 * 
 * Fill the array a from a[0] to a[n-1] as follows: To fill a[i], 
 * generate random numbers until you get one that is not already in a[0], a[1], … a[i-1].
 */

/**
 * @author Jami Schwarzwalder
 * @version 1.0
 */

public class Algorithm1 {

	
	public static void main(String[] args) {
		// testing the algorithm
		System.out.println(Arrays.toString(randomInts(1)));
		System.out.println(Arrays.toString(randomInts(2)));
		System.out.println(Arrays.toString(randomInts(10)));

	}
	
	/**
     * Returns random permutation of the first N integers
     *
     * @param lengthOfArray length of array to be returned 
     * @returns an array of integers the length lengthOfArray
     *  			ordered randomly
     */
	public static int[] randomInts (int lengthOfArray){
		//Create array to store integers
		int[] randomInts = new int[lengthOfArray];
		Random randomInt = new Random ();
		//for each element in the array, generate a random integer
		for (int i = 0; i < lengthOfArray; i++){
			int number = randomInt.nextInt(lengthOfArray);
			while (inArray(randomInts, i, number)) {
				//if int is already in the array then generate a new int
				number = randomInt.nextInt(lengthOfArray);
			}	
			if (!inArray(randomInts, i, number)){
				randomInts[i]=number;
			}
		}
		
		return randomInts;
	}
	
	/**
     * Searches given array to see if value is inside.
     *
     * @param array an array of numbers 
     * @param currentIndex last index to check value in array 
     * @param value a number 
     * @returns  whether value is in array
     */
	private static boolean inArray(int[] array, int currentIndex, int value){
		//search array, if value in array return true
		for (int i = 0; i< currentIndex; i++){
			if (value == array[i] ){
				return true;
			}
		}
		
		//if not in array return false
		return false;
	}

}
