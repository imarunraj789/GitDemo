
public class NestedForLoop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<5;i++)
		{
			//System.out.println("Outter Loop Started");
			
			for(int j=1;j<=i;j++)
			{
				
				System.out.print(j);
				System.out.print("\t");
				
			}
			
			System.out.println("");
		}

	}

}

/*1
2 3
4 5 6
7 8 9 10
*/