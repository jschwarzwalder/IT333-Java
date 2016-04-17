package net.greenrivertech.jschwarzwalder;

import java.util.ArrayList;
import java.util.Iterator;

public class BagTest {
	public static void main(String[] args) {
		//create a bag
		Bag myBag = new Bag(6);
		
		//add a few elements to the bag
		myBag.add("Fault in our Stars");
		myBag.add("Cinder");
		myBag.add("Harry Potter and the Goblet of Fire");
		myBag.add("Grave Mercy");
		myBag.add("Little Brother");
		
//		System.out.println(myBag.toString());
		
		//this doesn't work! we need iterators!
//		for (int i; i < myBag.size(); i++){
//			System.out.println(myBag.get(i));
//		}
		
		Iterator<Object> it = myBag.iterator();
		while (it.hasNext()){
			String title = (String)it.next();
			System.out.println(title);
		}
		
		for(Object title: myBag){
			System.out.println(title);
		}
		
		//for-each loop, enhanced for loop (SYNTACTIC SUGAR)
		ArrayList<String> colors = new ArrayList<String>();
		
		colors.add("red");
		colors.add("yellow");
		colors.add("blue");
		colors.add("orange");
		colors.add("green");
		colors.add("violet");
		colors.add("black");
		colors.add("white");
		colors.add("magenta");
		
		
		//for each loops use iterators internally
		for(String color : colors){
			System.out.print(color);
			System.out.print(", ");
		}
		System.out.println(" ");
		
		Iterator<String> iterator = colors.iterator();
		while (iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		
		
		
	}
}
