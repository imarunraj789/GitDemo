
public class StaticVar {
	
	
	String name; //Instance variables
	String address;//Instance variables
	static String city; //Class Variables
	static int i;
	
	//Static block to initialize static variables at one place
	static {
		city = "Chennai";
		i=0;
	}
	
	public StaticVar(String name, String address) //Local Variables
	{
		this.name = name;
		this.address = address;
		i++;
		System.out.println(i);

	}
	
	public void getData()
	{
		System.out.println(name);
		System.out.println(address);
		System.out.println(city);
	}
	
	public static void getCity()
	{
		System.out.println(city);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticVar obj = new StaticVar("Vijay","Velachery");
		StaticVar obj1 = new StaticVar("Sethu","Siruseri");
		obj.getData();
		obj1.getData();
		StaticVar.getCity();
		StaticVar.i=5;
		StaticVar obj2 = new StaticVar("Arun","Siruseri");		
		

	}

}
