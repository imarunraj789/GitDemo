//Abstraction classes achieves Partial Abstraction
//Interfaces on the other hand are used for 100% Abstraction

//If there is any method in class which is Abstract, then the class will be treated as Abstract Class

//Unlike Interfaces, this Abstract Class can have Methods(Concreate) which have implementations as well, So, with Abstract class only particla Abstraction is achieved

public abstract class ParentAircraft {
	
	public void engine()
	{
		System.out.println("Follow Engine Guidelines");
	}
	
	
	//private access modified cannot be given in Abstract Class
	//can have only public or protected
	public void safetyGuidelines()
	{
		System.out.println("Follow Safety Guidelines");
	}
	
	//If method is having without having body or implementation is called as Abstract method
	// bodyColor() method is an Abstract method
	public abstract void bodyColor();

}
