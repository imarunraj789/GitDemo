
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int val=37;
		boolean flag=false;
		for(int i=2;i<val/2;i++)
		{
			if(val%i==0)
			{
				flag=true;
				break;
			}
			
		}
		if(flag)
		{
			System.out.println(val+" is NOT a PRIME Number");
		}
		else
			System.out.println(val+" is a PRIME Number");
			

	}

}
