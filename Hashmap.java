import java.util.HashMap;
import java.util.Map;
public class Hashmap {
public static void main(String[] args)
{
	Map<Character,Integer>map=new HashMap<>();
	map.put('A',1);
	map.put('B',2);
	map.put('C',1);
	map.put('D',4);
	for(Map.Entry<Character,Integer>m:map.entrySet())
	{
		System.out.println(m.getKey()+"------>"+m.getValue());
	}
}
}
