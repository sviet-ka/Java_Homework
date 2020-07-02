package homework7;

public class TheSecondMinNumber
{
	public static void main(String[] args)
	{
		int[] numbers = {1, 2, 3, 4};
		int min = numbers[0];
		int secMin = numbers[1];
		int temp;
		if (secMin < min) {
			temp = secMin;
			secMin = min;
			min = temp;
		}
		for (int i = 2; i < numbers.length; i++) {
			if (numbers[i] < min) {
				secMin = min;
				min = numbers[i];
			} else if (numbers[i] < secMin) {
				secMin = numbers[i];
			}
		}
		System.out.println(secMin);
}
}
