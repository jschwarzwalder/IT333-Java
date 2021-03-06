package edu.greenriver.it.kthlargest;

import java.util.Arrays;


/*
 * Jami Schwarzwalder
 * 3/27/2016
 * KthLargest.java
 * Exercises - Introduction
 * Write a program to solve the selection problem, for k = n\2, as described on page one of your textbook.
 */

/**
 * This class is a solution for the selection problem k = n / 2
 *
 * @author Jami Schwarzwalder
 * @version 1.0
 */
public class TheKthLargest {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        Integer[] test1 = new Integer[] {2, 2, 4, 4, 5, 5, 8, 8, 0};
	        Integer[] test2 = new Integer[] {1, 9, 8, 3, 0, 8, 1, 3, 0};
	        Integer[] test3 = new Integer[] {2, 0, 0, 4, 2, 0, 1, 7, 0};
	        Integer[] test4 = new Integer[] {0, 0, 0, 0, 1, 2, 2, 2, 2};
	        Integer[] test5 = new Integer[] {0, 0, 0, 0, 1, 2, 2, 2};
	        String[] test6 = new String[] {"apple", "banana", "apricot", "axe", "boat"};

	        System.out.println(kthLargest(test1)); // Should be 5
	        System.out.println(kthLargest(test2)); // Should be 3
	        System.out.println(kthLargest(test3)); // Should be 2
	        System.out.println(kthLargest(test4)); // Should be 2
	        System.out.println(kthLargest(test5)); // Should be 1
	        System.out.println(kthLargest(test6)); // Should be banana
	    }

	/**
     * Returns the kth largest element 
     * where k is the length of the list divided by 2
     *
     * @param list the list of integers to search
     * @returns the kth largest element
     */
	public static <T extends Comparable<T>> T kthLargest ( T[] list){
        //make an array with length of K
        int inputLength = list.length;
        int medianPosition = inputLength/2;

        if (inputLength < 1){
            return null;
        }
        if (inputLength == 1){
            return list[0];
        }
        
       @SuppressWarnings("unchecked")  
       T[] highestValues = (T[])new Comparable[medianPosition];
        for (int i = 0; i < medianPosition; i++){
            highestValues[i] = list[i];
        }

        //sort K array - smallest first
        Arrays.sort(highestValues);

        //read in rest of input and add to array
        //if value is not smaller than the 0 element add it into array in order.
        // remove element at index 0 to make room

        for (int i = medianPosition; i < inputLength; i++){
            if (highestValues[0].compareTo(list[i]) < 0 ){
                //if list[i] is smaller than or equal to highestValue[j] check next value in list
                // otherwise find where it goes in order
                for (int j = 1; j < medianPosition; j++){
                  //compare to index j(start at 1)
                    if (list[i].compareTo(highestValues[j]) > 0 ) {
                        //if list[1] is greater than highestValue[j]
                        //then move highestValue[j] to highestValue[j-1]
                        highestValues[j-1] = highestValues[j];
                    } else {
                        //if list[i] is equal or less than highestValue[j]
                        // add value from list[i] in that spot.
                        highestValues[j-1]= list[i];
                        //Check next number in list
                        break;
                    }
                }
                //check if list[i] is bigger than the last value in highestValues
                if (list[i].compareTo(highestValues[medianPosition-1]) > 0 ) {
                    highestValues[medianPosition-1] = list[i];
                }
            }
        } //all of list has been added to highestValue in order
        //highestValue[0] should be the kth largest element

        return highestValues[0];





    }
}