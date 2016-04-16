package edu.greenriver.it.printLots;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

/*
 * Jami Schwarzwalder
 * 4/14/2016
 * PrintLots.java
 * Exercises - Basic Data Structures
 *  You are given a list, L, and another list, P, containing integers sorted in ascending order. 
 *  The operation printLots(L, P) will print the elements in L that are in positions specified by P. 
 *  For instance, if P = 1, 3, 4, 6, the elements in positions 1, 2, 4, and 6 in L are printed.
 */

/**
 * The operation printLots(L, P) 
 * will print the elements in L 
 * that are in positions specified by P
 *
 * @author Jami Schwarzwalder
 * @version 2.0
 */
public class PrintLots {

	public static void main(String[] args) {
		// Testing code
		
		ArrayList<Integer> ArrayInputs = new ArrayList<Integer>();
		LinkedList<Integer> LinkedInputs = new LinkedList<Integer>();
		for (int i=1; i < 10; i++){
			LinkedInputs.add(i);
		}
		
		ArrayList<Integer> Test1 = new ArrayList<Integer> (3);
		Test1.add(1);
		Test1.add(2);
		Test1.add(3);
		ArrayList<Integer> Test2 = new ArrayList<Integer> (3);
		Test2.add(7);
		Test2.add(8);
		Test2.add(9);
		ArrayList<Integer> Test3 = new ArrayList<Integer> ();
		LinkedList<Integer> Test4 = new LinkedList<Integer>();
		Test4.add(1);
		Test4.add(2);
		Test4.add(3);
		LinkedList<Integer> Test5 = new LinkedList<Integer>();
		Test5.add(7);
		Test5.add(8);
		Test5.add(9);
		LinkedList<Integer> Test6 = new LinkedList<Integer> ();
		for (int i=1; i < 10; i++){
			Test6.add(i);
		}

		System.out.println("ArrayList Test1: ");
		printLots (ArrayInputs, Test1);
		System.out.println("ArrayList Test2: ");
		printLots (ArrayInputs, Test2);
		System.out.println("ArrayList Test3: ");
		printLots (ArrayInputs, Test3);
		System.out.println("ArrayList Test4: ");
		printLots (ArrayInputs, Test4);
		System.out.println("ArrayList Test5: ");
		printLots (ArrayInputs, Test5);
		System.out.println("ArrayList Test6: ");
		printLots (ArrayInputs, Test6);
		System.out.println("LinkedList Test1: ");
		printLots (LinkedInputs, Test1);
		System.out.println("LinkedList Test2: ");
		printLots (LinkedInputs, Test2);
		System.out.println("LinkedList Test3: ");
		printLots (LinkedInputs, Test3);
		System.out.println("LinkedList Test4: ");
		printLots (LinkedInputs, Test4);
		System.out.println("LinkedList Test5: ");
		printLots (LinkedInputs, Test5);
		System.out.println("LinkedList Test6: ");
		printLots (LinkedInputs, Test6);
	}
	
	/**
     * Prints the elements in L that are in positions specified by P
	 * @param <E>
     *
     * @param inputList a list of elements
     * @param positions a list of integers specifying positions in L
     * 					sorted in ascending order
     * @return none
     * 
     */
	
	public static <E> void printLots( Collection<E> inputList,  Collection<E> positions){
		if ((!positions.isEmpty()) && (!inputList.isEmpty())){
			//create a count for the current position
			int indexOf = 0;
			//create iterator for the input List
			for (E currentValue: inputList)
				//go through each element in list and see if it is contained in position.
				//if is print
				indexOf ++;
				
				if (positions.contains(indexOf)){
					System.out.print(currentValue);
				}
				
		}
		System.out.println();
	}		
			
}



