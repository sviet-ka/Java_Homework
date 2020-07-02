package homework4;
public class Factorial
{
	// using of recursive function
	public int factorial(int n)
	{
		if (n == 1)
		{
			return 1;
		}
		else
		{
			return (n * factorial(n - 1));
		}
	}

	public static void main(String[] args)
	{
		int n = 5;
		//int fact = 1;
		//int sum = 0;
		//for (int i = 1; i <= n; i++) {
		//fact *= i;
		//sum += i;
		Factorial f = new Factorial();
		System.out.println(f.factorial(n));
	}
	//System.out.println(fact);
	//System.out.println(sum);
}
