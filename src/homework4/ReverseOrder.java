package homework4;

public class ReverseOrder
{
	public static void main(String[] args)
	{
		String str = "I like Java";
		String[] phrase = str.split(" ");
		for (int i = phrase.length - 1; i >= 0; i--) {
			System.out.print(phrase[i] + " ");
			
			//String str = "I like learning Java";
			//String reverse = "";
			
			//String[] words = str.split(" ");
			//for (String word: words)
				//reverse = word + " " + reverse;
			//System.out.println(reverse.trim()); //we use trim() to delete an extra space after the phrase
		}
	}
}
