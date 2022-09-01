import java.util.*;
public class DesHetero {

	public static void main(String[] args) {
		TreeSet t=new TreeSet(new Mycomparator());
		t.add("A");
		t.add(new StringBuffer("ABC"));
		t.add(new StringBuffer("AA"));
		t.add("XX");
		t.add("A");
		System.out.println(t);

	}

}
class MyComparator implements Comparable
{
	public int compare(Object obj1,Object obj2) {
		String s1=obj1.toString();
		String s2=obj2.toString();
		int l1=s1.length();
		int l2=s2.length();
		if(l1>l2)
			return -1;
		else if (l1<l2)
			return 1;
		else
			return s1.compareTo(s2);
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}