package homework7;

public class Palindrome
{
	/*public static void main(String[] args)
	{
		String s = "madam";
		int count = 0;
		for (int i = 0; i < (s.length() - s.length() % 2) / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
				count++;
				break;
			}
		}
		System.out.println((count == 0) ? "the word is a palindrome" : "the word is not a palindrom");
		

	}*/

		public boolean isPalindrome(String str)
		{
	//convert to lower case and remove spaces
			str = str.toLowerCase();
			String[] words = str.split(" ");
			var pal = "";
			for (String word: words)
				pal += word;
			System.out.println(pal);
			
			int halfLength = pal.length() / 2;
			for (var i = 0; i < halfLength; i++)
				if(pal.charAt(i) != pal.charAt(pal.length()- 1 - i))
				    return false;
			   return true;
		}
		public static void main(String[] args)
		{
			var palindrome = "Niagara o roar again";
			Palindrome p = new Palindrome();
			if (p.isPalindrome(palindrome))
				System.out.println("Is a palindrome");
			else
				System.out.println("Not a palindrome");
		}
	}


