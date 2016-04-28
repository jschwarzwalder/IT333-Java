package edu.greenriver.it.hashing;

public class HashingPractice {

	public static void main(String[] args) {
		HashTable<String> wordsSet = new HashTable<String>();
		
		System.out.println("size(): " + wordsSet.size());
		System.out.println("isEmpty():" + wordsSet.isEmpty());
		
		//add a few elements
		wordsSet.add("red");
		wordsSet.add("blue");
		wordsSet.add("yellow");
		wordsSet.add("purple");
		wordsSet.add("green");
		wordsSet.add("orange");
		

		
		//view the content of the internal array
		System.out.println(wordsSet.toString());
		System.out.println("size(): " + wordsSet.size());
		
		
		wordsSet.add("white");
		
		//view the content of the internal array
		System.out.println(wordsSet.toString());
		System.out.println("size(): " + wordsSet.size());
		
		//practice with remove() and contains()
		System.out.println("remove(red): " + wordsSet.remove("red"));
		System.out.println("remove(brown): " + wordsSet.remove("brown"));
		System.out.println("contains(white): " + wordsSet.contains("white"));
		System.out.println("contains(red): " + wordsSet.contains("red"));
		System.out.println("contains(cyan): " + wordsSet.contains("cyan"));
		
		System.out.println("size(): " + wordsSet.size());
		System.out.println("isEmpty():" + wordsSet.isEmpty());
		

	}

}
