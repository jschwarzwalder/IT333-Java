package net.greenrivertech.jschwarzwalder;

public class MyBinarySearchTree<AnyType extends Comparable<? super AnyType>> {
	private static class BinaryNode<AnyType> {
		// Constructors
		BinaryNode(AnyType theElement) {
			this(theElement, null, null);
		}

		BinaryNode(AnyType theElement, BinaryNode<AnyType> lt, BinaryNode<AnyType> rt) {
			element = theElement;
			left = lt;
			right = rt;
		}

		AnyType element; // The data in the node
		BinaryNode<AnyType> left; // Left child
		BinaryNode<AnyType> right; // Right child
	}


	private BinaryNode<AnyType> root;

	public MyBinarySearchTree() {
		root = null;
	}

	public void makeEmpty() {
		root = null;
	}

	public boolean isEmpty() {
		return root == null;
	}

	public boolean contains(AnyType x) {
		return contains(x, root);
	}

	public AnyType findMin() {
		if (isEmpty())
			throw new UnderflowException();
		return findMin(root).element;
	}

	public AnyType findMax() {
		if (isEmpty())
			throw new UnderflowException();
		return findMax(root).element;
	}

	public void insert(AnyType x) {
		root = insert(x, root);
	}

	public void remove(AnyType x) {
		root = remove(x, root);
	}

	public void printTree() {
		/* Figure 4.56 */ }

	private boolean contains(AnyType x, BinaryNode<AnyType> t) {
		/* Figure 4.18 */ }

	private BinaryNode<AnyType> findMin(BinaryNode<AnyType> t) {
		/* Figure 4.20 */ }

	private BinaryNode<AnyType> findMax(BinaryNode<AnyType> t) {
		/* Figure 4.20 */ }

	private BinaryNode<AnyType> insert(AnyType x, BinaryNode<AnyType> t) {
		/* Figure 4.22 */ }

	private BinaryNode<AnyType> remove(AnyType x, BinaryNode<AnyType> t) {
		/* Figure 4.25 */ }

	private void printTree(BinaryNode<AnyType> t) {
		/* Figure 4.56 */ }
}
