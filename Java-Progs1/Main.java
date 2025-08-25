package Employee;
	public class Main {
	public static void main(String[] args)
	{
	//new employee creation
	Employee e1=new Employee("Ayra" ,101,10000);
	Employee e2=new Employee("Avika" ,102,20000);
	System.out.println("Initial employee details are");
	//display details
	e1.displayDetails();
	e2.displayDetails();
	//increase salary
	e1.increaseSalary(0.1);
	e2.increaseSalary(0.2);
	System.out.println("Updated employee details are");
	//display updated salary
	e1.displayDetails();
	e2.displayDetails();
	}
}
