package edu.greenriver.it.sorting;

import java.util.Arrays;
import java.util.Random;

public abstract class MergeSortTest {

	private static Random rand = new Random();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] ints = new Integer[0];
		testArray(ints);

		ints = new Integer[] { 8, 3 };
		testArray(ints);

		String[] strings = new String[] { "a", "z", "w", "b" };
		testArray(strings);

		Boolean[] bools = new Boolean[] { true, false, true, false, true };
		testArray(bools);

		Character[] chars = new Character[] { 'm', 'n', 'l', 'a', 'e', 'i' };
		testArray(chars);

		strings = new String[] { "four", "words", "all", "uppercase" };
		testArray(strings);

		ints = new Integer[] { 7, 7, 7, 7, 7, 7, 7, 7, 7, 7 };
		testArray(ints);

		ints = new Integer[] { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		testArray(ints);

		System.out.println("Generate array of 100 random integers");
		ints = generateRandomArray(100);
		System.out.print("is sorted? ");
		System.out.println(testRandom(ints));
		System.out.print("Merge, is sorted? ");
		MergeSort.mergeSort(ints);
		System.out.println(testRandom(ints));
		System.out.println("");
		System.out.println("");

		System.out.println("Generate array of 1000 random integers");
		ints = generateRandomArray(1000);
		System.out.print("is sorted? ");
		System.out.println(testRandom(ints));
		System.out.print("Merge, is sorted? ");
		MergeSort.mergeSort(ints);
		System.out.println(testRandom(ints));
		System.out.println("");
		System.out.println("");

		System.out.println("Generate array of 10,000 random integers");
		ints = generateRandomArray(10000);
		System.out.print("is sorted? ");
		System.out.println(testRandom(ints));
		System.out.print("Merge, is sorted? ");
		MergeSort.mergeSort(ints);
		System.out.println(testRandom(ints));
		System.out.println("");
		System.out.println("");

		System.out.println("Generate array of 100,000 random integers");
		ints = generateRandomArray(100000);
		System.out.print("is sorted? ");
		System.out.println(testRandom(ints));
		System.out.print("Merge, is sorted? ");
		MergeSort.mergeSort(ints);
		System.out.println(testRandom(ints));
		System.out.println("");
		System.out.println("");

	}

	private static <T extends Comparable<T>> void testArray(T[] array) {
		System.out.print("Testing ");
		System.out.println(Arrays.toString(array));
		System.out.println("Merging...");
		MergeSort.mergeSort(array);
		System.out.println(Arrays.toString(array));
		System.out.println("");
		System.out.println("");

	}

	private static Integer[] generateRandomArray(int size) {
		Integer[] randArray = new Integer[size];

		for (int i = 0; i < size; i++) {
			randArray[i] = rand.nextInt();
		}

		return randArray;
	}

	private static boolean testRandom(Integer[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i].compareTo(array[i + 1]) > 0) {
				return false;
			}
		}

		return true;
	}

}
