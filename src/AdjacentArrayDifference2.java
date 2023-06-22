
public class AdjacentArrayDifference2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Max difference between any adjacent index in array
		int[] a = {4,1,2,5,1}; //3,4,7,2
		int diff = 0;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i+1]-a[i]<0)
			{
				int temp = a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			}
			
			if(a[i+1]-a[i]>diff)
			{
				diff=a[i+1]-a[i];
			}
		}
		System.out.println(diff);

	}

}
