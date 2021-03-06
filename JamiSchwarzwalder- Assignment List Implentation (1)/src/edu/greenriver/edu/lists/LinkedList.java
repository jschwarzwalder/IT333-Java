package edu.greenriver.edu.lists;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/*
 * Jami Schwarzwalder
 * 5/7/2016
 * LinkedList.java
 * Assignment - List Implementation (Part two)
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
public class LinkedList<T> implements List<T> {
	// mark the first node in the list
	private Node<T> head;
	// mark the last node in the list
	private Node<T> tail;
	// store the number of nodes in the list
	private int size;
	// modCount tracking changes to list
	private int modCount;

	// each element in the list is a node
	private static class Node<T> {
		// Object we want stored in the node
		private T value;
		// points to next node in the list
		private Node<T> next;

		public T getValue() {
			return value;
		}

		public void setValue(T value) {
			this.value = value;
		}

		public Node<T> getNext() {
			return next;
		}

		public void setNext(Node<T> next) {
			this.next = next;
		}

	}

	/**
	 * Returns true if newElement was added to the list as part of a new Node
	 *
	 * @param newElement
	 *            Object to be stored in List
	 * @returns true if element was added to list
	 * 
	 */
	@Override
	public boolean add(T newElement) {
		// create new Node
		Node<T> element = new Node<T>();

		// store newElement in node
		element.setValue(newElement);

		// since we are adding to end of list
		// set point to next to null (it will not point anywhere)
		element.setNext(null);

		// if first element in list, point head to this new node
		if (size == 0) {
			head = element;
		} else {
			// otherwise point last node in list to this new node
			tail.setNext(element);
		}
		// point tail to this new node that is at the end of the list
		tail = element;

		// since we added a node increase size by one
		size++;
		modCount++;

		// we successfully added a node, so return true
		return true;
	}

	/**
	 * Inserts newElement at the given index
	 * 
	 *
	 * @param index
	 *            integer indicating where to add newElement
	 * @param newElement
	 *            Object to be stored in List
	 * @returns true if element was added to list
	 * 
	 */
	@Override
	public void add(int index, T newElement) {
		if (index == size) {
			// if index is equal to the size of list,
			// add element to the end of the list
			add(newElement);
		} else if ((index < 0) || (index > size)) {
			throw new IndexOutOfBoundsException("index is out of range");
		} else {
			Node<T> prev = null;
			Node<T> currentNode = head;
			for (int i = 0; i < index; i++) {
				// loop through list until we get to correct index
				prev = currentNode;
				currentNode = currentNode.getNext();
			}
			// create new Node
			Node<T> element = new Node<T>();

			// store newElement in node
			element.setValue(newElement);

			// point prev node to this new node
			if (index == 0) {
				head = element;
			} else {
				prev.setNext(element);
			}
			// set point new node to next node in list
			element.setNext(currentNode);

			// since we added a node increase size by one
			size++;
			modCount++;
		}

	}

	/**
	 * Returns true if list has no nodes
	 *
	 * 
	 * @returns true if size is 0 false if size is any other number
	 * 
	 */
	@Override
	public boolean isEmpty() {
		// if size is 0 then list is empty
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
	public int size() {
		// return stored size value
		return size;
	}

	/**
	 * Removes all elements in the list.
	 *
	 * Sets size to 0
	 * 
	 * 
	 */

	@Override
	public void clear() {
		head = null;
		tail = null;
		size = 0;
	}

	/**
	 * Returns the index of the first occurrence of search in the list. If
	 * search is not found, then indexOf() should return -1.
	 *
	 *
	 * @param search
	 *            Object that might be stored in list
	 * @returns integer that represents index of the Object search
	 * 
	 */

	@Override
	public int indexOf(Object search) {
		// get first node in list
		Node<T> currentNode = head;

		// int to keep track of index
		int index = 0;

		// go through all nodes until you reach the end
		// where next would be null
		while (currentNode != null) {
			// compare object stored in current node with
			// Object passed into this method
			if (currentNode.getValue().equals(search)) {
				return index;
			}
			// advance to next node
			index++;
			currentNode = currentNode.getNext();
		}
		return -1;
	}

	/**
	 * Returns true if passed in object is found in list
	 *
	 * @param search
	 *            Object that might be stored in list
	 * @returns true if Object is found in list
	 * 
	 * 
	 */
	@Override
	public boolean contains(Object search) {
		// get first node in list
		Node<T> currentNode = head;
		// System.out.print(search + ", ");
		// go through all nodes until you reach the end
		// where next would be null
		while (currentNode != null) {
			// compare object stored in current node with
			// Object passed into this method
			if (currentNode.getValue().equals(search)) {

				return true;
			}
			// advance to next node
			currentNode = currentNode.getNext();
		}
		return false;
	}

	/**
	 * Returns the element at the given index. Your method should validate the
	 * given index.
	 *
	 *
	 * @param index
	 *            integer representing location of desired Value
	 * @returns T the Value in the node at Index
	 * 
	 */
	@Override
	public T get(int index) {
		if ((index < size) && (index >= 0)) {
			// get first node in list
			Node<T> currentNode = head;

			// int to keep track of index
			int listIndex = 0;

			// go through all nodes until you reach the end
			// where next would be null
			while (currentNode != null) {
				// compare list passed into method with listIndex
				if (listIndex == index) {
					return currentNode.getValue();
				}
				// advance to next node
				listIndex++;
				currentNode = currentNode.getNext();
			}
		}
		throw new IndexOutOfBoundsException("index is out of range");
	}

	/**
	 * Returns the element at the given index. Your method should validate the
	 * given index.
	 *
	 *
	 * @param index
	 *            integer representing location of desired Value
	 * @param value
	 *            Object to be stored in List at specified index
	 * @returns T the Value in the node at Index
	 * 
	 */
	@Override
	public T set(int index, T value) {

		if ((index < size) && (index >= 0)) {
			// get first node in list
			Node<T> currentNode = head;

			// int to keep track of index
			int listIndex = 0;

			// go through all nodes until you reach the end
			// where next would be null
			while (currentNode != null) {
				// compare list passed into method with listIndex
				// if the same replace value in currentNode with passed in value
				if (listIndex == index) {
					T oldValue = currentNode.getValue();
					currentNode.setValue(value);
					return oldValue;
				}
				// advance to next node
				listIndex++;
				currentNode = currentNode.getNext();
			}
		}
		throw new IndexOutOfBoundsException("index is out of range");
	}

	/**
	 * Returns true if passed in object is removed from list
	 *
	 * @param search
	 *            Object that might be stored in list
	 * @returns true if Object is removed from list
	 */
	@Override
	public boolean remove(Object search) {
		// get first node in list
		Node<T> currentNode = head;
		Node<T> prev = null;

		if ((size == 1) && (currentNode.getValue().equals(search))) {
			clear();
			return true;
		}

		// go through all nodes until you reach the end
		// where next would be null
		while (currentNode != null) {

			// compare object stored in current node with
			// Object passed into this method
			if (currentNode.getValue().equals(search)) {
				// if node is at first in the list move head pointer
				if (prev == null) {
					head = currentNode.getNext();
				} else if (tail == currentNode) {
					// if node is at end in the list move tail pointer and next
					// point in previous node
					tail = prev;
					prev.setNext(null);
				} else {
					// change the prev node to point to the next node
					prev.setNext(currentNode.getNext());
				}

				// reduce size since we removed a node
				size--;
				modCount++;
				// since we removed a node return true
				return true;

			}
			// store current node as previous
			prev = currentNode;
			// advance to next node
			currentNode = currentNode.getNext();

		}
		return false;
	}

	@Override
	public T remove(int index) {
		if ((index < 0) || (index > size)) {
			throw new IndexOutOfBoundsException("index is out of range");
		} else {
			Node<T> prev = null;
			Node<T> currentNode = head;
			for (int i = 0; i < index; i++) {
				// loop through list until we get to correct index
				prev = currentNode;
				currentNode = currentNode.getNext();
			}

			// set point previous node to next node in list
			if (prev == null) {
				head = currentNode.getNext();
			} else {
				prev.setNext(currentNode.getNext());
			}

			// since we removed a node decrease size by one
			size--;
			modCount++;
			return currentNode.getValue();
		}

	}

	// part #2
	/**
	 * Appends all of the elements in the specified collection to the end of
	 * this list, in the order that they are returned by the specified
	 * collection's iterator (optional operation).
	 * 
	 * The behavior of this operation is undefined if the specified collection
	 * is modified while the operation is in progress.
	 * 
	 * (Note that this will occur if the specified collection is this list, and
	 * it's nonempty.)
	 *
	 * @param other
	 *            - collection containing elements to be added to this list
	 * @returns true if this list changed as a result of the call
	 */
	@Override
	public boolean addAll(Collection<? extends T> other) {
		Iterator<? extends T> otherIterator = other.iterator();
		Node<T> prevNode = tail;
		while (otherIterator.hasNext()) {
			Node<T> currentNode = new Node<T>();
			currentNode.setValue(otherIterator.next());
			prevNode.setNext(currentNode);
			prevNode = currentNode;
			size++;
			modCount++;
		}
		tail = prevNode;
		return true;
	}

	/**
	 * Inserts all of the elements in the specified collection into this list at
	 * the specified position (optional operation).
	 * 
	 * Shifts the element currently at that position (if any) and any subsequent
	 * elements to the right (increases their indices).
	 * 
	 * The new elements will appear in this list in the order that they are
	 * returned by the specified collection's iterator.
	 * 
	 * The behavior of this operation is undefined if the specified collection
	 * is modified while the operation is in progress.
	 * 
	 * (Note that this will occur if the specified collection is this list, and
	 * it's nonempty.)
	 * 
	 * @param index
	 *            - index at which to insert the first element from the
	 *            specified collection
	 * @param other
	 *            - collection containing elements to be added to this list
	 * @returns true if this list changed as a result of the call
	 */
	@Override
	public boolean addAll(int index, Collection<? extends T> other) {
		if ((index < 0) || (index > size)) {
			throw new IndexOutOfBoundsException("index is out of range");
		} else if (other.isEmpty()) {
			return false;
		} else {
			Node<T> prev = null;
			Node<T> currentNode = head;
			for (int i = 0; i < index; i++) {
				// loop through list until we get to correct index
				prev = currentNode;
				currentNode = currentNode.getNext();
			}

			Node<T> omega = currentNode;
			Iterator<? extends T> otherIterator = other.iterator();
			if (index == 0) {
				Node<T> newNode = new Node<T>();
				newNode.setValue(otherIterator.next());
				head = newNode;
				prev = newNode;
				size++;
				modCount++;

			}
			while (otherIterator.hasNext()) {
				Node<T> newNode = new Node<T>();
				newNode.setValue(otherIterator.next());
				prev.setNext(newNode);
				prev = newNode;
				size++;
				modCount++;

			}

			if (omega == null) {
				tail = prev;
			} else {
				prev.setNext(omega);
			}

			return true;
		}

	}

	/**
	 * Returns true if this list contains all of the elements of the specified
	 * collection.
	 * 
	 * @param other
	 *            - collection to be checked for containment in this list
	 * @returns true if this list contains all of the elements of the specified
	 *          collection
	 */
	@Override
	public boolean containsAll(Collection<?> other) {
		if (other.isEmpty()) {
			return true;
		}

		Iterator<?> otherIterator = other.iterator();

		while (otherIterator.hasNext()) {
			if (!this.contains(otherIterator.next())) {
				return false;
			}
		}

		return true;
	}

	/**
	 * Removes from this list all of its elements that are contained in the
	 * specified collection (optional operation).
	 * 
	 * @param other
	 *            - collection containing elements to be removed from this list
	 * @returns true if this list changed as a result of the call
	 */
	@Override
	public boolean removeAll(Collection<?> other) {
		if (other.isEmpty()) {
			return false;
		}
		boolean doesChange = false;
		Iterator<?> thisIterator = this.iterator();

		while (thisIterator.hasNext()) {
			if (other.contains(thisIterator.next())) {
				thisIterator.remove();
				doesChange = true;
			}
		}

		return doesChange;
	}

	/**
	 * Retains only the elements in this list that are contained in the
	 * specified collection (optional operation). In other words, removes from
	 * this list all of its elements that are not contained in the specified
	 * collection.
	 * 
	 * @param other
	 *            - collection containing elements to be retained from this list
	 * @returns true if this list changed as a result of the call
	 */
	@Override
	public boolean retainAll(Collection<?> other) {
		if (other.isEmpty() && !this.isEmpty()) {
			this.clear();
			return true;
		}
		boolean doesChange = false;
		Iterator<?> thisIterator = this.iterator();

		while (thisIterator.hasNext()) {
			if (!other.contains(thisIterator.next())) {
				thisIterator.remove();
				doesChange = true;
			}
		}

		return doesChange;
	}

	/**
	 * Returns a new list that contains the elements in this list from fromIndex
	 * to toIndex.
	 * 
	 * @param fromIndex
	 *            - low endpoint (inclusive) of the subList
	 * @param toIndex
	 *            - high endpoint (exclusive) of the subList
	 * @returns a view of the specified range within this list
	 */
	@Override
	public List<T> subList(int fromIndex, int toIndex) {
		if ((fromIndex < 0) || (fromIndex > size) || (toIndex < 0) || (toIndex > size)) {
			throw new IndexOutOfBoundsException("index is out of range");
		}
		if (toIndex < fromIndex) {
			throw new IndexOutOfBoundsException("Did you really mean to go from " + fromIndex + " to " + toIndex + "?");
		}
		LinkedList<T> newList = new LinkedList<T>();
		int counter = 0;
		Iterator<T> originalListIterator = iterator();

		while (originalListIterator.hasNext()) {
			if (counter < fromIndex) {
				originalListIterator.next();
				counter++;
			} else if (counter < toIndex) {
				newList.add(originalListIterator.next());
				counter++;
			} else {
				break;
			}
		}

		return newList;

	}

	/**
	 * Returns an array containing all of the elements in this list in proper
	 * sequence (from first to last element).
	 * 
	 * @returns an array containing all of the elements in this list in proper
	 *          sequence
	 */
	@Override
	public Object[] toArray() {
		Object[] arrayFromList = new Object[this.size];
		int index = 0;

		Iterator<?> arrayIterator = this.iterator();

		while (arrayIterator.hasNext()) {
			arrayFromList[index] = arrayIterator.next();
			index++;
		}

		return arrayFromList;
	}

	/**
	 * Returns an array containing all of the elements in this list in proper
	 * sequence (from first to last element); the runtime type of the returned
	 * array is that of the specified array.
	 * 
	 * If the list fits in the specified array, it is returned therein.
	 * 
	 * Otherwise, a new array is allocated with the runtime type of the
	 * specified array and the size of this list.
	 * 
	 * @returns an array containing all of the elements in this list in proper
	 *          sequence
	 */
	@SuppressWarnings("unchecked")
	@Override

	public <K> K[] toArray(K[] toFill) {
		K[] newtoFill;

		if (toFill.length < this.size()) {
			newtoFill = (K[]) Array.newInstance(toFill.getClass().getComponentType(), size());
		} else {
			newtoFill = toFill;
		}

		int index = 0;

		Iterator<T> arrayIterator = iterator();

		while (arrayIterator.hasNext()) {
			newtoFill[index] = (K) arrayIterator.next();
			index++;
		}
		if (newtoFill.length > this.size()) {
			for (int i = index; i < newtoFill.length; i++) {
				newtoFill[i] = null;
			}
		}

		return newtoFill;
	}

	/**
	 * Returns an iterator over the elements in this list in proper sequence.
	 * 
	 * @returns an iterator over the elements in this list in proper sequence
	 */
	@Override
	public Iterator<T> iterator() {
		ListIterator<T> iterator = new ListIterator<T>(this);
		return iterator;
	}

	// extra credit below...

	@Override
	public java.util.ListIterator<T> listIterator(int index) {
		throw new UnsupportedOperationException("This method is not supported.");
	}

	@Override
	public int lastIndexOf(Object search) {
		throw new UnsupportedOperationException("This method is not supported.");
	}

	@Override
	public java.util.ListIterator<T> listIterator() {
		throw new UnsupportedOperationException("This method is not supported.");

	}

	public static class ListIterator<T> implements Iterator<T> {

		private Node<T> nextNode;
		private Node<T> prevPrevNode;
		private Node<T> prevNode;
		private T data;
		private int currentModCount;
		private LinkedList<T> list;

		/**
		 * Returns true if this list iterator has more elements when traversing
		 * the list in the forward direction. (In other words, returns true if
		 * next() would return an element rather than throwing an exception.)
		 * 
		 * 
		 * @returns true if the list iterator has more elements when traversing
		 *          the list in the forward direction
		 */
		public ListIterator(LinkedList<T> list) {
			prevPrevNode = null;
			nextNode = list.head;
			this.list = list;
			currentModCount = list.modCount;
		}

		/**
		 * Returns true if this list contains all of the elements of the
		 * specified collection.
		 * 
		 * @param other
		 *            - collection to be checked for containment in this list
		 * @returns true if this list contains all of the elements of the
		 *          specified collection
		 */
		public boolean hasNext() {
			if (currentModCount != list.modCount) {
				throw new ConcurrentModificationException("You cannot change a list while iterating over it.");
			}
			return (nextNode != null);

		}

		/**
		 * Returns the next element in the list and advances the cursor
		 * position. This method may be called repeatedly to iterate through the
		 * list, or intermixed with calls to previous() to go back and forth.
		 * 
		 * (Note that alternating calls to next and previous will return the
		 * same element repeatedly.)
		 * 
		 * @returns the next element in the list
		 */
		public T next() {
			if (currentModCount != list.modCount) {
				throw new ConcurrentModificationException("You cannot change a list while iterating over it.");
			}
			if (!hasNext()) {
				throw new IllegalStateException("No more Nodes");
			} else {
				data = nextNode.getValue();
				prevPrevNode = prevNode;
				prevNode = nextNode;
				nextNode = prevNode.next;
				return data;
			}
		}

		/**
		 * Removes from the list the last element that was returned by next() or
		 * previous() (optional operation). This call can only be made once per
		 * call to next or previous. It can be made only if add(E) has not been
		 * called after the last call to next or previous.
		 */
		public void remove() {
			if (currentModCount != list.modCount) {
				throw new ConcurrentModificationException("You cannot change a list while iterating over it.");
			}
			if (prevPrevNode == null) {
				list.head = nextNode;
			} else {
				prevPrevNode.setNext(nextNode);
			}
			prevNode = prevPrevNode;

			if (!hasNext()) {
				list.tail = prevPrevNode;
			}
			list.size--;
			currentModCount++;
			list.modCount++;

		}
	}
}
