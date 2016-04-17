package net.greenrivertech.jschwarzwalder;

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
		
		System.out.println(myBag.toString());
		
		//this doesn't work! we need iterators!
		for (int i; i < myBag.size(); i++){
			System.out.println(myBag.get(i));
		}
		
		
		
	}
}
