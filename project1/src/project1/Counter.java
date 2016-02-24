package project1;

public class Counter
{
	private int count;
	
	Counter()
	{
	} // end of constructor
	
	Counter(int count)
	{
		this.count = count;
	} // end of constructor
	
	public void setCount(int number)
	{
		this.count = number;
	} // end of setCount
	
	public void incrementCount()
	{
		(this.count)++;
	} // end of incrementCount
	
	public void decrementCount()
	{
		(this.count)--;
	} // end of decrementCount
	
	public int getCount()
	{
		return this.count;
	} // end of getCount
	
	public String toString()
	{
		return this.count + "";
	} // end of toString
	
	public boolean isZero()
	{
		boolean status = true;
		if(this.count == 0) 
		{
			status = true;
		}
		else
		{
			status = false;
		}
		return status;
	}
} // end of Counter
