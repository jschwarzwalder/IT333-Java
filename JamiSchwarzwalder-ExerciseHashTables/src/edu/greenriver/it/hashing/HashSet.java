package edu.greenriver.it.hashing;

/*
 * Jami Schwarzwalder
 * 4/26/2016
 * HashSet.java
 * Exercises - Hash Tables
 * 
 *  Write a class called HashSet that stores an internal hash table of Objects and uses linear probing to address collisions. 
 *  Assume your hash table is never resized. 
 *  If a new element is added to a full table, then throw a new IllegalStateException. 
 *  You class should have the following methods:
 *  
 *  a)   add(x)
 *  b)   contains(x)
 *  c)   size()
 *  d)   isEmpty()
 *  
 *  5b. Add the remove(x) method to your HashSet class above. 
 *  This will require you to support a placeholder value in your hash table for removed elements.
 
 * 
 */

public class HashSet <AnyType> {
	//Build a table to store values
	private Object[] hashTable = new Object[53];
	
	//store values for filled and length
	private int filled = 0;
	private int length = 53;
	
	public int getFilled() {
		return filled;
	}

	public int getLength() {
		return length;
	}
			
	public static void main(String[] args) {
		
		

	}
	
	public boolean add(AnyType value){
		if (filled == length){
			return false;
		} else if (value ==null) {
			return false;
		} else {
			int hash = value.hashCode();
			int hashIndex = hash%length;
			while (hashTable[hashIndex] != null){
				hashIndex = (hashIndex + 1) % length;
			}
			hashTable[hashIndex] = value;
			filled ++;
			return true;
		}
	}
	
	public boolean contains(AnyType value){
		if (value ==null) {
			return false;
		} else {
			int hash = value.hashCode();
			int hashIndex = hash%length;
			int probes = 0;
			while (probes < length){
				if (hashTable[hashIndex] == value){
					return true;
				} else if(hashTable[hashIndex] != null){
					return false;
				}
				else {
					hashIndex = (hashIndex + 1) % length;
					probes ++;
				}
			}
			return false;
			
		}
	}
	
	
	public int size (){
		return filled;
	}
	
	public boolean isEmpty(){
		return filled == 0;
	}
	
	
}
