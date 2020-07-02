package homework3;

public class EvenOrOdd
{
	public boolean isEven(int number)
	{
		return (number % 2 == 0); // if even
	}
	public static void main(String[] args)
	{
		int number = 12;
		
		EvenOrOdd n = new EvenOrOdd();
		if (n.isEven(number))
			System.out.println("The number is even");
		else
			System.out.println("The number is odd");
		
	}
}
