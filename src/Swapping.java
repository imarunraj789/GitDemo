
public class Swapping {

	//Swapping the variables with and without using temp variable
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Swap with temp variable
		int a=4;
		int b=5;
		System.out.println(a);
		System.out.println(b);
		System.out.println("After Swapping with Temp Variable");
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println(a);
		System.out.println(b);
		
		//Swap without temp variable
		System.out.println("After Swapping without Temp Variable");
		
		int i=10;
		int j=15;
		
		i=i+j;
		j=i-j;
		i=i-j;
		System.out.println(i);
		System.out.println(j);
		

	}

}
