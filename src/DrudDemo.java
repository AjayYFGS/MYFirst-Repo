import java.util.*;
import java.io.*;
class Employee implements Serializable{
	int empno;
	String empname;
	String emprole;
	int empsal;
	Employee(int empno,String empname,String emprole,int empsal){
		this.empno=empno;
		this.empname=empname;
		this.emprole=emprole;
		this.empsal=empsal;
	}
	public int getempno() {
		return empno;
	}
	public String getempname() {
		return empname;
	}
	public String getemprole() {
		return emprole;
	}
	public int getempsal() {
		return empsal;
	}
	public String toString() {
		return empno+" "+empname+" "+emprole+" "+empsal;
	}
}
public class DrudDemo {

	
	public static void main(String[] args)  {
		
		int ch;
		ArrayList<Employee> c=new ArrayList<Employee>();
		Scanner s=new Scanner(System.in);
		Scanner s1=new Scanner(System.in);
		
		do {
			System.out.println("1.Insert");
			System.out.println("2.Display");
			System.out.println("3.Search");
			System.out.println("4.Delete");
			System.out.println("5.Update");
			System.out.print("Enter your choiec:--");
			ch=s.nextInt();
			
			switch(ch) {
			case 1:
				System.out.print("Enter emp No:--");
				int empno=s.nextInt();
				System.out.print("Enter emp Name:--");
				String empname=s1.nextLine();
				System.out.print("Enter emp Role:--");
				String emprole=s1.nextLine();
				System.out.print("Enter emp Salary:--");
				int empsal=s.nextInt();
				c.add(new Employee(empno,empname,emprole,empsal));
				
				
			break;
			case 2:
				Iterator<Employee> i=c.iterator();
				System.out.println("----------------------------");
				while(i.hasNext()) {
					Employee e=i.next();
					System.out.println(e);
				}
				System.out.println("----------------------------");
			break;
			case 3:
				boolean found=false;
				System.out.print("Enter empno to search:--");
				empno=s.nextInt();
				i=c.iterator();
				System.out.println("----------------------------");
				while(i.hasNext()) {
					Employee e=i.next();
					if(e.getempno() == empno) {
						System.out.println(e);
						found=true;
					}
				}
				if (!found) {
					System.out.println("Record is not found");
				}
				System.out.println("----------------------------");
			break;
			case 4:
				found=false;
				System.out.print("Enter empno to search:--");
				empno=s.nextInt();
				i=c.iterator();
				System.out.println("----------------------------");
				while(i.hasNext()) {
					Employee e=i.next();
					if(e.getempno() == empno) {
						i.remove();
						System.out.println("Record Delete has been done");
						found=true;
					}
				}
				if (!found) {
					System.out.println("Record is not found");
				}
				System.out.println("----------------------------");
			break;
			case 5:
				found=false;
				System.out.print("Enter empno to Update--");
				empno=s.nextInt();
			    java.util.ListIterator<Employee> li=c.listIterator();
				System.out.println("----------------------------");
				while(li.hasNext()) {
					Employee e=li.next();
					if(e.getempno() == empno) {
						System.out.print("Enter new Name:--");
						empname=s1.nextLine();
						System.out.print("enter new empRole:--");
						emprole=s1.nextLine();
						System.out.print("Enter new empsalary:--");
						empsal=s.nextInt();
						li.set(new Employee(empno,empname,emprole,empsal));
						found=true;
					}
				}
				if (!found) {
					System.out.println("Record is not found");
				}
				else {
					System.out.println("Record is updated");
				}
				System.out.println("----------------------------");
			break;
			}
		}while(ch !=0);
			

		}}

	

