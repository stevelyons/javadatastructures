package chapter2;

public class OrderedPair<T>
{
	private T first, second;
	
	public OrderedPair()
	{
	} // end of constructor
	
	public void setPair(T firstItem, T secondItem)
	{
		this.first = firstItem;
		this.second = secondItem;
	}
	
	public void changeOrder()
	{
		T temp = this.first;
		this.first = second;
		this.second = temp;
	} // end of changeOrder
	
	public String toString()
	{
		return "(" + this.first + ", " + this.second + ")";
	} // end of toString
} // end of OrderedPair