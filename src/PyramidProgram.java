
public class PyramidProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Program for Printing Pyramid Patter in Java
//
//		*
//		*	*
//		*	*	*
//		*	*	*	*
		
		for(int i=1; i<5;i++) //Outer loop for printing 4 loops
		{
			for(int j=1;j<=i;j++) //take care of the logic to print the right format
			{
				System.out.print("*");
				System.out.print("\t");
				
			}
			System.out.println();
		}
		
		for(int i=3; i>1;i--) //Outer loop for printing 4 loops
		{
			for(int j=1;j<=i;j++) //take care of the logic to print the right format
			{
				System.out.print("*");
				System.out.print("\t");
				
			}
			System.out.println();
		}

	}

}
