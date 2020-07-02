package homework3;

public class Initials
{
	public static void main(String[] args)
	{
		String name = "Svetlana Gorbunova";
		
		int indexOfSecondCapital = name.indexOf(' ') + 1;
		
	//	System.out.println(String.valueOf(name.charAt(0)) + String.valueOf(name.charAt(indexOfSecondCapital)));
		
		System.out.println("" + name.charAt(0) + name.charAt(indexOfSecondCapital));
		
	}
}
