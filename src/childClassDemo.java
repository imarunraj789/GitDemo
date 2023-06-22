
public class childClassDemo extends parentClassDemo{
	
	public void audioSystems()
	{
		System.out.println("Audio Systems Code is implemented from Child Class");
	}
	
	public void engine() 
	{
		System.out.println("Engine Code is implemented");
		
	}
	
	public void color()
	{
		System.out.println(color);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		childClassDemo ccd = new childClassDemo();
		ccd.color();
		ccd.audioSystems();
		ccd.brakes();
		ccd.engine();
		ccd.gear();
		ccd.gear();

	}

}
