package homework11;

import java.util.HashMap;

public class TestServerBalancing
{
	public static void main(String[] args)
	{
		var servers = new HashMap<Character, Integer>();
		servers.put('X', 3);
		servers.put('Y', 1);
		servers.put('Z', 1);
		
		var balancer = new LoadBalancer(servers);
		balancer.convertValueToRanges();
		for (int i = 1; i <= 100; i++)
		{
			System.out.print(balancer.getServer());
		}
	}
}
// x = 3, y = 4, z = 5;