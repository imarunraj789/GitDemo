
public class childLevel extends childClassDemo{

	//function overloading
	//Either Argument count should be different or
	//Argument return type should be different
	
	
	public void getData(int a)
	{
		System.out.println(a);
	}
	
	public void getData(int a,int b)
	{
		System.out.println(a +" and "+ b);
	}
	
	public void getData(String a)
	{
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childLevel cl = new childLevel();
		cl.getData(5);
		cl.getData("Hello");
		cl.getData(6, 7);
		

	}

}
