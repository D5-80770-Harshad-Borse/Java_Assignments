import java.util.*;
class  EmployeeTest{
	private String firstName;
    private String lastName;
    private double salary;

    public EmployeeTest(String firstName, String lastName, double salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
    public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary() {
		Scanner sc = new Scanner(System.in);
		boolean Exit = false;
		System.out.println("Enter Salary");
		double sal = 0;
		do {
			sal = sc.nextDouble();
		if(sal >= 0) {
		this.salary = sal;
		Exit = true;
		}
		else
			System.out.println("Please Enter Valid Number");
	}while(!Exit);
	}
	public void raiseSal() {
		this.salary = this.salary+(this.salary*0.1);
	}

}
public class Q2 {
    public static void main(String[] args){
    	EmployeeTest e1 = new EmployeeTest("Harshad", "Borse", 12000);
    	EmployeeTest e2 = new EmployeeTest("Harshad", "Patil", 15000);
    	System.out.println("Before Raise");
    	System.out.println("Employee Name : "+e1.getFirstName()+" "+e1.getLastName()+" ,"+"Salary : "+e1.getSalary());
    	System.out.println("Employee Name : "+e2.getFirstName()+" "+e2.getLastName()+" ,"+"Salary : "+e2.getSalary());
    	System.out.println("After Raise");
    	e1.raiseSal();
    	e2.raiseSal();
    	System.out.println("Employee Name : "+e1.getFirstName()+" "+e1.getLastName()+" ,"+"Salary : "+e1.getSalary());
    	System.out.println("Employee Name : "+e2.getFirstName()+" "+e2.getLastName()+" ,"+"Salary : "+e2.getSalary());
    	e1.setSalary();
    	System.out.println(e1.getSalary());
    }
}
