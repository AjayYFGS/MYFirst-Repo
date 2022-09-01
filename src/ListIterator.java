import java.util.*;
public class ListIterator {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("ajay");
		l.add("raju");
		l.add("rama");
		l.add("maya");
		System.out.println(l);
		java.util.ListIterator ltr=l.listIterator();
		while(ltr.hasNext()) {
			String i=(String)ltr.next();
			if(i.equals("raju")) {
				ltr.remove();
				System.out.println(l);
			}
			else if(i.equals("rama")) {
				ltr.add("anu");
				System.out.println(l);
			}
			else if (i.equals("maya")){
				ltr.set("venna");
				System.out.println(l);
			}
		}
		System.out.println(l);

	}

}
