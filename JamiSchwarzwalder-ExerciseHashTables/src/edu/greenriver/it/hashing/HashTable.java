package edu.greenriver.it.hashing;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class HashTable<T> implements Set<T> {

	public HashTable() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean add(T arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	private static class HashTableElement {
		private Object element;
		private boolean isEmpty; // true, the element is deleted otherwise false

		public HashTableElement(Object element, boolean isEmpty) {
			this.element = element;
			this.isEmpty = isEmpty;
		}
		
		public String toString(){
			if (isEmpty){
				return "empty";
			} 
			return element.toString();
		}
	}
	// we are not implementing beyond this point

	@Override
	public boolean addAll(Collection<? extends T> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean containsAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
