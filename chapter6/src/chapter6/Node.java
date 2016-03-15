package chapter6;

private class Node<T>
{
	private T    data; 	// entry in list
	private Node next;  // link to next node
	
	private Node(T dataPortion)
	{
		data = dataPortion;
		next = null;
	} // end of constructor
	
	private Node (T dataPosition, Node nextNode)
	{
		data = dataPosition;
		next = nextNode;
	} // end of constructor

}