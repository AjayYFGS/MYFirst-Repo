import java.util.*;
import java.lang.*;
class Employee1 implements Comparable {
	
	int eids;
	
	public String enames;
	
	Employee1(int eid,String ename){
		this.eids=eid;
		this.enames=ename;
	}
	public String toString() {
		return eids+"----"+enames;
	}
	@Override
	public int compareTo(Object obj) {
		int eid1=this.eids;
		Employee1 e=(Employee1)obj;
		int eid2=e.eids;
		if (eid1>eid2)
			return 1;
		else if (eid2>eid1)
			return -1;
		else
		return 0;
	}
	
	
}




public class ComComDemo {

	public static void main(String[] args) {
		Employee1 e1=new Employee1(25,"ajay");
		Employee1 e2=new Employee1(23,"anu");
		Employee1 e3=new Employee1(13,"kan");
		Employee1 e4=new Employee1(27,"malik");
		Employee1 e5=new Employee1(17,"nayak");
		Employee1 e6=new Employee1(7,"maya");
		TreeSet t=new TreeSet();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		t.add(e6);
		System.out.println(t);
		TreeSet t1=new TreeSet(new  MyComparetor());
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		t1.add(e5);
		t1.add(e6);
		System.out.println(t1);
	}

}

class MyComparetor implements Comparator{
	
	public int compare(Object obj1,Object obj2) {
		Employee1 e1=(Employee1)obj1;
		Employee1 e2=(Employee1)obj2;
		String s1=e1.enames;
		String s2=e2.enames;
		return s1.compareTo(s2);
	}
	
	
	
}
