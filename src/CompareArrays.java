import java.util.*;
public class CompareArrays {
	
	//Compare same indexes of 2 different arrays and create another array for matching values

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,4,5,7};
		int b[]= {6,4,3,7};
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==b[i])
			{
				//write code to create another array
				al.add(a[i]);				
			}
		}
		System.out.println(al);
		Object[] comp = al.toArray();
		
		for(Object obj : comp)
		{
			System.out.println(obj);
		}
		

	}

}
