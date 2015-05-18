import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;


public class TestGit {
	public static void main(String[] args) {
	
		TreeMap<Integer, String> hm=new TreeMap<Integer, String>();
		hm.put(1, "Chun");
		hm.put(2, "Jerry");
		hm.put(5, "Terry");
		hm.put(4,"Jack");
		hm.put(3,"Rose");
		for(Integer key:hm.keySet())
		{
			System.out.println(key);
			
		}
		for(String value:hm.values())
		{
			System.out.println(value);
		}
		
	}
}
