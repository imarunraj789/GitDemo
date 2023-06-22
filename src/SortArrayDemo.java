
public class SortArrayDemo {
	
	//Sort the Array in Ascending and Descending Order

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {2,6,1,4,9};
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		for(Object obj : a)
		{
			System.out.println(obj);
		}

	}

}
