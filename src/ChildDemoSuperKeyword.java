
public class ChildDemoSuperKeyword extends ParentDemoSuperKeyword{
	
	String name = "String From Child Class";
	
	public ChildDemoSuperKeyword()
	{
		super(); //this super constructor always be at first step
		System.out.println("Child Class Constructor");
	}
	
	public void getStringData()
	{
		
		System.out.println(super.name);
		System.out.println(name);
		
	}
	
	public void getData()
	{
		super.getData();
		System.out.println("I'm from Child Class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildDemoSuperKeyword cd = new ChildDemoSuperKeyword();
		cd.getStringData();
		cd.getData();

	}

}
