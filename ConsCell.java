/**
* @author Michael Jonaitis
* @version November 1, 2010 
* @class CPS-326
* @professor Bowers
*/

public class ConsCell {
	
	int item;
	ConsCell next;

	public ConsCell(int theItem, ConsCell theNext)
	{
		item = theItem;
		next = theNext;
	}
	public int getHead()
	{
		return item;
	}
	public ConsCell getTail()
	{
		return next;
	}
	public void setNext(ConsCell next)
	{
		this.next = next;
	}
	public void setItem(int num)
	{
		item = num;
	}
	
}
