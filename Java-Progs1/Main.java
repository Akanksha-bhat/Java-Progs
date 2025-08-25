package source;
	public class Main {
	public static void main(String[] args)
	{
	//new employee creation
	Employee e1=new Employee("ravi" ,101,10000.0d);
	Employee e2=new Employee("raj" ,102,20000.0d);
	System.out.println("Initial employee details are");
	//display details
	e1.display();
	e2.display();
	//increase salary
	e1.increasesalary(0.1);
	e2.increasesalary(0.2);
	System.out.println("updated employee details are");
	//display updated salary
	e1.display();
	e2.display();
	}
	}
