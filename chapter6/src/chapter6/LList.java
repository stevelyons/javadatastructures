package chapter6;

public class LList <T> implements ListInterface<T>
{
	private Node firstNode;    // reference to first node
	private int length;   	   // number of entries in list
	
	public LList()
	{
		clear();
	} // end default constructor
	
	public final void clear()
	{
		firstNode = null;
		length = 0;
	} // end clear
	
	
	private Node getNodeAt(int givenPosition)
	{
		
	} // end of getNodeAt

	private class Node
	{
		
	} // end of Node

	@Override
	public boolean add(T newEntry) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean add(int newPosition, T newEntry) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T remove(int givenPosition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean replace(int givenPosition, T newEntry) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T getEntry(int givenPosition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean contains(T anEntry) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getLength() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
} // end of LList
