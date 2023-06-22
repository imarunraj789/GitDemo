import java.util.*;
import java.util.*;


public class hasTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HashTable is Thread Safe.
		//Can NOT have Key as Null and Value as Null
		//Enumerator (NOT Iterator)
		
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		
		
		ht.put(0, "Hello");
		ht.put(1, "GoodBye");
		ht.put(2, "Morning");
		ht.put(3, "Evening");
		
		System.out.println(ht.get(2));
		
		ht.remove(2);
		
		System.out.println(ht.get(2));
		Set sn = ht.entrySet();
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
