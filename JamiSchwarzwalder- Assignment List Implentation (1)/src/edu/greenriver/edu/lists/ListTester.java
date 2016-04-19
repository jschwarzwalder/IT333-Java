package edu.greenriver.edu.lists;

public class ListTester
{
	public static void main(String[] args)
	{
		//run the tests
		//testAdd();
		//testInsert();
		//testIsEmpty();
		//testSize();
		//testClear();
		//testIndexOf();
		//testContains();
		testGet();
		testSet();
		testRemoveElement();
		testRemoveIndex();
	}
	
	public static void testAdd()
	{
		//this method tests list.add(element)
		LinkedList<Integer> test1 = new LinkedList<Integer>();
		System.out.println(test1.add(1));
		System.out.println(test1.indexOf(1));
		System.out.println(test1.contains(1));
		System.out.println(test1.add(3));
		System.out.println(test1.indexOf(3));
		System.out.println(test1.contains(3));
		System.out.println(test1.add(2));
		System.out.println(test1.add(2));
		System.out.println(test1.add(2));
		System.out.println(test1.add(2));
		System.out.println(test1.add(2));
		System.out.println(test1.indexOf(2));
		System.out.println(test1.contains(2));
		
	}
	
	public static void testInsert()
	{
		//this method tests list.add(index, element)
		LinkedList<Integer> test2 = new LinkedList<Integer>();
		for (int i = 0; i < 10; i++){
			test2.add(i);
		}
		System.out.print("Do we have 15 in the list? ");
		System.out.println(test2.contains(15));
		System.out.print("Size: ");
		System.out.println(test2.size());
		System.out.println("Try to add 15 at index 15");
		test2.add(15, 15);
		System.out.print("Size:  " );
		System.out.println(test2.size());
		System.out.print("Do we have 15 in the list? ");
		System.out.println(test2.contains(15));
		System.out.print("Index of 15: ");
		System.out.println(test2.indexOf(15));
		
		System.out.println("Try to add -1 at index 0");
		test2.add(0, -1);
		System.out.print("Size:  " );
		System.out.println(test2.size());
		System.out.print("Do we have -1 in the list? ");
		System.out.println(test2.contains(-1));
		System.out.print("Do we have 0 in the list? ");
		System.out.println(test2.contains(0));
		
		
	}
	
	public static void testIsEmpty()
	{
		//this method tests list.isEmpty()
		LinkedList<Integer> test3 = new LinkedList<Integer>();
		System.out.print("Size:  " );
		System.out.println(test3.size());
		System.out.print("Is the list Empty? ");
		System.out.println(test3.isEmpty());
		System.out.print("We add an element ");
		System.out.println(test3.add(1));
		System.out.print("Size:  " );
		System.out.println(test3.size());
		System.out.print("Is the list Empty? ");
		System.out.println(test3.isEmpty());
		System.out.print("We remove an element ");
		System.out.println(test3.remove(new Integer(1)));
		System.out.print("Size:  " );
		System.out.println(test3.size());
		System.out.print("Is the list Empty? ");
		System.out.println(test3.isEmpty());
	}
	
	public static void testSize()
	{
		//this method tests list.size()
		LinkedList<Integer> test4 = new LinkedList<Integer>();
		System.out.print("Size:  " );
		System.out.println(test4.size());
		System.out.print("We add an element ");
		System.out.println(test4.add(1));
		System.out.print("Size:  " );
		System.out.println(test4.size());
		System.out.println("We add an element ");
		test4.add(2, 5);
		System.out.print("Size:  " );
		System.out.println(test4.size());
		System.out.println("We add 10 elements ");
		for (int i = 0; i < 10; i++){
			test4.add(i);
		}
		System.out.print("Size:  " );
		System.out.println(test4.size());
		System.out.print("We remove an element ");
		System.out.println(test4.remove(new Integer(2)));
		System.out.print("Size:  " );
		System.out.println(test4.size());
	}
	
	public static void testClear()
	{
		//this method tests list.clear()
		LinkedList<Integer> test5 = new LinkedList<Integer>();
		System.out.println("We make a new list of 10 elements ");
		for (int i = 0; i < 10; i++){
			test5.add(i);
		}
		System.out.print("Size:  " );
		System.out.println(test5.size());
		System.out.println("We run clear() ");
		test5.clear();
		System.out.print("Size:  " );
		System.out.println(test5.size());
		System.out.println("We run clear() ");
		test5.clear();
		System.out.print("Size:  " );
		System.out.println(test5.size());
	}
	
	public static void testIndexOf()
	{
		//this method tests list.indexOf(element)
		LinkedList<Integer> test6 = new LinkedList<Integer>();
		System.out.println("We make a new list of 10 elements ");
		for (int i = 0; i < 10; i++){
			test6.add(i);
		}
		System.out.print("Where is 4 located? ");
		System.out.println(test6.indexOf(4));
		System.out.print("Where is 7 located? ");
		System.out.println(test6.indexOf(7));
		System.out.println("Add 11 in index 5 ");
		test6.add(5,11);
		System.out.print("Where is 11 located? ");
		System.out.println(test6.indexOf(11));
		System.out.print("Remove 11 ");
		System.out.println(test6.remove(new Integer(11)));
		System.out.print("Where is 11 located? ");
		System.out.println(test6.indexOf(11));
	}
	
	public static void testContains()
	{
		//this method tests list.contains(element)
		LinkedList<Integer> test7 = new LinkedList<Integer>();
		System.out.print("Is 4 in the list? ");
		System.out.println(test7.contains(4));
		System.out.print("Is 7 in the list? ");
		System.out.println(test7.contains(7));
		System.out.println("We make a new list of 10 elements with values 0 to 9 ");
		for (int i = 0; i < 10; i++){
			test7.add(i);
		}
		System.out.print("Is 4 in the list? ");
		System.out.println(test7.contains(4));
		System.out.print("Is 7 in the list? ");
		System.out.println(test7.contains(7));
		System.out.print("Is 11 in the list? ");
		System.out.println(test7.contains(11));
		System.out.println("Add 11 in index 5 ");
		test7.add(5,11);
		System.out.print("Is 11 in the list? ");
		System.out.println(test7.contains(11));
		System.out.print("Remove 11 ");
		System.out.println(test7.remove(new Integer(11)));
		System.out.print("Is 11 in the list? ");
		System.out.println(test7.contains(11));
		System.out.print("Is 0 in the list? ");
		System.out.println(test7.contains(0));
		System.out.print("Is 9 in the list? ");
		System.out.println(test7.contains(9));
	}
	
	public static void testGet()
	{
		//this method tests list.get(index)
	}
	
	public static void testSet()
	{
		//this method tests list.set(index, element)
	}
	
	public static void testRemoveElement()
	{
		//this method tests list.remove(element)
	}
	
	public static void testRemoveIndex()
	{
		//this method tests list.remove(index)
	}
}