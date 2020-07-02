package homework5;

public class TestEmployeeInfo
{
	public static void main(String[] args)
	{
		var person = new QAEngineer("Svetlana Gorbunova", 100, "ITSM", 50);
		person.printName();
		person.printSalary();
		person.printCompany();
		person.printSignInBonus();
	}
}
