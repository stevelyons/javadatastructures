package chapter4;

/* An interface for the ADT list.
 * Entries in the list have positions that begin with 1.
 */
public interface ListInterface<T>
{
	/* Task: Adds a new entry to the end fo the list.
	 * 		 Entries currently in the list are unaffected.
	 * 		 the list's size is increased by 1.
	 * @param newEntry the object to be added as a new entry
	 * @return true if the addition is successful, or flase if the list is full
	 */
	
	/* Task: Adds a new entry at a specified postion within the list. 
	 * Entries originally at and aboe the apecified position are at the next higher 
	 * position with the list. the list's size is increased by 1.
	 */
	public boolean add(T newEntry);
	public boolean add(int newPositio, T newEntry);
	public T remove(int givenPosition);
	public void clear();
	public boolean replace (int givenPosition, T newEntry);
	public T getEntry(int givenPostion);
	public boolean contains(T anEntry);
	public int getLength();
	public boolean isEmpty();
	public boolean isFull();
	public void display();
} // end ListInterface
