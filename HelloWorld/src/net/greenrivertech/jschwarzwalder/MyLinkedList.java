package net.greenrivertech.jschwarzwalder;

public class MyLinkedList<AnyType> implements Iterable<AnyType> {
	private static class Node<AnyType> {
		public Node(AnyType d, Node<AnyType> p, Node<AnyType> n) {
			data = d;
			prev = p;
			next = n;
		}

		public AnyType data;
		public Node<AnyType> prev;
		public Node<AnyType> next;
	}

	public MyLinkedList() {
		doClear();
	}

	private void doClear() {
		beginMarker = new Node<AnyType>(null, null, null);
		endMarker = new Node<AnyType>(null, beginMarker, null);
		beginMarker.next = endMarker;

		theSize = 0;
		modCount++;
	}
	public int size() {
		return theSize;
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	public boolean add(AnyType x) {
		add(size(), x);
		return true;
	}

	public void add(int idx, AnyType x) {
		addBefore(getNode(idx, 0, size()), x);
	}

	public AnyType get(int idx) {
		return getNode(idx).data;
	}

	public AnyType set(int idx, AnyType newVal) {
		Node<AnyType> p = getNode(idx);
		AnyType oldVal = p.data;
		p.data = newVal;
		return oldVal;
	}

	public AnyType remove(int idx) {
		return remove(getNode(idx));
	}

	private void addBefore(Node<AnyType> p, AnyType x) {
		/* Figure 3.28 */ }

	private AnyType remove(Node<AnyType> p) {
		/* Figure 3.30 */ }

	private Node<AnyType> getNode(int idx) {
		/* Figure 3.31 */ }

	private Node<AnyType> getNode(int idx, int lower, int upper) {
		/* Figure 3.31 */ }

	public java.util.Iterator<AnyType> iterator() {
		return new LinkedListIterator();
	}

	private class LinkedListIterator implements java.util.Iterator<AnyType> {
		/* Figure 3.32 */ }

	private int theSize;
	private int modCount = 0;
	private Node<AnyType> beginMarker;
	private Node<AnyType> endMarker;
}