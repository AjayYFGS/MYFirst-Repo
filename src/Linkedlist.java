import java.util.*;
public class Linkedlist {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("ajay");
		for(int i=0;i<=10;i++) {
			l.add(i);
			}
		System.out.println(l);
		Iterator itr=l.iterator();
		while(itr.hasNext()) {
		
			 System.out.println(itr.next());
		/*if(i%2==0)
			System.out.println(i);
		else
			itr.remove();*/
		}
		System.out.println(l);
	}	
}
	
