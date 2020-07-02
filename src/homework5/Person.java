package homework5;

public class Person
{
	private String name;
	
	public Person(String aName) {
		this.name = aName;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	
	public void printName () {
		System.out.println("Name of the employee is " + name);
	}
}
