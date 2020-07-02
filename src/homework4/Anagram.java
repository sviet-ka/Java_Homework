package homework4;

import java.util.Arrays;

public class Anagram
{
	public boolean isAnagram(String str1, String str2) {
		char[] phrase1 = str1.toLowerCase().toCharArray();
		Arrays.sort(phrase1);
		char[] phrase2 = str2.toLowerCase().toCharArray();
		Arrays.sort(phrase2);
		return String.valueOf(phrase1).equals(String.valueOf(phrase2));
		
		//  if (Arrays.equals(phrase1, phrase2))
		//		return true;
		//	else return false;
	}
	
	
	public static void main(String[] args)
	{
		Anagram sentences = new Anagram();
		boolean result = sentences.isAnagram("Debit card", "Bad credit");
		System.out.println(result);
	}
}
