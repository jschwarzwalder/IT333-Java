package edu.greenriver.it.reverseList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


/*
 * Jami Schwarzwalder
 * 4/15/2016
 * ReverseList.java
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
	
	public static void main(String[] args) {
		ArrayList<Integer> test1 = new ArrayList<Integer> (3);
		test1.add(1);
		test1.add(3);
		test1.add(5);
		ArrayList<Integer> test2 = new ArrayList<Integer> (3);
		test2.add(1);
		test2.add(2);
		test2.add(3);
		test2.add(4);
		ArrayList<Integer> test3 = new ArrayList<Integer> ();
		for (int i=1; i < 10; i++){
			test3.add(i);
		}
		LinkedList<Integer> test4 = new LinkedList<Integer>();
		test4.add(1);
		test4.add(3);
		test4.add(5);
		LinkedList<Integer> test5 = new LinkedList<Integer>();
		test5.add(1);
		test5.add(2);
		test5.add(3);
		test5.add(4);
		LinkedList<Integer> test6 = new LinkedList<Integer> ();
		for (int i=1; i < 10; i++){
			test6.add(i);
		}
		ArrayList<Integer> test7 = new ArrayList<Integer> (3);
		ArrayList<Integer> test8 = new ArrayList<Integer> (3);
		test8.add(1);
		LinkedList<Integer> test9 = new LinkedList<Integer> ();
		LinkedList<Integer> test10 = new LinkedList<Integer> ();
		test10.add(1);
		
		
		System.out.println("ArrayList Test1: ");
		System.out.println(reverseList(test1));
		System.out.println("ArrayList Test2: ");
		System.out.println(reverseList(test2));
		System.out.println("ArrayList Test3: ");
		System.out.println(reverseList(test3));
		System.out.println("ArrayList Test7(Empty): ");
		System.out.println(reverseList(test7));
		System.out.println("ArrayList Test8: ");
		System.out.println(reverseList(test8));
		System.out.println("LinkedList Test4: ");
		System.out.println(reverseList(test4));
		System.out.println("LinkedList Test5: ");
		System.out.println(reverseList(test5));
		System.out.println("LinkedList Test6: ");
		System.out.println(reverseList(test6));
		System.out.println("LinkedList Test9(Empty): ");
		System.out.println(reverseList(test9));
		System.out.println("LinkedList Test10: ");
		System.out.println(reverseList(test10));
	}
	
	/**
     * Returns a list in reverse order
     * 
	 * @param <E> Type in the List
     * @param inputList a list of elements
     * @return none a list of elements in reverse order
     * 
     */
	
	public static <E> List<E> reverseList(List<E> inputList){
		if ((inputList.isEmpty()) && (inputList.size()==1)){
			//if input list is empty or has only one item just return
			return inputList;
		}  else {
			//if input list has values store length of list
			int endPointer = inputList.size()-1;
			for (int i = 0; i < endPointer; i++){
				//go through the list and switch the left element with the right element
				E frontTemp = inputList.get(i); //left most not switched
				E endTemp = inputList.get(endPointer); //right most not switched
				inputList.set(i, endTemp );
				inputList.set(endPointer, frontTemp);
				//after switching reduce the endPointer by 1
				endPointer --;
				
			}
			return inputList;
		}
	
	}

}
