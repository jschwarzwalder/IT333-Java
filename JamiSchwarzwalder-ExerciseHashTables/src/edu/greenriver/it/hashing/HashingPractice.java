package edu.greenriver.it.hashing;

public class HashingPractice {

	public static void main(String[] args) {
		HashTable<String> wordsSet = new HashTable<String>();
		
		//add a few elements
		wordsSet.add("red");
		wordsSet.add("blue");
		wordsSet.add("yellow");
		wordsSet.add("purple");
		wordsSet.add("green");
		wordsSet.add("orange");
		wordsSet.add("white");
		
		//view the content of the internal array
		System.out.println(wordsSet.toString());
		

	}

}
