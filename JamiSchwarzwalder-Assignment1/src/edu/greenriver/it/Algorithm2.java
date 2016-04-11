/**
 * 
 */
package edu.greenriver.it;

import java.util.Arrays;
import java.util.Random;

/*
 * Jami Schwarzwalder
 * 4/10/2016
 * Algorithm1.java
 * Assignment #2 - Algorithm Analysis
 * 
 * Fill the array a from a[0] to a[n-1] as follows: To fill a[i], 
 * generate random numbers until you get one that is not already in a[0], a[1], … a[i-1].
 * 
 * Same as algorithm (1), but keep an extra array called the used 
 * When a random number, ran, is first put in the array a, set used[ran] = true. 
 * 
 * This means that when filling a[i] with a random number, 
 * you can test in one step to see whether the random number has been used, 
 * instead of the (possibly) i steps in the first algorithm.
 */

/**
 * @author Jami Schwarzwalder
 * @version 1.0
 */

public class Algorithm2 {
	//count the number of operations in each execution
	private static int count = 0;
	
	public static void main(String[] args) {
		// testing the algorithm
		System.out.println(Arrays.toString(randomInts(1)));
		System.out.println(Arrays.toString(randomInts(2)));
		System.out.println(Arrays.toString(randomInts(10)));
		
		int[] input = {25000, 50000, 100000, 200000, 400000, 800000};
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
		//Create array to store integers					//Big Oh = n^2
		int[] randomInts = new int[lengthOfArray]; 			//c * lengthofArray
		Random randomInt = new Random (); 					//1
		boolean[] used = new boolean[lengthOfArray];		//c * lengthofArray
		//for each element in the array, generate a random integer
		for (int i = 0; i < lengthOfArray; i++){ 			//lenghtofArray *
			int number = randomInt.nextInt(lengthOfArray);	//1
			while (used[number]) {								//lenghtofArray 
				//if int is already in the array then generate a new int
				number = randomInt.nextInt(lengthOfArray);		//1
			}	
			randomInts[i]=number;								//2
			used[number] = true;
			
		}
		
		return randomInts;										//1
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
		boolean[] used = new boolean[lengthOfArray];
		count += lengthOfArray;
		Random randomInt = new Random (); 					
		//for each element in the array, generate a random integer
		for (int i = 0; i < lengthOfArray; i++){ 			
			int number = randomInt.nextInt(lengthOfArray);	
			count++;
			while (used[number]) {				
				//if int is already in the array then generate a new int
				number = randomInt.nextInt(lengthOfArray);	
				count++;
			}	
			randomInts[i]=number;
			count++;
			used[number] = true;
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
