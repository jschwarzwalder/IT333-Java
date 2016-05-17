package edu.greenriver.it.heaps;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class EmptyHeap<T> implements Queue<T>
{
	public EmptyHeap()
	{

	}

	@Override
	public boolean add(T newElement) //insert() operation
	{
		return false;
	}

	@Override
	public T peek() //findMin() operation
	{
		return null;
	}

	@Override
	public T remove() //deleteMin() operation
	{
		return null;
	}

	@Override
	public int size()
	{
		return 0;
	}

	@Override
	public boolean isEmpty()
	{
		return false;
	}

	@Override
	public void clear()
	{
		
	}
	
	//ignore methods below this 

	@Override
	public boolean remove(Object search)
	{
		throw new UnsupportedOperationException("Method not supported.");
	}

	@Override
	public boolean contains(Object search)
	{
		throw new UnsupportedOperationException("Method not supported.");
	}

	@Override
	public T poll()
	{
		throw new UnsupportedOperationException("Method not supported.");
	}

	@Override
	public T element()
	{
		throw new UnsupportedOperationException("Method not supported.");
	}

	@Override
	public boolean offer(T e)
	{
		throw new UnsupportedOperationException("Method not supported.");
	}
	
	@Override
	public boolean addAll(Collection<? extends T> c)
	{
		throw new UnsupportedOperationException("Method not supported.");
	}

	@Override
	public boolean containsAll(Collection<?> c)
	{
		throw new UnsupportedOperationException("Method not supported.");
	}

	@Override
	public boolean removeAll(Collection<?> c)
	{
		throw new UnsupportedOperationException("Method not supported.");
	}

	@Override
	public boolean retainAll(Collection<?> c)
	{
		throw new UnsupportedOperationException("Method not supported.");
	}

	@Override
	public Iterator<T> iterator()
	{
		throw new UnsupportedOperationException("Method not supported.");
	}

	@Override
	public Object[] toArray()
	{
		throw new UnsupportedOperationException("Method not supported.");
	}

	@Override
	public <T> T[] toArray(T[] a)
	{
		throw new UnsupportedOperationException("Method not supported.");
	}
}
