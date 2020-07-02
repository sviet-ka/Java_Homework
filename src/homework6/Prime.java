package homework6;

public class Prime
{
	public boolean isPrime (int number) {
		if (number <= 1) {
			return false;
		}
		int count = 0;
		for (int i = 2; i < number / 2; i++) {
			if (number % i == 0) {
				count++;
			}
		}
		return count == 0;
	}
	
	public static void main(String[] args)
	{
		Prime n = new Prime();
		for (int i = 1; i <= 100; i++) {
			if (n.isPrime(i)) {
				System.out.println(i);
			}
		}
	}
}
