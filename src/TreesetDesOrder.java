import java.util.Comparator;
import java.util.TreeSet;
class TreesetDesOrder {

	public static void main(String[] args) {
		TreeSet<String> t=new TreeSet<String>(new Mycomparator());
		/*t.add(23);
		t.add(65);
		t.add(10);
		t.add(0);
		t.add(65);*/
		t.add("Roja");
		t.add("ShobhaRani");
		t.add("RajaKumar");
		t.add("GangaBhavani");
		t.add("Ramulamma");
		System.out.println(t);
	}
}
class Mycomparator implements Comparator{
	public int compare(Object obj1,Object obj2) {
		/*Integer i1=(Integer)obj1;
		Integer i2=(Integer)obj2;
		if (i1>i2)
			return -1;
		else if(i1<i2)
			return +1;
		else 
			return 0;*/
		String s1=obj1.toString();
		String s2=(String)obj2;
		//return s2.compareTo(s1);
		//return -s1.compareTo(s2);
		return s1.compareTo(s2);
	}
}
