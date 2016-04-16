package edu.greenriver.it.reverseList;

import java.awt.List;


/*
 * Jami Schwarzwalder
 * 4/14/2016
 * PrintLots.java
 * Exercises - Basic Data Structures
 *  Write a method that accepts a List object (using the List interface) 
 *  and returns the list in reverse order (your return type should be List). 
 *  
 *  You should not create any other data structure or array. 
 *  You should write the routine only using methods from the List interface.
 *  
 */

/**
 * Returns list in reverse order
 * 
 * @author Jami Schwarzwalder
 * @version 1.0
 */

public class ReverseList {
	
	/**
     * Returns a list in reverse order
     * 
	 * @param <E> Type in the List
     * @param inputList a list of elements
     * @return none a list of elements in reverse order
     * 
     */
	
	public static List reverseList(List inputList){
		if ((((Object) inputList).isEmpty()) && (inputList.size()==1)){
			//if input list is empty or has only one item just return
			return inputList;
		}  else {
			int endPointer = inputList.size();
			for (int i = 0; i <= endPointer; i++){
				E frontTemp = inputList.get(i);
				E endTemp = inputList.get(endPointer);
				inputList.set(i, endTemp );
				inputList.set(endPointer, frontTemp);
				endPointer --;
				
			}
		}
	
	}

}
