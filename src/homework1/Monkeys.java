package homework1;

public class Monkeys
{
	public boolean monkeyTrouble (boolean aSmile, boolean bSmile)	
	{
	
		return (
				(aSmile == true && bSmile == true) ||
				(aSmile == false && bSmile == false)
		);
	}
	public static void main(String[] args)
	{
		boolean aSmile = true;
		boolean bSmile = false;
		Monkeys m = new Monkeys();
		System.out.println(m.monkeyTrouble(aSmile, bSmile) ? "we have a problem" : "we do not have a problem" );
		/*if ( m.monkeyTrouble(aSmile, bSmile) == true) {
			System.out.println("we have a problem");
		} else {
			System.out.println("we do not have a problem");
		}
		*/
		
	}
}
