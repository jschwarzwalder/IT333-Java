package edu.greenriver.edu.heaps;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
/*
 * Jami Schwarzwalder
 * 5/15/2016
 * EmptyHeap.java
 * Assignment - Heaps
 * 
 * A d-heap can be used as an alternative to a binary heap for implementing the priority queue ADT. 
 * Recall that a priority queue is a smart queue that allows for retrieval of elements 
 * from a queue based on the importance (priority) of an element.
 * 
 * Parent: (i + 1) / 3
 * Left child: 3i - 1
 * Middle child: 3i
 * Right child: 3i + 1
 * 
 * 
 */

public class EmptyHeap<T extends Comparable<T>> implements Queue<T> {

	/**
	 * Testing inside class due to inclusion of private methods.
	 * 
	 * 
	 */
	public static void main(String[] args) {
		EmptyHeap<String> heap = new EmptyHeap<String>();
		heap.add("F");
		//System.out.println(heap);
		heap.percolateUp(1);
		heap.add("G");
		heap.add("H");
		//System.out.println(heap);
		heap.add("D"); //this should move up via percolateUp function
		//System.out.println(heap);
		heap.add("A");//this should move up via percolateUp function
		//System.out.println(heap);
		heap.add("C");
		//System.out.println(heap);
		heap.add("B");
		System.out.println(heap);
		heap.remove();
		System.out.println(heap);
		
		
		EmptyHeap<Integer> numHeap = new EmptyHeap<Integer>();
		//System.out.println(numHeap);
		numHeap.add(15);
		//System.out.println(numHeap);
		numHeap.add(14);
		//System.out.println(numHeap);
		numHeap.add(13);
		//System.out.println(numHeap);
		numHeap.add(12);
		//System.out.println(numHeap);
		numHeap.add(11);
		//System.out.println(numHeap);
		numHeap.add(10);
		//System.out.println(numHeap);
		numHeap.add(9);
		//System.out.println(numHeap);
		numHeap.add(8);
		//System.out.println(numHeap);
		numHeap.add(7);
		//System.out.println(numHeap);
		numHeap.add(6);
		//System.out.println(numHeap);
		numHeap.add(5);
		//System.out.println(numHeap);
		numHeap.add(4);
		//System.out.println(numHeap);
		numHeap.add(3);
		//System.out.println(numHeap);
		numHeap.add(2);
		//System.out.println(numHeap);
		numHeap.add(1);
		//System.out.println(numHeap);
		numHeap.add(0);
		//System.out.println(numHeap);
	}

	private ArrayList<T> heapArray = new ArrayList<T>();
	private int heapSize;

	public EmptyHeap() {

	}

	@Override
	public boolean add(T newElement) // insert() operation
	{
		if (heapSize <= 0) {
			heapArray.add(null);
			heapArray.add(1, newElement);
			heapSize++;
			return true;
		} else {
			boolean results = heapArray.add(newElement);
			if (results != true){
				return false;
			}
			heapSize++;
			percolateUp(heapSize);
			return true;
		}

	}

	/**
	 * Internal method to percolate up in the heap.
	 * 
	 * @param childIndex
	 *            the index at which the percolate begins.
	 */
	private void percolateUp(int childIndex) {
		int parentIndex = (childIndex + 1) / 3;
		if (childIndex <= 1) {
			return;
		}
		if (heapArray.get(parentIndex).compareTo(heapArray.get(childIndex)) > 0) {
			T temp = heapArray.get(childIndex);
			heapArray.set(childIndex, heapArray.get(parentIndex));
			heapArray.set(parentIndex, temp);
			percolateUp(parentIndex);

		}
	}



	@Override
	public T peek() // findMin() operation
	{
		return heapArray.get(1);
	}

	@Override
	public T remove() // deleteMin() operation
	{
		T removedNode = peek();
		T lastNode = heapArray.get(heapSize);
		heapArray.remove(heapSize);
		heapArray.set(1, lastNode);
		heapSize --;
		percolateDown(1);
		return removedNode;
	}
	
	/**
	 * Internal method to percolate down in the heap.
	 * 
	 * @param childIndex
	 *            the index at which the percolate begins.
	 */
	private void percolateDown(int parentIndex) {
		
		if (parentIndex < 1 || parentIndex > heapSize) {
			throw new IndexOutOfBoundsException("Error, Index is not valid for this heap. You entered " + parentIndex);
		}
		
		int childLeftIndex = (3 * parentIndex ) - 1;
		int childMiddleIndex = 3 * parentIndex;
		int childRightIndex = (3 * parentIndex ) + 1;
		int smallestChildIndex;
		
		T childLeft = heapArray.get(childLeftIndex);
		T childMiddle = heapArray.get(childMiddleIndex);
		T childRight = heapArray.get(childRightIndex);
		T parentValue = heapArray.get(parentIndex);
		
		if (childLeft.compareTo(childMiddle) < 0){ //childLeft is smaller
			if (childLeft.compareTo(childRight) < 0){ //childLeft is smallest
				smallestChildIndex = childLeftIndex;
			} else { //childRight is smallest
				smallestChildIndex = childRightIndex;
			}
		} else if (childMiddle.compareTo(childRight) < 0){ //childMiddle is smallest
			smallestChildIndex = childMiddleIndex;
		} else { //childRight is smallest
			smallestChildIndex = childRightIndex;
		}
		
		if (parentValue.compareTo(heapArray.get(smallestChildIndex)) > 0 ){ //parent is larger than smallest child
			
			heapArray.set(parentIndex, heapArray.get(smallestChildIndex));
			heapArray.set(smallestChildIndex, parentValue);
			
			percolateDown(smallestChildIndex);

		}
		
		
		
	}

	@Override
	public int size() {
		return heapSize;
	}

	@Override
	public boolean isEmpty() {
		return heapSize == 0;
	}

	@Override
	public void clear() {
		heapArray.clear();
		heapSize = 0;
	}
	
	public String toString() {
		return heapArray.toString();
	}
	// ignore methods below this

	@Override
	public boolean remove(Object search) {
		throw new UnsupportedOperationException("Method not supported.");
	}

	@Override
	public boolean contains(Object search) {
		throw new UnsupportedOperationException("Method not supported.");
	}

	@Override
	public T poll() {
		throw new UnsupportedOperationException("Method not supported.");
	}

	@Override
	public T element() {
		throw new UnsupportedOperationException("Method not supported.");
	}

	@Override
	public boolean offer(T e) {
		throw new UnsupportedOperationException("Method not supported.");
	}

	@Override
	public boolean addAll(Collection<? extends T> c) {
		throw new UnsupportedOperationException("Method not supported.");
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		throw new UnsupportedOperationException("Method not supported.");
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		throw new UnsupportedOperationException("Method not supported.");
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		throw new UnsupportedOperationException("Method not supported.");
	}

	@Override
	public Iterator<T> iterator() {
		throw new UnsupportedOperationException("Method not supported.");
	}

	@Override
	public Object[] toArray() {
		throw new UnsupportedOperationException("Method not supported.");
	}

	@Override
	public <T> T[] toArray(T[] a) {
		throw new UnsupportedOperationException("Method not supported.");
	}
}
