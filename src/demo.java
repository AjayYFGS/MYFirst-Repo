import java.io.Serializable;
import java.util.*;

public class demo {

		public static void main(String[] args) {
		
			ArrayList l=new ArrayList();
			
			LinkedList l1=new LinkedList();
			HashSet h=new HashSet();
			l.add(2);
			l.add("ajay");
			l.add("raju");
			l.add(8);
			l1.addFirst("audb");
			l1.addLast(23);
			
			l.add(10);
			h.addAll(l);
			//l.retainAll(l1);
			//System.out.println(l1.getFirst());
			l1.forEach(a->{System.out.println(a);});
			for (Object obj:l) {
				
				System.out.println(obj);
			}
			System.out.println(l);
			System.out.println(h);
			System.out.println(l1);
			System.out.println(h.size());
	}
 
}
