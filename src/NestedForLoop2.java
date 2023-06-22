
public class NestedForLoop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=1;
		for(int i=0;i<4;i++)
		{
			//System.out.println("Outter Loop Started");
			
			for(int j=0;j<=i;j++)
			{
				
				System.out.print(k);
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
