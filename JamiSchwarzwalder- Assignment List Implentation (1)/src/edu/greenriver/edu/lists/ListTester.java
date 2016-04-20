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
		//testGet();
		//testSet();
		//testRemoveElement();
		//testRemoveIndex();
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
		LinkedList<Integer> test8 = new LinkedList<Integer>();
		System.out.print("Is 4 in the list? ");
		try {
			test8.get(4);
		} catch (IndexOutOfBoundsException E) {
			System.out.println("There was a Out of Bounds Exception");
		}
		
		System.out.println("We make a new list of 10 elements with values 0 to 9 ");
		for (int i = 0; i < 10; i++){
			test8.add(i);
		}
		System.out.print("Is 0 in the list? ");
		System.out.println(test8.get(0));
		System.out.print("Is 4 in the list? ");
		System.out.println(test8.get(4));
		System.out.print("Is 7 in the list? ");
		System.out.println(test8.get(7));
		System.out.print("Is 9 in the list? ");
		System.out.println(test8.get(9));
	}
	
	public static void testSet()
	{
		//this method tests list.set(index, element)
		LinkedList<Integer> test8 = new LinkedList<Integer>();
		System.out.println("We make a new list of 10 elements with values 0 to 9 ");
		for (int i = 0; i < 10; i++){
			test8.add(i);
		}
		System.out.print("Is 0 in the list? ");
		System.out.println(test8.contains(0));
		System.out.print("Set 0 to be 42, what element did it replace? ");
		System.out.println(test8.set(0, 42));
		System.out.print("Is 0 in the list? ");
		System.out.println(test8.contains(0));
		System.out.print("What is the index of 42? ");
		System.out.println(test8.indexOf(42));
		
		System.out.print("Is 9 in the list? ");
		System.out.println(test8.contains(9));
		System.out.print("Set 10 to be 10, what element did it replace? ");
		try {
			System.out.println(test8.set(10, 10));
		} catch (IndexOutOfBoundsException E) {
			System.out.println("10 is not an vaild index");
		}
		System.out.print("Is 9 in the list? ");
		System.out.println(test8.contains(9));
		System.out.print("Is 10 in the list? ");
		System.out.println(test8.contains(10));
		System.out.print("What is the index of 10? ");
		System.out.println(test8.indexOf(10));
		
	}
	
	public static void testRemoveElement()
	{
		//this method tests list.remove(element)
		System.out.println("We make a new list of strings ");
		LinkedList<String> test9 = new LinkedList<String>();
		test9.add("test 1");
		System.out.print("Size:  " );
		System.out.println(test9.size());
		System.out.print("We remove an element ");
		System.out.println(test9.remove("test 1"));
		System.out.print("Size:  " );
		System.out.println(test9.size());
		System.out.print("Is the list Empty? ");
		System.out.println(test9.isEmpty());
		
		LinkedList<Integer> test10 = new LinkedList<Integer>();
		System.out.println("We make a new list of 10 elements with values 0 to 9 ");
		for (int i = 0; i < 10; i++){
			test10.add(i);
		}
		System.out.print("Size:  " );
		System.out.println(test10.size());
		System.out.print("We remove an element ");
		System.out.println(test10.remove(new Integer(2)));
		System.out.print("Size:  " );
		System.out.println(test10.size());
	}
	
	public static void testRemoveIndex()
	{
		//this method tests list.remove(index)
		
		System.out.println("We make a new list of strings ");
		LinkedList<String> test11 = new LinkedList<String>();
		test11.add("test 1");
		System.out.print("Size:  " );
		System.out.println(test11.size());
		System.out.println("We remove an element at 0. It should return test 1");
		System.out.println(test11.remove(0));
		System.out.print("Size:  " );
		System.out.println(test11.size());
		System.out.print("Is the list Empty? ");
		System.out.println(test11.isEmpty());
		
		LinkedList<Integer> test12 = new LinkedList<Integer>();
		System.out.println("We make a new list of 10 elements with values 0 to 9 ");
		for (int i = 0; i < 10; i++){
			test12.add(i);
		}
		System.out.print("Size:  " );
		System.out.println(test12.size());
		System.out.print("We remove an element at index 5: ");
		System.out.println(test12.remove(5));
		System.out.print("Size:  " );
		System.out.println(test12.size());
		System.out.print("We remove an element at index 0: ");
		System.out.println(test12.remove(0));
		System.out.print("Size:  " );
		System.out.println(test12.size());
	}
}
