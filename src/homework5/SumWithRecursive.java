package homework5;

public class SumWithRecursive
{
	public int sum (int n) {
		if (n == 0) {
			return 0;
		} else {
			return n + sum(n - 1);
		}
	}
	
	public static void main(String[] args)
	{
		int n = 3;
		SumWithRecursive s = new SumWithRecursive();
		System.out.println(s.sum(n));
	}
}