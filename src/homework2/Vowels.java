package homework2;

public class Vowels
{
	public void vowels (char ch)
	{
		switch(ch) {
			case 'a', 'e', 'i', 'o', 'u' -> System.out.println("vowel");
			case 'b', 'c', 'd', 'f', 'g', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'z', 'y' -> System.out.println("consonant");  
			default -> System.out.println("not an english letter");
		}
		
	}
	public static void main(String[] args)
	{
		Vowels v = new Vowels();
		v.vowels(')'); 
		char abc = '/';
		System.out.println(abc);
	}
}
               