import java.util.ArrayList;

public class arrayListExample {
	
	//List can accept duplicate values
	//ArrayList, LinkedList, Vector - These are classes which implements List interface
	//Array have Fixed size and Where as ArrayList can grow dynamically
	//you can access and insert any value in any index

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("Rahul");
		a.add("Java");
		a.add("Rahul");
		System.out.println(a);
		a.add(1, "Shetty");
		System.out.println(a);
		a.add(2, "academy");
		System.out.println(a);
		a.remove(2);
		System.out.println(a);
		a.add("ToBeRemoved");
		System.out.println(a);
		a.remove("ToBeRemoved");
		System.out.println(a);
		
		//Getting a specific index value from ArrayList
		System.out.println(a.get(1));
		
		//Checking a value in ArrayList
		System.out.println(a.contains("testing"));
		System.out.println(a.contains("Java"));
		
		//Getting the index of a specific value from the ArrayList
		System.out.println(a.indexOf("Shetty"));
		
		//Check with ArrayList is empty or not
		System.out.println(a.isEmpty());
		
		//Check the size of ArrayList
		System.out.println(a.size());
		

	}

}
