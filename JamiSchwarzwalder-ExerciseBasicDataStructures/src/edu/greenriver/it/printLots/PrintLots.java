package edu.greenriver.it.printLots;

import java.util.Collection;

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
     *
     * @param inputList a list of elements
     * @param positions a list of integers specifying positions in L
     * 					sorted in ascending order
     * @return none
     * 
     */
	
	public static void printLots( Collection<E> inputList,  Collection<E> positions){
		for (i = 0; i < positions.size; i++);
			System.out.println(inputList[positions[i]]);
	}

}
