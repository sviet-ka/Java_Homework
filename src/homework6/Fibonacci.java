package homework6;

public class Fibonacci
{
	public static void main(String[] args)
	{  
		Fibonacci.printFib(10);
	/*
		System.out.println(0);
		System.out.println(1);
		
		int n = 10;
		int i = 0;
		int f0 = 0;
		int f1 = 1;
		int f2 = f0 + f1;
		while (i < n - 2) {
            f2 = f0 + f1;
			System.out.println(f2);
			i++;
			f0 = f1;
			f1 = f2;
		}
		*/
	}
	 
	public static void printFib(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.println(Fibonacci.fib(i));
		}
	}
	
	public static int fib(int n) {
		if (n == 1) {
			return 0;
		} else if (n == 2) {
			return 1;
		} else {
			return Fibonacci.fib(n - 2) + Fibonacci.fib(n - 1);
		}
	}

}
