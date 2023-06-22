
public class InterviewMinNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int abc[][] = {{2,4,5},{3,0,7},{1,8,9}};
		int min = abc[0][0];
		int max = abc[0][0];
		int minColumn = 0;
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				
				if(abc[i][j]<min)
				{
					min = abc[i][j];
					minColumn = j;
					
					//identify the Row number
					System.out.println("Row Number : "+i);
					
					//identify the column number of minimum number
					System.out.println("Column Number : "+minColumn);
					
					//identify the max number from the identified column number
					
				}
				
				else if (abc[i][j]>max)
				{
					max = abc[i][j];
				}

			}

		}
		
		int maxFromMinColumn = abc[0][minColumn];
		int k=0;
		
		while (k<3)
		{
			if(abc[k][minColumn]>maxFromMinColumn)
			{
				maxFromMinColumn = abc[k][minColumn];
			}
			k++;
		}
		
		System.out.println("Smallest number is : "+min);
		System.out.println("Largerst number is : "+max);
		System.out.println("Max Number from Min Number Column is : "+maxFromMinColumn);


	}

}
