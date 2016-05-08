package edu.greenriver.edu.lists;

import java.util.Arrays;
import java.util.Iterator;

public class ListTesterPartTwo
{
	public static void main(String[] args)
	{
		//run the tests
		//testAddAll();
		//testInsertAll();
		//testContainsAll();
		testRemoveAll();
		testRetainAll();
		testSubList();
		//testToArray();
		//testToGenericArray();
		testIterator();
	}
	
	public static void testAddAll()
	{
		//this method tests list.addAll(collection)
		LinkedList<Integer> test1a = new LinkedList<Integer>();
		for (int i = 0; i < 10; i++){
			test1a.add(i);
		}
		LinkedList<Integer> test1b = new LinkedList<Integer>();
		for (int i = 10; i < 21; i++){
			test1b.add(i);
		}
		System.out.print("Size:  " );
		System.out.println(test1a.size());
		System.out.print("Is 14 in the list? ");
		System.out.println(test1a.contains(14));
		System.out.println("We add elements ");
		test1a.addAll(test1b);
		System.out.print("Size:  " );
		System.out.println(test1a.size());
		System.out.print("Is 14 in the list? ");
		System.out.println(test1a.contains(14));
	}
	
	public static void testInsertAll()
	{
		//this method tests list.addAll(index, collection)
		LinkedList<Integer> test2a = new LinkedList<Integer>();
		for (int i = 0; i < 10; i++){
			test2a.add(i);
		}
		LinkedList<Integer> test2b = new LinkedList<Integer>();
		for (int j = 10; j < 21; j++){
			test2b.add(j);
		}
		
		LinkedList<Integer> test2c = new LinkedList<Integer>();
		for (int k = -11; k < 0; k++){
			test2c.add(k);
		}
		LinkedList<Integer> test2d = new LinkedList<Integer>();
		for (int l = 100; l < 110; l++){
			test2d.add(l);
		}
		LinkedList<Integer> test2e = new LinkedList<Integer>();
		LinkedList<Integer> test2f = new LinkedList<Integer>();
		
		System.out.print("Size:  " );
		System.out.println(test2a.size());
		System.out.print("Where is 4 located? ");
		System.out.println(test2a.indexOf(4));
		System.out.print("Where is 7 located? ");
		System.out.println(test2a.indexOf(7));
		System.out.println("We add elements starting at index 5 ");
		test2a.addAll(5, test2b);
		System.out.print("Size:  " );
		System.out.println(test2a.size());
		System.out.print("Where is 4 located? ");
		System.out.println(test2a.indexOf(4));
		System.out.print("Where is 7 located? ");
		System.out.println(test2a.indexOf(7));
		
		System.out.println(" ");
		System.out.print("New Test Add at begining ");
		System.out.print("Size:  " );
		System.out.println(test2a.size());
		System.out.print("Does it have -5? ");
		System.out.println(test2a.contains(-5));
		System.out.println("We add elements starting at index 0 ");
		test2a.addAll(0, test2c);
		System.out.print("Size:  " );
		System.out.println(test2a.size());
		System.out.print("Does it have -5? ");
		System.out.println(test2a.contains(-5));
		
		System.out.println(" ");
		System.out.print(" New Test Add at end");
		System.out.print("Size:  " );
		System.out.println(test2a.size());
		System.out.print("Does it have 100? ");
		System.out.println(test2a.contains(100));
		System.out.println("We add elements starting at index test2a.size()");
		test2a.addAll(test2a.size()-1, test2d);
		System.out.print("Size:  " );
		System.out.println(test2a.size());
		System.out.print("Does it have 100? ");
		System.out.println(test2a.contains(100));
		
		System.out.println(" ");
		System.out.print("Does list change if we add an empty list at the begining? ");
		System.out.println(test2a.addAll(0, test2e));
		
		System.out.println(" ");
		System.out.print("Does list change if we add an empty list at the end? ");
		System.out.println(test2a.addAll(test2a.size(), test2f));
	}
	
	public static void testContainsAll()
	{
		//this method tests list.containsAll(collection)
		LinkedList<Integer> test3a = new LinkedList<Integer>();
		for (int i = 0; i < 10; i++){
			test3a.add(i);
		}
		LinkedList<Integer> test3aDup = new LinkedList<Integer>();
		for (int i = 0; i < 10; i++){
			test3aDup.add(i);
		}
		LinkedList<Integer> test3b = new LinkedList<Integer>();
		for (int i = 3; i < 8; i++){
			test3b.add(i);
		}
		LinkedList<Integer> test3c = new LinkedList<Integer>();
		for (int i = 9; i > 2; i--){
			test3c.add(i);
		}
		LinkedList<Integer> test3d = new LinkedList<Integer>();
		for (int i = 0; i > -10 ; i--){
			test3d.add(i);
		}
		LinkedList<Integer> test3e = new LinkedList<Integer>();
		for (int i = 5; i < 20; i++){
			test3e.add(i);
		}
		LinkedList<Integer> test3f = new LinkedList<Integer>();
		
		System.out.println("Build a list 1-10 ");
		System.out.println("Build an identical second list ");
		System.out.print("Do the two lists with the same values return true? ");
		System.out.println(test3a.containsAll(test3aDup));
		System.out.println("Build a list with values 3-8 ");
		System.out.print("Does the first list contain all these values? ");
		System.out.println(test3a.containsAll(test3b));
		System.out.println("Build a list with values 9 to 2 going down ");
		System.out.print("Does the first list contain all these values? ");
		System.out.println(test3a.containsAll(test3c));
		System.out.println("Build a list with values 0 to -10 going down ");
		System.out.print("Does the first list contain all these values? ");
		System.out.println(test3a.containsAll(test3d));
		System.out.println("Build a list with values 5 to 20 ");
		System.out.print("Does the first list contain all these values? ");
		System.out.println(test3a.containsAll(test3e));
		System.out.println("Build an empty list");
		System.out.print("Does the first list contain all these values? ");
		System.out.println(test3a.containsAll(test3f));
	}
	
	public static void testRemoveAll()
	{
		//this method tests list.removeAll(collection)
	}
	
	public static void testRetainAll()
	{
		//this method tests list.retainAll(collection)
	}
	
	public static void testSubList()
	{
		//this method tests list.sublist(from, to)
	}
	
	public static void testToArray()
	{
		//this method tests list.toArray()
		LinkedList<Integer> test7a = new LinkedList<Integer>();
		for (int i = 0; i < 10; i++){
			test7a.add(i);
		}
		
		LinkedList<Integer> test7b = new LinkedList<Integer>();
		for (int i = 10; i > -1; i--){
			test7b.add(i);
		}
		
		LinkedList<Integer> test7c = new LinkedList<Integer>();
		
		System.out.println(test7a);
		System.out.print("List Size:  " );
		System.out.println(test7a.size());
		System.out.println("We print as an array ");
		Object[] arrayTest7a = test7a.toArray();
		System.out.println(Arrays.toString(arrayTest7a));
//		for (int i = 0; i < arrayTest7a.length; i++){
//			System.out.print(arrayTest7a[i] + ", ");
//		}
		System.out.println();
		
		System.out.println(test7b);
		System.out.print("List Size:  " );
		System.out.println(test7b.size());
		System.out.println("We print as an array ");
		Object[] arrayTest7b = test7b.toArray();
		System.out.println(Arrays.toString(arrayTest7b));
//		for (int i = 0; i < arrayTest7b.length; i++){
//			System.out.print(arrayTest7b[i] + ", ");
//		}
		System.out.println();
		
		System.out.println(test7c);
		System.out.print("List Size:  " );
		System.out.println(test7c.size());
		System.out.println("We print as an array ");
		Object[] arrayTest7c = test7c.toArray();
		System.out.println(Arrays.toString(arrayTest7c));
//		for (int i = 0; i < arrayTest7c.length; i++){
//			System.out.print(arrayTest7c[i] + ", ");
//		}
		System.out.println();
		
	}
	
	public static void testToGenericArray()
	{
		//this method tests list.toArray(T[])
		LinkedList<Integer> test8a = new LinkedList<Integer>();
		for (int i = 0; i < 10; i++){
			test8a.add(i);
		}
		
		LinkedList<Integer> test8b = new LinkedList<Integer>();
		for (int i = 10; i > -1; i--){
			test8b.add(i);
		}
		
		LinkedList<String> test8c = new LinkedList<String>();
		for (char i = 'a'; i < 'm'; i++){
			test8c.add(Character.toString(i));
//			System.out.print(i + " = ");
//			System.out.println(Character.toString(i));
		}
		
		Integer[] integer8a = new Integer[10];
		String[] string8a = new String[10];
		
		
		System.out.print("List Size:  " );
		System.out.println(test8a.size());
		System.out.println("We print as an array ");
		Integer[] arrayTest8a = test8a.toArray(integer8a);
		System.out.println(Arrays.toString(arrayTest8a));
		System.out.println();
		System.out.println("We try to convert to a String[] ");
		try {
			String[] arrayTest8b = test8a.toArray(string8a);
			System.out.println(Arrays.toString(arrayTest8b));
			System.out.println("Didn't throw an exception o.0");
		} catch (ArrayStoreException ase){
			System.out.println("Threw an expection " + ase);
		}
		System.out.println();
		
		System.out.print("List Size:  " );
		System.out.println(test8b.size());
		System.out.println("We print as an array ");
		Integer[] arrayTest8 = test8b.toArray(integer8a);
		System.out.println(Arrays.toString(arrayTest8));
		System.out.println();
		
		System.out.print("List Size:  " );
		System.out.println(test8c.size());
		System.out.println("We print as an array ");
		String[] arrayTest8c = test8c.toArray(string8a);
		System.out.println(Arrays.toString(arrayTest8c));
		System.out.println();
		System.out.println("We try to convert to a Integer[] ");
		try {
			Integer[] arrayTest8d = test8c.toArray(integer8a);
			System.out.println(Arrays.toString(arrayTest8d));
			System.out.println("Didn't throw an exception o.0");
		} catch (ArrayStoreException ase){
			System.out.println("Threw an expection " + ase);
		}
		System.out.println();
		
		System.out.println("What if we try to convert to a null array");
		try {
			System.out.println(test8c.toArray(null));
		} catch (NullPointerException npe){
			System.out.println("Threw an exception " + npe);
		}
	}
	
	public static void testIterator()
	{
		//this method tests list.iterator()
		LinkedList<Integer> test9a = new LinkedList<Integer>();
		for (int i = 0; i < 11; i++){
			test9a.add(i);
		}
		
		LinkedList<String> test9b = new LinkedList<String>();
		for (char i = 'a'; i < 'm'; i++){
			test9b.add(Character.toString(i));
		}
		
		for (int num:test9a){
			System.out.print(num + ", ");
		}
		System.out.println();
		
		for (String letter:test9b){
			System.out.print(letter + ", ");
		}
		System.out.println();
		
		Iterator<Integer> interator = test9a.iterator();
		
		System.out.println("Removing the even numbers with .remove()");
		while(interator.hasNext()){
			if (interator.next()%2 == 0){
				interator.remove();
			}
		}
		for (int num:test9a){
			System.out.print(num + ", ");
		}
		System.out.println();
	}
}
