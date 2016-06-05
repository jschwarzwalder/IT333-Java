package edu.greenriver.it.sorting;

import java.util.Arrays;

public abstract class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] testArray = {1, 6, 5, 7, -1, 8};
		merge(testArray, 0, 1, 2, 3, 4, 5);
		
		System.out.println(Arrays.toString(testArray));
		
		testArray = new Integer[]{1, 2, 3, 4, 5, 6};
		merge(testArray, 0, 1, 2, 3, 4, 5);
		
		System.out.println(Arrays.toString(testArray));
		
		testArray = new Integer[]{6, 5, 4, 3, 2, 1};
		merge(testArray, 0, 1, 2, 3, 4, 5);
		
		System.out.println(Arrays.toString(testArray));
		
		testArray = new Integer[]{5, 6, 3, 4, 1, 2};
		merge(testArray, 0, 1, 2, 3, 4, 5);
		
		System.out.println(Arrays.toString(testArray));
		
		String[] strings = {"a", "z", "b", "y", "c", "w"};
		merge(strings, 0, 1, 2, 3, 4, 5);
		
		System.out.println(Arrays.toString(strings));
		
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
		if (first == null || second == null || third == null)
		{
			throw new NullPointerException("Cannot sort arrays containing null");
		}

		while (third != null) {
			if (first.compareTo(second) < 0) { // first is smaller
				if (first.compareTo(third) < 0) { // first is smallest
					tempArray[insertIndex] = first;
					insertIndex++;
					if (end1 > start1) {
						start1++;
						first = input[start1];
						if (first == null)
						{
							throw new NullPointerException("Cannot sort arrays containing null");
						}
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
						if (third == null)
						{
							throw new NullPointerException("Cannot sort arrays containing null");
						}
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
					if (second == null)
					{
						throw new NullPointerException("Cannot sort arrays containing null");
					}
				} else // second subarray is empty, 
						//so make subarray 3 subarray 2
				{
					start2 = start3;
					end2 = end3;
					second = third;
					third = null;
				}
			} else { // third is smallest
				tempArray[insertIndex] = third;
				insertIndex++;
				if (end3 > start3) {
					start3++;
					third = input[start3];
					if (third == null)
					{
						throw new NullPointerException("Cannot sort arrays containing null");
					}
				} else // third subarray is empty
				{
					third = null;
				}
			}
		}

		while (second != null && third == null)
		{
			if (first.compareTo(second) < 0) // first is smaller
			{
				tempArray[insertIndex] = first;
				insertIndex++;
				if (end1 > start1)
				{
					start1++;
					first = input[start1];
					if (first == null)
					{
						throw new NullPointerException("Cannot sort arrays containing null");
					}
				}
				else
				{
					start1 = start2;
					end1 = end2;
					first = second;
					second = null;
				}
			}
			else //second is smaller
			{
				tempArray[insertIndex] = second;
				insertIndex++;
				if (end2 > start2)
				{
					start2++;
					second = input[start2];
					if (second == null)
					{
						throw new NullPointerException("Cannot sort arrays containing null");
					}
				}
				else
				{
					second = null;
				}
			}
		}
		
		
		
		
		// continue adding the lowest element until 2 subarrays have no elements
		// left to be merged
		// add remaining elements from last subarray
		for(int i = start1; i <= end1; i++)
		{
			tempArray[insertIndex] = input[i];
			insertIndex++;
		}
		// copy temporary array into input
		
		int tempIndex = 0;
		for (int i = low1; i <= high1; i++)
		{
			input[i] = tempArray[tempIndex];
			++tempIndex;
		}
		for (int i = low2; i <= high2; i++)
		{
			input[i] = tempArray[tempIndex];
			++tempIndex;
		}
		for (int i = low3; i <= high3; i++)
		{
			input[i] = tempArray[tempIndex];
			++tempIndex;
		}

	}
}
