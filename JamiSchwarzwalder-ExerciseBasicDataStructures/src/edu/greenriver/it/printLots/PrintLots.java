package edu.greenriver.it.printLots;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

/*
 * Jami Schwarzwalder
 * 4/14/2016
 * PrintLots.java
 * Exercises - Basic Data Structures
 *  You are given a list, L, and another list, P, containing integers sorted in ascending order. 
 *  The operation printLots(L, P) will print the elements in L that are in positions specified by P. 
 *  For instance, if P = 1, 3, 4, 6, the elements in positions 1, 2, 4, and 6 in L are printed.
 *  
 *  1b) Running time of the procedure is Length of L * Length of P ie Omega n and BigOh n^2
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
		
		ArrayList<Integer> arrayInputs = new ArrayList<Integer>();
		for (int i=1; i < 10; i++){
			arrayInputs.add(i);
		}
		LinkedList<Integer> linkedInputs = new LinkedList<Integer>();
		for (int i=1; i < 10; i++){
			linkedInputs.add(i);
		}
		
		ArrayList<Integer> test1 = new ArrayList<Integer> (3);
		test1.add(1);
		test1.add(3);
		test1.add(5);
		ArrayList<Integer> test2 = new ArrayList<Integer> (3);
		test2.add(7);
		test2.add(8);
		test2.add(9);
		ArrayList<Integer> test3 = new ArrayList<Integer> ();
		for (int i=1; i < 10; i++){
			test3.add(i);
		}
		LinkedList<Integer> test4 = new LinkedList<Integer>();
		test4.add(1);
		test4.add(3);
		test4.add(5);
		LinkedList<Integer> test5 = new LinkedList<Integer>();
		test5.add(7);
		test5.add(8);
		test5.add(9);
		LinkedList<Integer> test6 = new LinkedList<Integer> ();
		for (int i=1; i < 10; i++){
			test6.add(i);
		}

		System.out.println("ArrayList Test1: ");
		printLots (arrayInputs, test1);
		System.out.println("ArrayList Test2: ");
		printLots (arrayInputs, test2);
		System.out.println("ArrayList Test3: ");
		printLots (arrayInputs, test3);
		System.out.println("ArrayList Test4: ");
		printLots (arrayInputs, test4);
		System.out.println("ArrayList Test5: ");
		printLots (arrayInputs, test5);
		System.out.println("ArrayList Test6: ");
		printLots (arrayInputs, test6);
		System.out.println("LinkedList Test1: ");
		printLots (linkedInputs, test1);
		System.out.println("LinkedList Test2: ");
		printLots (linkedInputs, test2);
		System.out.println("LinkedList Test3: ");
		printLots (linkedInputs, test3);
		System.out.println("LinkedList Test4: ");
		printLots (linkedInputs, test4);
		System.out.println("LinkedList Test5: ");
		printLots (linkedInputs, test5);
		System.out.println("LinkedList Test6: ");
		printLots (linkedInputs, test6);
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
	//1b O(L.length*P.length) 
	public static <E> void printLots( Collection<E> inputList,  Collection<E> positions){
		if ((!positions.isEmpty()) && (!inputList.isEmpty())){
			//create a count for the current position
			int indexOf = 0;
			//create iterator for the input List
			for (E currentValue: inputList){
				//go through each element in list and see if it is contained in position.
				//if is print
				indexOf ++;
				
				if (positions.contains(indexOf)){
					System.out.print(currentValue);
					System.out.print(" ");
				}
			}
		}
		System.out.println();
	}		
			
}



