/**
* @author Michael Jonaitis
* @version November 1, 2010 
* @class CPS-326
* @professor Bowers
*/

public class IntList {
	
	private ConsCell first;
	
	public IntList(ConsCell theFirst)
	{
		first = theFirst;
	}
	
	public IntList cons(int theItem)
	{
		ConsCell newNode = new ConsCell(theItem, first);
		IntList newList = new IntList(newNode); 
		
		return newList;	
	}
	
	public Integer get(int i)
	{
		ConsCell temp = first;
		Integer num = null;
		int c = 0;
		
		if(i + 1 > getLength())
		{
			return num;
		}
		while(c <= i && temp != null)
		{
			num = temp.item;
		    temp = temp.next;
		    c++;
		}
		
		return num;
	}
	
	public int getLength()
	{
		ConsCell temp = first;
		int i = 0;
		
		while(temp != null)
		{
			temp = temp.next;
			i++;
		}
		
		return i;
	}
	
	public String toString()
	{
		ConsCell temp = first;
		String list = "";
		
		while(temp != null)
		{
			list = list + " " + temp.item;
			temp = temp.next;
		}
		
		return list;
	}
	
	public boolean contains(int i)
	{
		ConsCell temp = first;

		while(temp != null)
		{
			if(temp.item == i)
			{
				return true;
			}
			temp = temp.next;
		}
		return false;
	}
	
	public boolean isEquivalent(IntList rhsList)
	{
		int i = 0;
		IntList lhsList = new IntList(first);
		
		if(getLength() != rhsList.getLength())
			return false;
		else
		{
			while(i < getLength())
			{
				if(lhsList.get(i) != rhsList.get(i))
					return false;
				
				i++;
			}	
			return true;
		}	
	}
	
	public int sum()
	{
		int i = 0;
		int total = 0;
		while(i < getLength())
		{
			total = total + get(i); 
			i++;
		}	
		return total;
	}
	
	public IntList reverse()
	{
		if(first == null)
			return new IntList(null);
		ConsCell nc = null;
		
		for(int i = 0; i < getLength(); i++)
		{
			ConsCell c = new ConsCell(get(i), nc);
			nc = new ConsCell(c.getHead(), nc);
		}
		return new IntList(nc);  
	}
	
	public IntList append(IntList rhsList)
	{
		if(first == null)
		{
			return rhsList;
		}
		
		ConsCell nc = null;
		
		for(int i = rhsList.getLength() - 1; i >= 0; i--)
		{
			ConsCell c = new ConsCell(rhsList.get(i), nc);
			nc = new ConsCell(c.getHead(), nc);
		}
		for(int i = getLength()-1; i >= 0; i--)
		{
			ConsCell c = new ConsCell(get(i), nc);
			nc = new ConsCell(c.getHead(), nc);
		}
		return new IntList(nc);
	}
	
	public IntList swap(int pos1, int pos2)
	{
		int val1 = get(pos1);
		int val2 = get(pos2);
	
		ConsCell nc = null;
		
		for(int i = getLength() - 1; i >= 0; i--)
		{
			ConsCell c = new ConsCell(get(i), nc);
			
			if(i == pos1)
			{
				c.setItem(val2);
			}
			else if(i == pos2)
			{
				c.setItem(val1);
			}
			
			nc = new ConsCell(c.getHead(), nc);	
		}
		return new IntList(nc);
	}
	
	public IntList sublist(int pos1, int pos2)
	{
		ConsCell nc = null;
		
		if(pos1 > getLength() - 1 && pos2 > getLength())
			return new IntList(null);
		else if(pos1 < 0 && pos2 < 0)
			return new IntList(null);
		if(pos1 < 0)
		{
			pos1 = 0;
		}
		if(pos2 > getLength() - 1)
		{
			pos2 = getLength() -1;
		}
		for(int i = getLength() - 1; i >= 0; i--)
		{
			if(i >= pos1 && i <= pos2)
			{
			ConsCell c = new ConsCell(get(i), nc);
			nc = new ConsCell(c.getHead(), nc);	
			}
		}
		 return new IntList(nc);
	}
		
	public IntList rotate()
	{
		ConsCell end = new ConsCell(get(getLength() - 1), null);
		ConsCell nc = null;

		for(int i = getLength() - 2; i >= 0; i--)
		{
			ConsCell c = new ConsCell(get(i), nc);
			nc = new ConsCell(c.getHead(), nc);
		}
		
		end = new ConsCell(end.getHead(),nc);
		
		return new IntList(end);
	}

	public void reverseMe()
	{
	    ConsCell temp = first;
	    first = null;
	    while (temp != null)
	    {
	        ConsCell save = temp;
	        temp = temp.next;
	        save.next = first;
	        first = save;
	    }
	}
}

