
import java.util.HashSet;
import java.util.Iterator;

public class hasSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HashSet, TreeSet, LinkedHashSet  - These classes implements Set interface
		//Does NOT accept duplicate values
		//There is NO guarantee elements stored in sequential order... Random order
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("USA");
		hs.add("UK");
		hs.add("INDIA");
		hs.add("he");
		hs.add("she");
		hs.add("INDIA"); //2nd Time INDIA will not be printed. does not accept duplicates
		System.out.println(hs);
//		System.out.println(hs.remove("UK"));
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		System.out.println(hs);
		
		Iterator<String> i = hs.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

		

	}

}
