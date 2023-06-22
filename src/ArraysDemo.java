
public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int a=4;
		//Array is a container which stores multiple values of same data type
		
		int a[] = new int[5]; //declare an array and allocates memory for the varialble
		a[0]=2;
		a[1]=3;
		a[2]=4;
		a[3]=5;
		a[4]=6; //initialized values into array
		
		int b[] = {1,5,7,8,9};
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" and "+b[i]);
		}

				

	}

}
