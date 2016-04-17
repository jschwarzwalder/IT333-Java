package edu.greenriver.it.lazydeletion;


import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import edu.greenriver.edu.lists.LinkedList.Node;

/*
 * Jami Schwarzwalder
 * 4/15/2016
 * LazyDeletion.java
 * Exercises - Basic Data Structures
 * 
 * An alternative to the deletion strategy we have given is to use lazy deletion. 
 * To delete an element, we merely mark it deleted (using a boolean field). 
 * The number of deleted and non-deleted elements in the list is kept as part of the data structure. 
 * If there are as many deleted elements as non-deleted elements, we traverse the entire list, 
 * performing the standard deletion algorithm on all marked nodes.
 * 
 * List the advantages and disadvantages of lazy deletion.
 * 
 * Write routines to implement the standard linked list operations using lazy deletion. 
 * As a minimum you should write the add(x), remove(x), size(), isEmpty() and contains(x) methods.
 */

/**
 * Use Lazy Deletion on a standard linked list
 * 
 * @author Jami Schwarzwalder
 * @version 1.0
 */
public class LazyDeletion<T> implements List<T> {
	// mark the first node in the list
	public Node head;
	// mark the last node in the list
	public Node tail;
	// store the number of nodes in the list
	public int size;
	
	//each element in the list is a node
	private class Node{
		//Object we want stored in the node
		private T value;
		//points to next node in the list
		private Node next;
		//for lazy Deletion, false if node has been deleted
		//set to true when node is created/added
		private boolean deleted;
		
		public boolean isDeleted() {
			return deleted;
		}
		public void setDeleted(boolean deleted) {
			this.deleted = deleted;
		}
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
		
		//since we are adding to list it should not be deleted
		element.setDeleted(false);
		
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

	@Override
	public void add(int index, T newElement)
	{
		
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

	@Override
	public void clear()
	{

	}

	@Override
	public int indexOf(Object search)
	{
		return 0;
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
				
				//if they are the same, check to see if it was previously deleted
				if (!currentNode.isDeleted()){
					return true;
				}
			}
			//advance to next node
			currentNode = currentNode.getNext();
		}
		return false;
	}

	@Override
	public T get(int index)
	{
		return null;
	}

	@Override
	public T set(int index, T value)
	{
		return null;
	}
	
	/**
     * Returns true if passed in object is removed from list
     *
     * @param search Object that might be stored in list
     * @returns true if Object is removed from list
     * 		
     * 			
     */
	@Override
	public boolean remove(Object search)
	{
		//get first node in list
		Node currentNode = head;
		
		//go through all nodes until you reach the end
		//where next would be null
		while (currentNode  != null){
			//compare object stored in current node with 
			//Object passed into this method
			if (currentNode.getValue().equals(search)){
				
				//if they are the same, check to see if it was previously deleted
				if (!currentNode.isDeleted()){
					//set Deleted to true
					currentNode.setDeleted(true);
					//reduce size since we removed a node
					size --;
					//since we removed a node return true
					return true;
				}
			}
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

