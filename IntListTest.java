/**
* @author Michael Jonaitis
* @version November 1, 2010 
* @class CPS-326
* @professor Bowers
*/

public class IntListTest {


	public static void main(String[] args) {
		
		IntList a = new IntList(null);
		IntList b = a.cons(2);
		IntList c = b.cons(1);
		
System.out.println("---getLength() Tests Starting---");

		assert(c.getLength() == 2);
			
System.out.println("---get() Tests Starting---");
		
		Integer r = c.get(0);
		
		assert(r == 1);
		r = c.get(1);
		assert(r == 2);
		r = c.get(-1);
		assert(r == null);
	
System.out.println("---contains() Tests Starting---");
		
		boolean test1 = c.contains(2);
		boolean test2 = c.contains(1);
		boolean test3 = c.contains(5);
		
		assert(test1 == true);
		assert(test2 == true);
		assert(test3 == false);

System.out.println("---isEquivalent() Tests Starting---");
		
		IntList a1 = new IntList(null);
		IntList b1 = a1.cons(2);
		IntList c1 = b1.cons(1);
		
		assert(c1.isEquivalent(c));
		
System.out.println("---sum() Tests Starting---");
		
		assert(c.sum() == 3);
			
System.out.println("---reverse() Tests Starting---");
		
		IntList k = c.reverse();
		assert(k.toString().equals(" 2 1"));
		
System.out.println("---append() Tests Starting---");
		
		IntList a4 = new IntList(null);
		IntList b4 = a4.cons(5);
		IntList c4 = b4.cons(6);
		IntList d4 = c4.cons(8);
		
		IntList zz = c.append(d4);
		
		assert(zz.toString().equals(" 1 2 8 6 5"));
	
System.out.println("---swap() Tests Starting---");
	
		IntList a5 = new IntList(null);
		IntList b5 = a5.cons(5);
		IntList c5 = b5.cons(6);
		IntList d5 = c5.cons(8);
		
		IntList zz1 = d5.swap(0, 1);
		
		assert(zz1.toString().equals(" 6 8 5"));
	
System.out.println("---sublist() Tests Starting---");
	
		IntList a6 = new IntList(null);
		IntList b6 = a6.cons(5);
		IntList c6 = b6.cons(6);
		IntList d6 = c6.cons(8);
		IntList e6 = d6.cons(9);
		
		IntList zz2 = e6.sublist(-1, 1);
	
		assert(zz2.toString().equals(" 9 8"));
	
System.out.println("---reverseMe() Tests Starting---");

		IntList a7 = new IntList(null);
		IntList b7 = a7.cons(5);
		IntList c7 = b7.cons(6);
		IntList d7 = c7.cons(8);
	
		d7.reverseMe();
		
		assert(d7.toString().equals(" 5 6 8"));
		
System.out.println("---subsets() Tests Starting---");
		
		}
}
