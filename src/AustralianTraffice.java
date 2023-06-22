import demoPack.CentralTraffice;
import demoPack.ContinentalTraffice;

public class AustralianTraffice implements CentralTraffice, ContinentalTraffice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CentralTraffice a = new AustralianTraffice();
		a.greenGo();
		a.redStop();
		a.flashingYelloWait();
		
		AustralianTraffice at = new AustralianTraffice();
		at.walkOnSymbol();
		
		ContinentalTraffice ct = new AustralianTraffice();
		ct.trainSymbol();
		

	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("greenGo Implementation");
		
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("redStop Implementation");
		
	}

	@Override
	public void flashingYelloWait() {
		// TODO Auto-generated method stub
		System.out.println("flashingYelloWait Implementation");
		
	}
	
	public void walkOnSymbol()
	{
		System.out.println("Walking On Symbol");
	}

	@Override
	public void trainSymbol() {
		// TODO Auto-generated method stub
		System.out.println("trainSymbol Implementation");
		
	}
	

}
