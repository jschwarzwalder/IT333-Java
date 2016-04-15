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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
			
			//I want to use the List interface here and use get!
			//Do I need to us iterator
			Iterator<E> position = positions.iterator();
			if (position.hasNext()){
				Iterator<E> inputListIterator = inputList.iterator();
				if inputListIterator.hasNext(){
					
				}
				}	
		}
	}

}

