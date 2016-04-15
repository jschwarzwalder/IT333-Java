package edu.greenriver.it.printLots;

import java.util.Collection;
import java.util.Iterator;

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
 * @version 1.0
 */
public class PrintLots {

	public static <E> void main(String[] args) {
		// Testing code
		
		Collection<E> Inputs = new Collection(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		List<E> Test1 = new List(1,2,3);
		List<E> Test2 = new List(7,8,9);

		printLots (Inputs, Test1);
		printLots (Inputs, Test2);
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
			//create iterator for the input List
			Iterator<E> inputListIterator = inputList.iterator();
			//go through each element in list and see if it is contained in position.
			//if is print
			if (inputListIterator.hasNext()){
				Object currentValue = inputListIterator.next();
				if (positions.contains(currentValue)){
					System.out.println(currentValue);
				}
			}
		}
			
			
	}

}

