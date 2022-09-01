import java.util.*;

public class List {

	public static void main(String[]arg) {
		HashSet al=new HashSet();
		al.add("offer");
		al.add(11);
		al.add(0.75);
		al.add("Quenu");
		al.add("lower");
		al.add(10);
		al.add(56);
		al.add("navegableset");
		System.out.println(al);
		/*for(int i=0;i<al.size();i++) {
			Object o=al.get(i);
			System.out.println(o);
			if (o.equals(11)) {
				al.set(i,15);
			}
			
		}System.out.println(al);*/
		for (Object o:al) {
			System.out.println(o);
			
		}System.out.println(al);
	}
	
}
