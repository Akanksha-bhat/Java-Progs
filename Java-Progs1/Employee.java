package source;

public class Employee {
	String name;
	int id;
	double salary;
     public Employee(String n,int d,double sal)
	{
	name=n;
	id=d;
	salary=sal;
	}
	void displayDetails()
	{
	System.out.println("Employee details are");
	System.out.println("Name: " +name);
	System.out.println("Employee Id: " +id);
	System.out.println("Salary: "+salary);
	}
	void increaseSalary(double percentage)
	{
	double increment=(salary*percentage)/100;
	salary=salary+increment;
	System.out.println("Employee salary increases by"+salary+"%");
	}
}
