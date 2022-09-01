import java.util.*;
public class Hashmap {

	public static void main(String[] args) {
	
		HashMap m=new HashMap();
		m.put("ajay",20000);
		m.put("raju",18000);
		m.put("sai",21000);
		m.put("venu",22000);
		System.out.println(m);
		System.out.println(m.put("raju",25000));
		System.out.println(m);
		Set s=m.keySet();
		System.out.println(s);
		Collection c=m.values();
		System.out.println(c);
		Set s1=m.entrySet();
		System.out.println(s1);
		Iterator i=s1.iterator();
		while(i.hasNext()) {
			Map.Entry m1=(Map.Entry)i.next();
			System.out.println(m1.getKey()+"-------"+m1.getValue());
			if(m1.getKey().equals("ajay")) {
				m1.setValue(35000);
			}
		}
		System.out.println(m);
		
		
		
		
		
	
	}
}
