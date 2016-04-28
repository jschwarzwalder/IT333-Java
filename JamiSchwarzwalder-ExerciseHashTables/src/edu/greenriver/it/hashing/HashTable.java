package edu.greenriver.it.hashing;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

public class HashTable<T> implements Set<T> {
	
	//constants control; initial table size, load factor
	private static final int DEFAULT_SIZE = 10;
	private static final double DEFAULT_LOAD_FACTOR = 0.6;	
	
	private HashTableElement[] table;
	
	private double loadFactor;
	private int intialsize;
	
	private int size; //how many element are in our table?
	private int usedSpace; //how many spots are used in our table?
	
	public HashTable() {
		// uses  the defaults above
		this(DEFAULT_SIZE, DEFAULT_LOAD_FACTOR); //Constructor chaining
	}

	public HashTable(int initialSize, double loadFactor) {
		table = new HashTableElement[initialSize];
		
		this.loadFactor = initialSize;
		this.loadFactor = loadFactor;
		
	}

	
	@Override
	public boolean add(T element) {
		// is there always room to add a new element?
		if ((double)usedSpace/table.length >= loadFactor){
			rehash();
		}
		//we know now that we have space for a new element

		int index = Math.abs(element.hashCode()) % table.length;
		
		//search for a spot to place my new element using my index

		HashTableElement current = table[index];
		
		while (current != null){
			//collision! we need to use linear probing to search for an empty spot
			//What can go wrong? the element might already be in the table - duplicate
			if (current.element.equals(element) && !current.isEmpty){
				return false;//-- duplicate!!
			}
			
			//What can go wrong? we may search off the end of our table
			index = (index + 1) % table.length;
			current = table[index];
		}
		table[index] = new HashTableElement(element, false);
		size ++;
		usedSpace++;
		
		return true;
	}
	
	@SuppressWarnings("unchecked")
	private void rehash(){
		//resize our table and re-hash (place) our element in a new table;
		HashTableElement[] oldTable = table;
		size = 0;
		table = new HashTableElement[oldTable.length *2];
		
		for (int i = 0; i < oldTable.length; i++){
			if (oldTable[i] !=null && !oldTable[i].isEmpty){
				add((T)oldTable[i].element);
			}
		}
	}

	@Override
	public boolean remove(Object element) {
		//we know now that we have space for a new element
		int index = Math.abs(element.hashCode()) % table.length;
		HashTableElement current = table[index];
		
		//search for the element to remove
		while (current != null) {
			// is this the element to remove?
			if (current.element.equals(element) && !current.isEmpty) {
				//delete the element
				current.isEmpty = true; //lazy deletion
				size--;
				//not decreasing usedSpace because element is not set to null
				return true;
			}

			// we may search off the end of our table
			index = (index + 1) % table.length;
			current = table[index];
		}
		return false;
	}

	@Override
	public boolean contains(Object element) {
		//we know now that we have space for a new element
		int index = Math.abs(element.hashCode()) % table.length;
		HashTableElement current = table[index];
		
		//search for the element to remove
		while (current != null) {
			// is this the element to remove?
			if (current.element.equals(element) && !current.isEmpty) {
				//you found the element
				return true;
			}

			// we may search off the end of our table
			index = (index + 1) % table.length;
			current = table[index];
		}
		return false;
	}

	@Override
	public int size() {
		
		return size;
	}

	@Override
	public boolean isEmpty() {
		
		return size == 0;
	}
	
	@Override
	public void clear() {
		
		size = 0;
		table = new HashTableElement[intialsize];

	}
	
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new HashTableIterator(table);
	}


	private static class HashTableElement {
		private Object element;
		private boolean isEmpty; // true, the element is deleted otherwise false

		public HashTableElement(Object element, boolean isEmpty) {
			this.element = element;
			this.isEmpty = isEmpty;
		}
		
		public String toString(){
			if (isEmpty){
				return "empty";
			} 
			return element.toString();
		}
	}
	
	@Override 
	public String toString(){
		String result = "";
		
		for (int i=0; i < table.length; i++){
			if (i != 0){
				result += ", ";
			}
			if (table[i] != null) {
				result += table[i].toString();
			} else {
				result += "null";
			}
				
			
		}
		
		return result;
	}
	
	private class HashTableIterator implements Iterator<T>{
		private HashTableElement[] table;
		private int nextIndex = -1;
		
		public HashTableIterator (HashTableElement[] table){
			this.table = table;
			findNextIndex(); //find the first valid element
		}
				
		@Override
		public boolean hasNext() {
			
			return nextIndex != -1;
		}

		@SuppressWarnings("unchecked")
		@Override
		public T next() {
			
			if (!hasNext()){
				throw new NoSuchElementException("There is no element to return");
			}
			
			Object nextElement = table[nextIndex].element;
			findNextIndex(); //get the next valid element
			return (T)nextElement;
		}
		
		//helper method
		private void findNextIndex(){
			//this method will move nextINdex to the next valid element
			//valid - not null, not empty(deleted)
			for (int i = nextIndex + 1; i < table.length; i++){
				if (table[i] != null && !table[i].isEmpty){
					nextIndex = i;
					return; //exit now...
				}
			}
			
			nextIndex = -1; //invalid index (stop now!)
		}
		
	}
	
	
	// we are not implementing beyond this point

	@Override
	public boolean addAll(Collection<? extends T> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	
	@Override
	public boolean removeAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <A> A[] toArray(A[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
