package net.greenrivertech.jschwarzwalder;

public class QuadraticProbingHashTable<AnyType> {
	/**
	 * Construct the hash table.
	 */
	public QuadraticProbingHashTable() {
		this(DEFAULT_TABLE_SIZE);
	}

	/**
	 * Construct the hash table.
	 * 
	 * @param size
	 *            the approximate initial size.
	 */
	public QuadraticProbingHashTable(int size) {
		allocateArray(size);
		makeEmpty();
	}

	/**
	 * Make the hash table logically empty.
	 */
	public void makeEmpty() {
		currentSize = 0;
		for (int i = 0; i < array.length; i++)
			array[i] = null;
	}

	/**
	 * Find an item in the hash table.
	 * 
	 * @param x
	 *            the item to search for.
	 * @return the matching item.
	 */
	public boolean contains(AnyType x) {
		int currentPos = findPos(x);
		return isActive(currentPos);
	}

	/**
	 * Insert into the hash table. If the item is already present, do nothing.
	 * 
	 * @param x
	 *            the item to insert.
	 */
	public void insert(AnyType x) {
		// Insert x as active
		int currentPos = findPos(x);
		if (isActive(currentPos))
			return;

		array[currentPos] = new HashEntry<>(x, true);

		// Rehash; see Section 5.5
		if (++currentSize > array.length / 2)
			rehash();
	}

	/**
	 * Remove from the hash table.
	 * 
	 * @param x
	 *            the item to remove.
	 */
	public void remove(AnyType x) {
		int currentPos = findPos(x);
		if (isActive(currentPos))
			array[currentPos].isActive = false;
	}

	private static class HashEntry<AnyType> {
		public AnyType element; // the element
		public boolean isActive; // false if marked deleted

		public HashEntry(AnyType e) {
			this(e, true);
		}

		public HashEntry(AnyType e, boolean i) {
			element = e;
			isActive = i;
		}
	}

	private static final int DEFAULT_TABLE_SIZE = 11;

	private HashEntry<AnyType>[] array; // The array of elements
	private int currentSize; // The number of occupied cells

	/**
	 * Internal method to allocate array.
	 * 
	 * @param arraySize
	 *            the size of the array.
	 */
	private void allocateArray(int arraySize) {
		array = new HashEntry[nextPrime(arraySize)];
	}

	/**
	 * Return true if currentPos exists and is active.
	 * 
	 * @param currentPos
	 *            the result of a call to findPos.
	 * @return true if currentPos is active.
	 */
	private boolean isActive(int currentPos) {
		return array[currentPos] != null && array[currentPos].isActive;
	}

	/**
	 * Method that performs quadratic probing resolution in half-empty table.
	 * 
	 * @param x
	 *            the item to search for.
	 * @return the position where the search terminates.
	 */
	private int findPos(AnyType x) {
		int offset = 1;
		int currentPos = myhash(x);

		while (array[currentPos] != null && !array[currentPos].element.equals(x)) {
			currentPos += offset; // Compute ith probe
			offset += 2;
			if (currentPos >= array.length)
				currentPos -= array.length;
		}

		return currentPos;
	}



	/**
	 * Rehashing for quadratic probing hash table.
	 */
	private void rehash() {
		HashEntry<AnyType>[] oldArray = array;

		// Create a new double-sized, empty table
		allocateArray(nextPrime(2 * oldArray.length));
		currentSize = 0;

		// Copy table over
		for (int i = 0; i < oldArray.length; i++)
			if (oldArray[i] != null && oldArray[i].isActive)
				insert(oldArray[i].element);
	}

	private int myhash(AnyType x) {
		/* See online code */ }

	private static int nextPrime(int n) {
		/* See online code */ }

	private static boolean isPrime(int n) {
		/* See online code */ }
}
