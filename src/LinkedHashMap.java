import java.util.*;
public class LinkedHashMap {

	public static void main(String[] args) {
		
		HashMap l=new HashMap();
		l.put("ajay",100000);
		l.put("raju",20000);
		l.put("maya",30000);
		System.out.println(l);
		Set k=l.keySet();
		System.out.println(k);
		Collection c=l.values();
		System.out.println(c);
		Set s=l.entrySet();
		/*Iterator i=s.iterator();
		while(i.hasNext()) {
			Map.Entry hm=(Map.Entry)i.next();
			System.out.println(hm.getKey()+" ---- "+hm.getValue());
			if(hm.getKey().equals("maya")) {
				hm.setValue(2324278);
			}
		}System.out.println(l);*/
		
			
		
	
	}
	

	
}
