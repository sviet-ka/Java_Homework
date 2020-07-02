package homework5;

public class Employee extends Person
{
	private double salary;
	private String company;
	
	public Employee (String aName, double aSalary, String aCompany) {
		super(aName);
		this.salary = aSalary;
		this.company = aCompany;
	}

	public double getSalary()
	{
		return salary;
	}

	public void setSalary(double salary)
	{
		this.salary = salary;
	}

	public String getCompany()
	{
		return company;
	}

	public void setCompany(String company)
	{
		this.company = company;
	}
	
	public void printSalary() {
		System.out.println("Salary of the employee is " + salary);
	}
	
	public void printCompany() {
		System.out.println("Company of the employee is " + company);
	}
}
