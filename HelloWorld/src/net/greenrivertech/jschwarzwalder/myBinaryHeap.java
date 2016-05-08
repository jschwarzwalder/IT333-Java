package net.greenrivertech.jschwarzwalder;

public class myBinaryHeap<AnyType extends Comparable<? super AnyType>> {
	public myBinaryHeap() {
		/* See online code */ }

	public myBinaryHeap(int capacity) {
		/* See online code */ }

	public myBinaryHeap(AnyType[] items) {
		/* Figure 6.14 */ }

	/**
	 * Insert into the priority queue, maintaining heap order. Duplicates are
	 * allowed.
	 * 
	 * @param x
	 *            the item to insert.
	 */
	public void insert(AnyType x) {
		if (currentSize == array.length - 1)
			enlargeArray(array.length * 2 + 1);

		// Percolate up
		int hole = ++currentSize;
		for (array[0] = x; x.compareTo(array[hole / 2]) < 0; hole /= 2)
			array[hole] = array[hole / 2];
		array[hole] = x;
	}

	public AnyType findMin() {
		/* See online code */ }

	/**
	 * Remove the smallest item from the priority queue.
	 * 
	 * @return the smallest item, or throw UnderflowException, if empty.
	 */
	public AnyType deleteMin() {
		if (isEmpty())
			throw new UnderflowException();

		AnyType minItem = findMin();
		array[1] = array[currentSize--];
		percolateDown(1);

		return minItem;
	}

	public boolean isEmpty() {
		/* See online code */ }

	public void makeEmpty() {
		/* See online code */ }

	private static final int DEFAULT_CAPACITY = 10;

	private int currentSize; // Number of elements in heap
	private AnyType[] array; // The heap array

	/**
	 * Internal method to percolate down in the heap.
	 * 
	 * @param hole
	 *            the index at which the percolate begins.
	 */
	private void percolateDown(int hole) {
		int child;
		AnyType tmp = array[hole];

		for (; hole * 2 <= currentSize; hole = child) {
			child = hole * 2;
			if (child != currentSize && array[child + 1].compareTo(array[child]) < 0)
				child++;
			if (array[child].compareTo(tmp) < 0)
				array[hole] = array[child];
			else
				break;
		}
		array[hole] = tmp;
	}

	private void buildHeap() {
		/* Figure 6.14 */ }

	private void enlargeArray(int newSize) {
		/* See online code */ }
}