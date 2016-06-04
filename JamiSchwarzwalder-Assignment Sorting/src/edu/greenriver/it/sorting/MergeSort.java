package edu.greenriver.it.sorting;

import java.util.Arrays;

public abstract class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] testArray = {1, 6, 5, 7, -1, 8};
		merge(testArray, 0, 1, 2, 3, 4, 5);
	}

	/**
	 * Takes a subarray and returns the elements in sorted order
	 * 
	 * @param input
	 *            the array to be sorted
	 * @param begin
	 *            index where subarray to be sorted begins
	 * @param end
	 *            index where subarray to be sorted ends (inclusive)
	 * @return the array with elements in subarray sorted into correct order
	 */
	public static <T extends Comparable<T>> void mergeSort(T[] input, int begin, int end) {
		// if more than 3 elements then break it up into smaller arrays and call
		// recursively on each smaller array

		// if subarray has two elements swap if out of order

		// if subarray has one element return

	}

	private static <T extends Comparable<T>> void merge(T[] input, int low1, int high1, 
																	int low2, int high2, 
																	int low3, int high3) {
		// get length of subarrays 1,2, and 3.
		int tempArrayLength = (high1 - low1) + (high2 - low2) + (high3 - low3) + 3;
		// build temporary array the length of all
		@SuppressWarnings("unchecked")
		T[] tempArray = (T[]) new Comparable[tempArrayLength];
		int insertIndex = 0;
		// compare the element at the beginning of subarrays 1,2, and 3
		int start1 = low1;
		int end1 = high1;
		int start2 = low2;
		int end2 = high2;
		int start3 = low3;
		int end3 = high3;

		T first = input[start1];
		T second = input[start2];
		T third = input[start3];

		while (third != null) {
			if (first.compareTo(second) < 0) { // first is smaller
				if (first.compareTo(third) < 0) { // first is smallest
					tempArray[insertIndex] = first;
					insertIndex++;
					if (end1 > start1) {
						start1++;
						first = input[start1];
					} else // first subarray is empty, 
							//so make subarray 3 subarray 1
					{
						start1 = start3;
						end1 = end3;
						first = third;
						third = null;
					}
				} else { // third is smallest
					tempArray[insertIndex] = third;
					insertIndex++;
					if (end3 > start3) {
						start3++;
						third = input[start3];
					} else // third subarray is empty
					{
						third = null;
					}
				}
			} else if (second.compareTo(third) < 0) { // second is smallest
				tempArray[insertIndex] = second;
				insertIndex++;
				if (end2 > start2) {
					start2++;
					second = input[start2];
				} else // second subarray is empty, 
						//so make subarray 3 subarray 2
				{
					start2 = start3;
					end1 = end3;
					second = third;
					third = null;
				}
			} else { // third is smallest
				tempArray[insertIndex] = third;
				insertIndex++;
				if (end3 > start3) {
					start3++;
					third = input[start3];
				} else // third subarray is empty
				{
					third = null;
				}
			}
		}

		// continue adding the lowest element until 2 subarrays have no elements
		// left to be merged
		// add remaining elements from last subarray
		// copy temporary array into input
		System.out.println(Arrays.toString(tempArray));
	}
}
