package homework3;

public class Swopping
{
	public static void main(String[] args)
	{
		int a = 24;
		int b = 67;
		
		b = a + b;
		a = b - a;
		b = b - a;
		
		System.out.println(a);
		System.out.println(b);
		
	}
}

