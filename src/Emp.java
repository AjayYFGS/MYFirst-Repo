

class Address{
	String city,state,country;
	Address(String city,String state,String country){
		this.city=city;
		this.state=state;
		this.country=country;
	}
}
	

public class Emp {
	int empid;
	String empname;
	Address Address;
	Emp(int empid,String empname,Address Address){
		this.empid=empid;
		this.empname=empname;
		this.Address=Address; 
	}
	void display() {
	 System.out.println(empid+" "+empname);
	 System.out.println(Address.city+" "+Address.state+" "+Address.country);
	
	}

	public static void main(String[] args) {

		Address a=new Address("hdy","telangana","india");
		Address a1=new Address("seddipet","telangana","india");
		// TODO Auto-generated method stub

		Emp e=new Emp(25,"ajay",a);
		Emp e1=new Emp(35,"raju",a1);
		e.display();
		e1.display();
		
	}

}
