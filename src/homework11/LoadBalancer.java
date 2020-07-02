package homework11;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class LoadBalancer
{
	private Map<Character, Integer> map;
	private Set<Character> keys;
	private int range = 0;
	
	public LoadBalancer(HashMap<Character, Integer> servers)
	{
		this.map = servers;
		keys = map.keySet();
	}
	
	public void convertValueToRanges() 
	{
		for(Character key: keys)
		{
			range = range + map.get(key);
			map.put(key, range);
		}
		System.out.println("Range:" + range);
	}	
	
	public char getServer()
	{
		Random rand = new Random();
		int random = rand.nextInt(range) + 1;
		Character server = null;
		for (Character key: keys)
		{
			if (random <= map.get(key))
			{
				server = key;
				break;
			} 
			
		}
		return server;
	}
}
