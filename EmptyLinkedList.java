package edu.greenriver.edu.lists;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class EmptyLinkedList<T> implements List<T>
{
	// part #1 methods below...

	@Override
	public boolean add(T newElement)
	{
		return false;
	}

	@Override
	public void add(int index, T newElement)
	{

	}

	@Override
	public boolean isEmpty()
	{
		return false;
	}

	@Override
	public int size()
	{
		return 0;
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

	@Override
	public boolean contains(Object search)
	{
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

	@Override
	public boolean remove(Object search)
	{
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
