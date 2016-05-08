package edu.greenriver.edu.lists;

public class ListTesterPartTwo
{
	public static void main(String[] args)
	{
		//run the tests
		//testAddAll();
		testInsertAll();
		testContainsAll();
		testRemoveAll();
		testRetainAll();
		testSubList();
		testToArray();
		testToGenericArray();
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
	}
	
	public static void testToGenericArray()
	{
		//this method tests list.toArray(T[])
	}
	
	public static void testIterator()
	{
		//this method tests list.iterator()
	}
}
