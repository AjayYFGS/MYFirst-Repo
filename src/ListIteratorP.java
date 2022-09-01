import java.util.*;
public class ListIteratorP 
{
	
	public static void main(String [] ar)
	{	System.out.println("hello");
		LinkedList l=new LinkedList();
		for(int i=0;i<=10;i++) {
			l.add(i+3);
		}
		java.util.ListIterator ltr=l.listIterator();
		while(ltr.hasPrevious()) {
			Integer i=(Integer)ltr.previous();
			System.out.print(i);
		}
		
	}
	
}