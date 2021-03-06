package homework8;

import java.util.ArrayList;
import java.util.HashMap;

public class Frequency
{
	public static HashMap<String, Integer> frequency (ArrayList<String> anArray) {
			
		var aMap = new HashMap<String, Integer>();
		for (String element: anArray) {
			aMap.put(element, aMap.getOrDefault(element, 0) + 1);
//			if (aMap.containsKey(element)) {
//				aMap.put(element, aMap.get(element) + 1);
//			} else {
//				aMap.put(element, 1);
//			}
		}
	
		return aMap;
	}
	
	public static void main(String[] args)
	{
		var arr = new ArrayList<String>();
		arr.add("a");
		arr.add("n");
		arr.add("g");
		arr.add("a");
		arr.add("g");
		System.out.println(frequency(arr));
		
	}
}
