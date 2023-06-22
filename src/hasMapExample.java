import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class hasMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HashMap is Non Synchronized
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(0, "Hello");
		hm.put(1, "GoodBye");
		hm.put(2, "Morning");
		hm.put(3, "Evening");
		
		System.out.println(hm.get(2));
		
		hm.remove(2);
		
		System.out.println(hm.get(2));
		Set sn = hm.entrySet();
		Iterator i = sn.iterator();
		
		//Interview Question: HashMap and Pass the HashTable to Set and get me Key and Value?
		
		while(i.hasNext())
		{
			Map.Entry mp = (Map.Entry)i.next();
			System.out.println("Key : "+mp.getKey());
			System.out.println("Value : "+mp.getValue());
		}
		

	}

}
