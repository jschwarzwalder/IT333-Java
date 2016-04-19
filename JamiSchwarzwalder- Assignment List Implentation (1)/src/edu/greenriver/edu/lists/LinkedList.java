package edu.greenriver.edu.lists;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/*
 * Jami Schwarzwalder
 * 4/16/2016
 * LinkedList.java
 * Assignment - List Implementation (Part one)
 * 
 * We will be implementing a list for this assignment. 
 * The goal is to understand the List<T> API in Java, 
 * as well as exploring the amount of work that each operation in the List<T> API requires. 
 * 
 * This implements the LinkedList<T> class.
 * 
 */

/**
 * A Singly linked list
 * 
 * @author Jami Schwarzwalder
 * @version 1.0
 */
public class LinkedList<T> implements List<T>
{
	// mark the first node in the list
	private Node head;
	// mark the last node in the list
	private Node tail;
	// store the number of nodes in the list
	private int size;
	
	//each element in the list is a node
	private class Node{
		//Object we want stored in the node
		private T value;
		//points to next node in the list
		private Node next;
		
		public T getValue() {
			return value;
		}
		public void setValue(T value) {
			this.value = value;
		}
		public Node getNext() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		}
		
		
		
	}
	
	/**
     * Returns true if newElement was added to the list 
     * 	as part of a new Node
     *
     * @param newElement Object to be stored in List 
     * @returns true if element was added to list
     * 			
     */
	@Override
	public boolean add(T newElement)
	{	
		//create new Node
		Node element = new Node();
		
		//store newElement in node
		element.setValue(newElement);
		
		//since we are adding to end of list
		//set point to next to null (it will not point anywhere)
		element.setNext(null);
		
		//if first element in list, point head to this new node
		if (size==0){
			head = element;
		} else {
			//otherwise point last node in list to this new node
			tail.setNext(element);
		}
		//point tail to this new node that is at the end of the list
		tail = element;
		
		//since we added a node increase size by one
		size++;
		
		//we successfully added a node, so return true
		return true;
	}
	
	/**
     *   Inserts newElement at the given index
     * 
     *
     * @param index integer indicating where to add newElement
     * @param newElement Object to be stored in List 
     * @returns true if element was added to list
     * 			
     */
	@Override
	public void add(int index, T newElement) {
		if (index >= size){
			//if index is larger or equal to the size of list,
			//add element to the end of the list
			add(newElement);
		} else {
			Node prev = null;
			Node currentNode = head;
			for (int i = 0; i<index; i++){
				//loop through list until we get to correct index
				prev = currentNode;
				currentNode = currentNode.getNext();
			}
			//create new Node
			Node element = new Node();
			
			//store newElement in node
			element.setValue(newElement);
			
			//point prev node to this new node
			if (index == 0){
				head = element;
			} else {
				prev.setNext(element);
			} 
			//set point new node to next node in list 
			element.setNext(currentNode);
			
			//since we added a node increase size by one
			size++;
		}
		
		
	}
	
	/**
     * Returns true if list has no nodes
     *
     * 
     * @returns true if size is 0
     * 		false if size is any other number
     * 			
     */
	@Override
	public boolean isEmpty()
	{	
		//if size is 0 then list is empty
		return size == 0;
	}

	/**
     * Returns length of list as stored in size variable
     *
     * 
     * @returns size from private size variable
     * 			
     */
	@Override
	public int size()
	{	
		//return stored size value
		return size;
	}
	
	
	/**
     * Removes all elements in the list.
     *
     * 
     * 
     * 			
     */

	@Override
	public void clear()
	{
		head = null;
		tail = null;
		size = 0;
	}

	/**
     * Returns the index of the first occurrence of search in the list.
     * If search is not found, then indexOf() should return -1.
     *
     *
     * @param search Object that might be stored in list
     * @returns integer that represents index of the Object search 
     * 	 			
     */

	@Override
	public int indexOf(Object search)
	{
		//get first node in list
		Node currentNode = head;
		
		//int to keep track of index
		int index = 0;
				
		//go through all nodes until you reach the end
		//where next would be null
		while (currentNode  != null){
			//compare object stored in current node with 
			//Object passed into this method
			if (currentNode.getValue().equals(search)){
				return index;
			}
			//advance to next node
			index ++;
			currentNode = currentNode.getNext();
		}
		return -1;
	}

	
	/**
     * Returns true if passed in object is found in list
     *
     * @param search Object that might be stored in list
     * @returns true if Object is found in list
     * 		
     * 			
     */
	@Override
	public boolean contains(Object search)
	{
		//get first node in list
		Node currentNode = head;
		
		//go through all nodes until you reach the end
		//where next would be null
		while (currentNode  != null){
			//compare object stored in current node with 
			//Object passed into this method
			if (currentNode.getValue().equals(search)){
				
				return true;
			}
			//advance to next node
			currentNode = currentNode.getNext();
		}
		return false;
	}

	/**
     * Returns the element at the given index. 
     * Your method should validate the given index.
     *
     *
     * @param index integer representing location of desired Value
     * @returns T the Value in the node at Index
     * 	 			
     */
	@Override
	public T get(int index)	{
		if ((index < size) && (index >= 0)){
			//get first node in list
			Node currentNode = head;
			
			//int to keep track of index
			int listIndex = 0;
					
			//go through all nodes until you reach the end
			//where next would be null
			while (currentNode  != null){
				// compare list passed into method with listIndex
				if (listIndex == index ){
					return currentNode.getValue();
				}
				//advance to next node
				listIndex ++;
				currentNode = currentNode.getNext();
			}			
		}
		throw new IndexOutOfBoundsException("index is out of range");
	}
	
	/**
     * Returns the element at the given index. 
     * Your method should validate the given index.
     *
     *
     * @param index integer representing location of desired Value
     * @param value Object to be stored in List at specified index
     * @returns T the Value in the node at Index
     * 	 			
     */
	@Override
	public T set(int index, T value){
		if ((index < size) && (index >= 0)){
			//get first node in list
			Node currentNode = head;
			
			//int to keep track of index
			int listIndex = 0;
					
			//go through all nodes until you reach the end
			//where next would be null
			while (currentNode  != null){
				// compare list passed into method with listIndex
				// if the same replace value in currentNode with passed in value
				if (listIndex == index ){
					T oldValue = currentNode.getValue();
					currentNode.setValue(value);
					return oldValue;
				}
				//advance to next node
				listIndex ++;
				currentNode = currentNode.getNext();
			}			
		}
		throw new IndexOutOfBoundsException("index is out of range");
	}
	
	/**
     * Returns true if passed in object is removed from list
     *
     * @param search Object that might be stored in list
     * @returns true if Object is removed from list			
     */
	@Override
	public boolean remove(Object search) {
		//get first node in list
		Node currentNode = head;
		Node prev = null;
		
		if ((size == 1) && (currentNode.getValue().equals(search))){
			clear();
			return true;
		}
		
		//go through all nodes until you reach the end
		//where next would be null
		while (currentNode  != null){
			
			//compare object stored in current node with 
			//Object passed into this method
			if (currentNode.getValue().equals(search)){
				//if node is at first in the list move head pointer
				if (prev == null) {
					head = currentNode.getNext();
				} else if (tail == currentNode) {
					//if node is at end in the list move tail pointer and next point in previous node
					tail = prev;
					prev.setNext(null);
				} else {
					//change the prev node to point to the next node
					prev.setNext(currentNode.getNext());
				}
							
				//reduce size since we removed a node
				size --;
				//since we removed a node return true
				return true;
				
			}
			//store current node as previous
			prev = currentNode;
			//advance to next node
			currentNode = currentNode.getNext();
			
		}
		return false;
	}

	@Override
	public T remove(int index)
	{
		return null;
	}

	// part #2 methods below...

	@Override
	public boolean addAll(Collection<? extends T> other)
	{
		throw new UnsupportedOperationException("This method is not supported.");
	}

	@Override
	public boolean addAll(int index, Collection<? extends T> other)
	{
		throw new UnsupportedOperationException("This method is not supported.");
	}

	@Override
	public boolean containsAll(Collection<?> other)
	{
		throw new UnsupportedOperationException("This method is not supported.");
	}

	@Override
	public boolean removeAll(Collection<?> other)
	{
		throw new UnsupportedOperationException("This method is not supported.");
	}

	@Override
	public boolean retainAll(Collection<?> other)
	{
		throw new UnsupportedOperationException("This method is not supported.");
	}

	@Override
	public List<T> subList(int fromIndex, int toIndex)
	{
		throw new UnsupportedOperationException("This method is not supported.");
	}

	@Override
	public Object[] toArray()
	{
		throw new UnsupportedOperationException("This method is not supported.");
	}

	@Override
	@SuppressWarnings("hiding")
	public <T> T[] toArray(T[] toFill)
	{
		throw new UnsupportedOperationException("This method is not supported.");
	}

	@Override
	public Iterator<T> iterator()
	{
		throw new UnsupportedOperationException("This method is not supported.");
	}

	// extra credit below...

	@Override
	public ListIterator<T> listIterator(int index)
	{
		throw new UnsupportedOperationException("This method is not supported.");
	}

	@Override
	public int lastIndexOf(Object search)
	{
		throw new UnsupportedOperationException("This method is not supported.");
	}

	@Override
	public ListIterator<T> listIterator()
	{
		throw new UnsupportedOperationException("This method is not supported.");
	}
}
