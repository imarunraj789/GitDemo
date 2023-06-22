
public class exceptionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int b=7;
		int c=0;
		
		try
		{
			//int k = b/c;
			int arr[]= {1,2,3,4,5};

			System.out.println(arr[5]);

			
		}
		catch(ArithmeticException ae)
		{
			System.out.println("I catched the Arithmetic Exception Error");
		}
		catch(IndexOutOfBoundsException iobe)
		{
			System.out.println("I catched the IndexO Out of bounds exception error");
		}
		
		catch(Exception e)
		{
			System.out.println("I catched the error/exception");
		}
		
		finally
		{
			//This block is executed irrespective of exception thrown or not
			System.out.println("Delete cookies\n");
			
			//It will not be executed when JVM is stopped forcibly.
		}
		
		
		

	}

}
