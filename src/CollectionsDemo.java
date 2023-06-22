import java.util.*;

public class CollectionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {9,4,5,5,5,4,6,6,4,3};
		
		//Print unique number from the list - Amazon
		
		ArrayList<Integer> ab = new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			int k=0;
			if(!ab.contains(a[i]))
			{
				ab.add(a[i]);
				k++;
				for(int j=i+1;j<a.length;j++)
				{
					if(a[j]==a[i])
					{
						k++;
					}
				}
				System.out.println("Value : "+a[i]);
				System.out.println("Number of Times : "+k);
				if(k==1)
				{
					System.out.println("Unique Number is : "+a[i]);
				}
			}
		}
		

	}

}
