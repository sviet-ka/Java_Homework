package homework8;

import java.util.ArrayList;
import java.util.HashSet;

public class DoesArrayHaveDuplicates
{
	public static boolean thereAreDuplicates (ArrayList<String> anArray) {
		
		HashSet<String> aSet = new HashSet<String>();
		
		for (String element: anArray) {
			aSet.add(element);
		}
		
		return aSet.size() != anArray.size();
		
		
	}
	
	
	
	
	public static void main(String[] args)
	{
		var testArray = new ArrayList<String>();
		testArray.add("5");
		testArray.add("4");
		testArray.add("2");
		testArray.add("1");
		System.out.println(thereAreDuplicates(testArray));
	}

}
