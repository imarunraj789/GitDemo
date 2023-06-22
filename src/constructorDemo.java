
public class constructorDemo {
	//Constructor will not return any value
	//Name of constructor should be the class name
	//Default
	public constructorDemo()
	{
		System.out.println("I am in the constructor");
		System.out.println("I am in the constructor lecture 1");
	}
	
	//Parameterized Constructor
	public constructorDemo(int a, int b)
	{
		System.out.println("I am in the parameterized constructor "+a+" and "+b);
	}
	
	public constructorDemo(String str)
	{
		System.out.println(str);
	}
	
	public void getData()
	{
		System.out.println("I am the method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//whenever we create object for a class, constructor is called and block of code is executed in constructor
		constructorDemo cd = new constructorDemo();
		constructorDemo cdn = new constructorDemo(4,5);
		constructorDemo cds = new constructorDemo("Hello Contructor");
		cd.getData();
		

	}

}
