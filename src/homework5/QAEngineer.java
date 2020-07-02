package homework5;

public class QAEngineer extends Employee
{
	private double signInBonus;
	
	public QAEngineer (String aName, double aSalary, String aCompany, double aSignInBonus) {
		super(aName, aSalary,aCompany);
		this.signInBonus = aSignInBonus;
	}

	public double getSignInBonus()
	{
		return signInBonus;
	}

	public void setSignInBonus(double signInBonus)
	{
		this.signInBonus = signInBonus;
	}
	
	public void printSignInBonus () {
		System.out.println("Sign-in bonus of the employee is " + signInBonus);
	}
}
