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
	//count the number of operations in each execution
	private static int count = 0;
	
	public static void main(String[] args) {
		// testing the algorithm
		System.out.println(Arrays.toString(randomInts(1)));
		System.out.println(Arrays.toString(randomInts(2)));
		System.out.println(Arrays.toString(randomInts(10)));
		
		int[] input = {250, 500, 1000, 2000};
		for (int i = 0; i < input.length; i++){
			System.out.print(input[i]);
			System.out.print(" average number of operations: ");
			System.out.print(numOfOperations(input[i]));
			System.out.print(" \n");
		}

	}
	
	/**
     * Returns random permutation of the first N integers
     *
     * @param lengthOfArray length of array to be returned 
     * @returns an array of integers the length lengthOfArray
     *  			ordered randomly
     */
	public static int[] randomInts (int lengthOfArray){
		//Create array to store integers					//Big Oh = n^3
		int[] randomInts = new int[lengthOfArray]; 			//c * lengthofArray
		Random randomInt = new Random (); 					//1
		//for each element in the array, generate a random integer
		for (int i = 0; i < lengthOfArray; i++){ 			//lenghtofArray *
			int number = randomInt.nextInt(lengthOfArray);		//1
			while (inArray(randomInts, i, number)) {			//lenghtofArray * lengthofArray
				//if int is already in the array then generate a new int
				number = randomInt.nextInt(lengthOfArray);		//1
			}	
			randomInts[i]=number;								//2
			
		}
		
		return randomInts;									//1
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
			count ++;
			if (value == array[i] ){
				return true;
			}
		}
		
		//if not in array return false
		return false;
	}
	
	/**
     * Calculates the number of operations for a method that
     * returns random permutation of the first N integers
     *
     * @param lengthOfArray length of array to be returned 
     * @returns int that represents the count of array access
     */
	private static int bigOhOfRandomInts (int lengthOfArray){
		//count will keep track of the number of array access
		//set to 0 each time we create a new array 
		count = 0;
		//Create array to store integers					
		int[] randomInts = new int[lengthOfArray];
		count += lengthOfArray;
		Random randomInt = new Random (); 					
		//for each element in the array, generate a random integer
		for (int i = 0; i < lengthOfArray; i++){ 			
			int number = randomInt.nextInt(lengthOfArray);	
			count++;
			while (inArray(randomInts, i, number)) {			
				//if int is already in the array then generate a new int
				number = randomInt.nextInt(lengthOfArray);	
				count++;
			}	
			randomInts[i]=number;								
			count++;
		}
		
		return count;									
	}

	/**
	 * Returns average number of operations made each execution
	 *
	 * @param lengthOfArray length of array to be returned 
	 * @returns the average number of operations 
	 */
	
	private static int numOfOperations(int inputToArray){
		int numTests = 10;
		int[] numOfOperations = new int[numTests];
		int averageNumOfOperations = 0;
		
		for (int i = 0; i< numTests; i++){
			numOfOperations[i] = bigOhOfRandomInts(inputToArray);
		}
		
		for (int i = 0; i< numTests; i++){
			averageNumOfOperations += numOfOperations[i];
		}
		averageNumOfOperations = averageNumOfOperations/10;
		
		return averageNumOfOperations;
	}
	
}
