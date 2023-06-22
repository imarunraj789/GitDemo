
public class NestedForLoop4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=1;
		for(int i=1;i<4;i++)
		{
			//System.out.println("Outter Loop Started");
			
			for(int j=1;j<=i;j++)
			{
				
				System.out.print(k*3);
				System.out.print("\t");
				k++;
				
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
