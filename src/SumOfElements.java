
public class SumOfElements {
	
	//Create a Method which accepts Array and returns sum of all the elements in array

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,2,3,4,5};
		
		int sum = sumArray(a);
		System.out.println(sum);

	//Print 5 multiplication table without using Multiply Operator
		int result = multiply(5,10);
		System.out.println(result);

	}

	public static int multiply(int i, int j) {
		// TODO Auto-generated method stub
		
		int result=0;
		int k=1;
		while(k<=j)
		{
			result = result+i;
			k++;
		}
		return result;
	}

	public static int sumArray(int[] a) {
		// TODO Auto-generated method stub
		
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum = sum + a[i];
		}
		return sum;
	}

}
