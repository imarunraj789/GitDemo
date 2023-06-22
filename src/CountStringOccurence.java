
public class CountStringOccurence {

//	Count Number of Occurence of Characters
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = countOccurences("aaandjsas",'s');
		System.out.println("Number of occurences : "+count);

	}

	public static int countOccurences(String word, char character) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=0;i<word.length();i++)
		{
			if(word.charAt(i)==character)
			{
				count++;
			}
		}
		return count;
	}

}
