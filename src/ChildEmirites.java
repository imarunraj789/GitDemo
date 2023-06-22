
public class ChildEmirites extends ParentAircraft{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildEmirites ce = new ChildEmirites();
		ce.engine();
		ce.safetyGuidelines();
		ce.bodyColor();
		
		//Cannot instantiate Abstract Class
		//ParentAircraft pa = new ParentAircraft();
	}

	@Override
	public void bodyColor() {
		// TODO Auto-generated method stub
		System.out.println("Red color on the aircraft");
		
	}

}
