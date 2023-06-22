import java.util.ArrayList;
public class UniqueNumberInArray {
//	Eliminate duplicates and print Unique Number in the Array
//  Print Unique Number in ArrayList - Amazon

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {4,5,5,5,4,6,6,9,4};
		ArrayList<Integer> ab = new ArrayList<Integer>();
		
		//4 - 3 times
		//5 - 3 times
		//6 - 2 times
		//9 - 1 time
		
		for(int i=0;i<a.length;i++)
		{
			int k=0;
			if(!ab.contains(a[i]))
			{
				ab.add(a[i]);
				k++;
				for(int j=i+1;j<a.length;j++)
				{
					
					if(a[i]==a[j])
					{
						k++;
					}
				}
				System.out.println(a[i]+" is produced "+k+" times");
				if(k==1)
				{
					System.out.println(a[i]+" is Unique Number");
				}
			}
			
		}

	}

}
