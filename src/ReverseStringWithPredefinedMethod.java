
public class ReverseStringWithPredefinedMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "madam";
		
		StringBuilder input = new StringBuilder();
		input.append(s);
		StringBuilder t = input.reverse();
		String tb = t.toString();

		
		System.out.println(t);
		
		if(s.equalsIgnoreCase(tb))
		{
			System.out.println(s+" is a Palindrome");
		}
		else
		{
			System.out.println(s+" is NOT a Palindrome");
		}
		


		

	}

}