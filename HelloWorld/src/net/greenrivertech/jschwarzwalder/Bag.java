package net.greenrivertech.jschwarzwalder;

import java.util.Arrays;
import java.util.Iterator;

// stores a fixed size array, but elements can be added
// at will without specifying an index
public class Bag implements Iterable<Object>{
	
	//fields
	private static final int DEFAULT_BAG_SIZE = 10;
	private Object[] data;
	private int currentNumberOfElements = 0;
	
	//constructors
	public Bag(){
		data = new Object[DEFAULT_BAG_SIZE];
	}
	
	public Bag(int sizeOfBag){
		data = new Object[sizeOfBag];
	}
	
	//methods
	public boolean add(Object newElement){
		//search for a spot to place our new element
		for (int i= 0; i < data.length; i++){
			//is the current spot empty?
			if (data[i] == null) {
				//add the element and exit the method
				data[i] = newElement;
				currentNumberOfElements++;
				return true;
			}
		}
		//bag is full
		return false;
	}
	
	public int size(){
		return currentNumberOfElements;
	}
	
	public String toString(){
		return Arrays.toString(data);
	}
	
	//this method declares that our class has an iterator,
	// and it returns an iterator
	@Override
	public Iterator<Object> iterator() {
		
		return new BagIterator(data);
	}
	
	//inner classes...
	private static class BagIterator implements Iterator<Object> {
		private Object[] outerClassData;
		public int currentPosition = 0;
		
		public BagIterator(Object[] outerClassData){
			this.outerClassData = outerClassData;
		}
		@Override
		public boolean hasNext() {
			//make sure we still have a valid index and the current element is not empty (null)
			return currentPosition < outerClassData.length && 
					outerClassData[currentPosition] != null;
		}

		@Override
		public Object next() {
			//return the current element, and we need to increment
			//currentPosition so that it points to the next element
			Object nextElement = outerClassData[currentPosition];
			currentPosition++;
			return nextElement;
		}
		
	}
}
