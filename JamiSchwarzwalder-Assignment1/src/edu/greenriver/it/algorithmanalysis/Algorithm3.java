/**
 * 
 */
package edu.greenriver.it.algorithmanalysis;

import java.util.Arrays;
import java.util.Random;

/*
 * Jami Schwarzwalder
 * 4/10/2016
 * Algorithm1.java
 * Assignment #3 - Algorithm Analysis
 * 
 * Fill the array such that a[i] = i +1. Then:
 * 
 * 	for(int i = 1; i < n; i++)
 * 	{
 * 	    swapElements(a[i], a[randint(0, i)]);
 * 	}
 */

/**
 * @author Jami Schwarzwalder
 * @version 3.0
 */

public class Algorithm3 {
	
	public static void main(String[] args) {
		// testing the algorithm
		System.out.println(Arrays.toString(randomInts(1)));
		System.out.println(Arrays.toString(randomInts(2)));
		System.out.println(Arrays.toString(randomInts(10)));
		
		int[] input = {250, 500, 1000, 2000, 25000, 50000, 100000, 200000, 400000, 800000, 1600000, 3200000, 6400000};
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
	//This algorithm runs with a Big Oh T(n)= O(n) 
	// n for the assignment of a random value into the array
	public static int[] randomInts (int lengthOfArray){
		//Create array to store integers					//Big Oh = n
		int[] randomInts = new int[lengthOfArray]; 			//c 
		Random randomInt = new Random ();
		for (int i = 0; i < lengthOfArray; i++){			// lengthofArray
			randomInts[i]= i+1;
		}
		
		for (int i = 1; i < lengthOfArray; i++){			// lengthofArray
			int number = randomInt.nextInt(i);
			int temp = randomInts[i];
			randomInts[i] = randomInts[number];
			randomInts[number] = temp;
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
		int count = 0;
		//Create array to store integers					
		int[] randomInts = new int[lengthOfArray];
		Random randomInt = new Random ();
		for (int i = 0; i < lengthOfArray; i++){			
			randomInts[i]= i+1;
			count++;
		}
		
		for (int i = 1; i < lengthOfArray; i++){			
			int number = randomInt.nextInt(i);
			int temp = randomInts[i];
			count++;
			randomInts[i] = randomInts[number];
			count += 2;
			randomInts[number] = temp;
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
