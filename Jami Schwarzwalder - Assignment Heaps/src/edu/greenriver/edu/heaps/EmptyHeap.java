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
	private ArrayList<T> heapArray = new ArrayList<T> ();
	private int heapSize;
	
	public EmptyHeap() {
		
	}

	@Override
	public boolean add(T newElement) // insert() operation
	{	if (heapSize <=0){
		heapArray.add(1, newElement);
		heapSize ++;
		return true;
	} else {
		heapArray.add(newElement);
		heapSize ++;
		percolateUp();
	}
	
	
		
	}

	/**
	 * Internal method to percolate up in the heap.
	 * 
	 * @param childIndex
	 *            the index at which the percolate begins.
	 */
	private void percolateUp(int childIndex){
		int parentIndex = (childIndex +1)/3;
		if (childIndex <= 1){
			return;
		}
		if(heapArray.get(parentIndex).compareTo(heapArray.get(childIndex)) > 0){
			T temp = heapArray.get(childIndex);
			heapArray.set(childIndex, heapArray.get(parentIndex) );
			heapArray.set(parentIndex, temp);
			percolateUp(parentIndex);
				
		}
	}
	
	/**
	 * Internal method to percolate down in the heap.
	 * 
	 * @param hole
	 *            the index at which the percolate begins.
	 */
	private void percolateDown(int hole) {
		int child;
		T tmp = heapArray.get(hole);

		for (; hole * 2 <= heapSize; hole = child) {
			child = hole * 2;
			if (child != heapSize && heapArray.get(child + 1).compareTo(heapArray.get(child)) < 0)
				child++;
			if (heapArray.get(child).compareTo(tmp) < 0)
				heapArray.set(hole, heapArray.get(child));
			else
				break;
		}
		heapArray.get(tmp);
	}
	
	@Override
	public T peek() // findMin() operation
	{
		return null;
	}

	@Override
	public T remove() // deleteMin() operation
	{
		return null;
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
